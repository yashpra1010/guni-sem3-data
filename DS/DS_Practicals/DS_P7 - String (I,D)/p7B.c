#include<stdio.h>
int main()
{
char yash[20],i=0;
printf("Enter string:");
scanf("%s",yash);
while(yash[i]!='\0')
{
	if(yash[i]>='A' && yash[i]<='Z')
	{
		yash[i]=yash[i]+32;
	}
	i++;
}
printf("%s",yash);
return 0;
}