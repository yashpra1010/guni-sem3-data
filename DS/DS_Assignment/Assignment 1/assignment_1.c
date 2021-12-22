#include<stdio.h>
void reversearray(int prajapati[],int a)
{
	int i=0;
	printf("\nOUTPUT:\n");
	for(i=a-1;i>=0;i--)
	{
		printf("%d ", prajapati[i]);
	}
}
int main()
{
	printf("Name: Prajapati Yash P.\nBranch: BDA\nEnrollment No: 20162121023\n");
	int n,i;
	printf("\nEnter size of array: ");
	scanf("%d",&n);
	int yash[n];
	printf("Enter elements of array:\n");
	for(i=0;i<n;i++)
	{
		scanf("%d",&yash[i]);
	}
	reversearray(yash,n);
}