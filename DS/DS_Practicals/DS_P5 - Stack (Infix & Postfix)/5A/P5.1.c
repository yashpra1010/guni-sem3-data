#include<stdio.h>
#include<string.h>
#include<ctype.h>

void push(char element , char stack[] , int *top , int max) // FUNCTION TO PUSH ELEMENT IN ARRAY
{
	if(*top==max)
	{
		printf("OVERFLOW\n");
	}
	else
	{
		*top = *top +1;
		stack[*top]=element;
	}
}

void pop(char satck[] , int *top)// FUNCTION TO POP ELEMENT FROM ARRAY
{
	if(*top==0)
	{
		printf("UNDERFLOW\n");
	}
	else
	{
		*top = *top - 1;
	}
}

int precedence(char x)
{
	if(x=='(' || x==')')
	{
		return 0;
	}
	else if(x=='+' || x=='-')
	{
		return 1;
	}
	else if(x=='*' || x=='/')
	{
		return 2;
	}
}

void convert(char Stack[])
{
	int len = strlen(Stack);
	char ch , operator[10]; 
	int i , j=-1 , k;
	for(i=0 ; i<len ; ++i)
	{
		ch=Stack[i];
		if(isalnum(ch))
		{
			printf("%c",ch);	
		}
		else if(ch=='*' || ch=='/' || ch=='+' || ch=='-')
		{
			if(precedence(ch) > precedence(operator[j]) || j==-1)
			{
				push(ch , operator , &j , 10);
				//printf("operator pushed\n");
			}
			else
			{
				while(precedence(operator[j])>=precedence(ch))									
				{
					printf("%c",operator[j]);
					pop(operator , &j);
				}
				push(ch , operator , &j , 10);
			}
		}
		else if(ch=='(' || ch==')')
		{
			if(ch=='(')
			{	
				push(ch , operator , &j , 10);
			}
			else
			{
				//printf("Scanned )");
				while(operator[j] != '(')
				{
					if(operator[j] != '(')
						printf("%c",operator[j]);
					
					pop(operator , &j);
				}
			}
		}
		/*
		for(k=j ; k>=0 ; --k)
		{
			printf("%c",operator[k]);
		}
		printf("\n");*/
	}
	for(j ; j>=0 ; --j)
	{
		if(operator[j] != '(')
			printf("%c",operator[j]);
	}	
	/*
	
	while(j==-0)
	{
		printf("%c",operator[j]);
		pop(operator , &j);
	}
	*/
}

int main()
{
	char KRUPAL[20];
	printf("Enter the expression : ");
	scanf("%s",&KRUPAL);
	printf("\nOutput : ");
	convert(KRUPAL);
}
