#include <stdio.h>
#include <ctype.h>

char Yash[100];
int top = -1;
void push(char a)
{
	Yash[++top] = a;
}
char pop()
{
	if (top == -1)
	{
		return -1;
	}
	else
	{
		return Yash[top--];
	}
}
int priority(char a)
{
	if (a == '(')
	{
		return 0;
	}
	if (a == '+' || a == '-')
	{
		return 1;
	}
	if (a == '*' || a == '/')
	{
		return 2;
	}
	return 0;
}
int main()
{
	char arr[100];
	char *e, x;
	printf("Enter The Expression: ");
	scanf("%s", arr);
	e = arr;
	printf("Postfix Expression: ");
	while (*e != '\0')
	{
		if (isalnum(*e))
		printf("%c ", *e);
		else if (*e == '(')
		push(*e);
		else if (*e == ')')
		{
			while ((x = pop()) != '(')
			printf("%c ", x);
		}
		else
		{
			while (priority(Yash[top]) >= priority(*e))
			printf("%c ", pop());
			push(*e);
		}
		e++;
	}
	while (top != -1)
	{
		printf("%c ", pop());
	}
	printf("\n\n");
	return 0;
}