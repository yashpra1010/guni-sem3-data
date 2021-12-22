#include<stdio.h>
void fibonacci(int num)
{
	static int n1=0,n2=1,n3;
	if(num>0)
	{
		n3 = n1 + n2;
		n1 = n2;
		n2 = n3;
		printf("%d ",n3);
		fibonacci(num-1);
	}
}
int main()
{
	int yash;
	printf("Enter the number of elements: ");
	scanf("%d",&yash);
	
	printf("Fibonacci Series: ");
	printf("%d %d ",0,1);
	
	fibonacci(yash-2);
	
	return 0;
}