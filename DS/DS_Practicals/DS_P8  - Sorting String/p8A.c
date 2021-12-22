#include<stdio.h>
#include<string.h>

int main()
{
	char yash[10][20] , temp[20];
	int n , i , j;

	printf("\nEnter the number of students: ");
	scanf("%d",&n);

	for(i=0 ; i<n ; ++i)
	{
		printf("\nEnter the name of student-%d: ", i+1);
		scanf("%s",&yash[i]);
	}

	for(i=0 ; i<n ; ++i)
	{
		for(j=0 ; j<n ; ++j)
		{
			if(strcmp(yash[i],yash[j]) < 0)
			{
				strcpy(temp,yash[j]);
				strcpy(yash[j],yash[i]);
				strcpy(yash[i],temp);
			}
		}
	}

	printf("\nStudent List as per alphabetical order: \n");
	for(i=0 ; i<n ; ++i)
	{
		printf("%s\n",yash[i]);
	}
	return 0;
}
