#include <stdio.h>
#include <stdlib.h>

int main()
{
	int size1, size2, size3, i, j = 0, k = 0, sum1 = 0, sum2 = 0, sum3 = 0;

	printf("Name: Yash Prajapati\nBranch: BDA\nEnrollment No: 20162121023\n");
	scanf("%d %d %d", &size1, &size2, &size3);

	int yash[size1];
	int prajapati[size2];
	int bda[size3];

	for (i = 0; i < size1; i++)
	{
		scanf("%d", &yash[i]);
		sum1 += yash[i];
	}
	for (i = 0; i < size2; i++)
	{
		scanf("%d", &prajapati[i]);
		sum2 += prajapati[i];
	}
	for (i = 0; i < size3; i++)
	{
		scanf("%d", &bda[i]);
		sum3 += bda[i];
	}
	i = 0;
	while (1)
	{
		if ((sum1 == sum2 && sum2 == sum3) || sum1 == 0 || sum2 == 0 || sum3 == 0)
			break;
		if (sum1 >= sum2 && sum1 >= sum3)
			sum1 -= yash[i++];
		else if (sum2 >= sum1 && sum2 >= sum3)
			sum2 -= prajapati[j++];
		else
			sum3 -= bda[k++];
	}
	if (sum1 == 0 || sum2 == 0 || sum3 == 0)
	{
		printf("0");
	}
	else
	{
		printf("%d\n", sum1);
	}
	return 0;
}