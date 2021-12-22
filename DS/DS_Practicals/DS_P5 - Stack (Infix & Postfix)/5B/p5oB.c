#include<stdio.h>
#include<ctype.h>

int Yash[20];
int top = -1;

void push(int x)
{
    Yash[++top] = x;
}

int pop()
{
    return Yash[top--];
}

int main()
{
    char arr[20];
    char *digit;
	int diff=48;
    int num1,num2,num3,num;
    printf("Enter the expression: ");
    scanf("%s",arr);
    digit = arr;
    while(*digit != '\0')
	{
        if(isdigit(*digit))
        {
			num = *digit - diff;
            push(num);
        }
        else
        {
            num1 = pop();
            num2 = pop();

            switch(*digit)
            {
            case '+':
            {
                num3 = num1 + num2;
                break;
            }
            case '-':
            {
                num3 = num2 - num1;
                break;
            }
            case '*':
            {
                num3 = num1 * num2;
                break;
            }
            case '/':
            {
                num3 = num2 / num1;
                break;
            }
            }
            push(num3);
        }
        digit++;
    }
    printf("\nThe result of expression %s = %d\n",arr,pop());
    return 0;
}
