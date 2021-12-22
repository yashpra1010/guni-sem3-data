#include <stdio.h>
#include <stdlib.h>
void PrintArr(int arr[], int n)
{
	for (int i = 0; i < n; i++)
	{
		printf("%d ", arr[i]);
	}
}
void BubbleSort(int arr[], int n)
{
	int yash;
	for (int i = 0; i < n-1; i++)
	{
		for (int j = 0; j < n - i - 1; j++)
		{
			if (arr[j] > arr[j + 1])
			{
				yash = arr[j];
				arr[j] = arr[j + 1];
				arr[j + 1] = yash;
			}
		}
		printf("\nPass %d : ", i+1);
		PrintArr(arr, n);
	}
}
void InsertionSort(int arr[], int n)
{
	int i, yash, j;
	for (i = 1; i < n; i++)
	{
		yash = arr[i];
		j = i - 1;

		while (j >= 0 && arr[j] > yash)
		{
			arr[j + 1] = arr[j];
			j = j - 1;
		}
		arr[j + 1] = yash;
		printf("\nPass %d : ", i);
		PrintArr(arr, n);
	}
}

int main()
{
	int arr[20];
	int num, ch;

	printf("\nHow many number you want to sort: ");
	scanf("%d", &num);
	printf("\nEnter the Elements for Sorting: ");
	for (int i = 0; i < num; i++)
	{
		scanf("%d", &arr[i]);
	}
	printf("\n\nList of Sorting methods:\n1. Bubble Sort\n2. Insertion Sort\n3. Exit\n\nWhich choice do you want to apply? ");
	scanf("%d", &ch);
	switch (ch)
	{
	case 1:
		printf("\nBefore Bubble Sort : ");
		PrintArr(arr, num);
		printf("\n");
		BubbleSort(arr, num);
		printf("\n\nAfter Bubble Sort : ");
		PrintArr(arr, num);
		printf("\n");
		break;
	case 2:
		printf("\nBefore Insertion Sort : ");
		PrintArr(arr, num);
		printf("\n");
		InsertionSort(arr, num);
		printf("\n\nAfter Insertion Sort : ");
		PrintArr(arr, num);
		printf("\n");
		break;
	case 3:
		exit(0);
		break;

	default:
		break;
	}

	printf("\n");
	return 0;
}