#include<stdio.h>
#include<ctype.h>
#include<stdlib.h>
#include<string.h>
int Top=-1;
char YashPra[50];
int priority(char x)
{
	/*	
		Priority Table
		1. (
		2. * / %
		3. + -
	*/

	if(x=='(' || x==')')
	{
		return 1;
	}
	else if(x=='*' || x=='/' || x=='%')
	{
		return 2;
	}
	else if(x=='+' || x=='-')
	{
		return 3;
	}
	else
	{
		printf("\nINVALID...!!\n");
		exit(0);
	}
}
void Push()
{
	int x;
	if(Top==49)
	{
		printf("\nOverflow!\n");
	}
	else
	{
		//pass value to 'x' to PUSH
		Top=Top+1;
		YashPra[Top]=x;
	}
}
void Pop()
{
	if(Top==-1)
	{
		printf("\nEmpty!\n");
	}
	else
	{
		//printf("\nPopped number: %d",YashPra[Top]);
		Top=Top-1;
	}
}
	
int main()
{
	int i=0,len=0;
	printf("\nEnter Expression: ");
	gets(YashPra);
	len=strlen(YashPra);
	Top=len;
	while(i<len)
	{
		if(isalnum(YashPra[i]))
		{
			printf("%c",YashPra[i]);
		}
		else
		{
			int temp;
			temp=priority(YashPra[i]);
			//printf("%d",temp);
			if (temp=1)
			{
				//printf("%c",YashPra[i]);
				Pop();
			}
			else if(temp=2)
			{
				//printf("%c",YashPra[i]);
				Pop();
			}
			else if(temp=3)
			{
				//printf("%c",YashPra[i]);
				Pop();
			}
			else
			{
				printf("\n----| ERROR |----\n");
			}
		}
		i++;
	}
	
	return 0;
}