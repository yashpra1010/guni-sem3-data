#include <stdio.h>
#include <string.h>
int main()
{
	char yash[30], prajapati[30];
	int len=0 ,j=0;
	printf("Enter the String : ");
	scanf("%s",yash);

	len=strlen(yash);
	
	for(int i=len-1 ; i>=0 ; i--)
	{
		prajapati[j]=yash[i];
		j++;
	}
	prajapati[j]='\0';
	printf("\nReverse String: %s",prajapati);

	if (strcmp(yash, prajapati) == 0)
	{
		printf("\nResult: Same as original\n");
	}
	else
	{
		printf("\nResult: Not same as original\n");
	}
	return 0;
}