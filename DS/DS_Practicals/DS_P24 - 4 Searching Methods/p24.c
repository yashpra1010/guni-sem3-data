#include <stdio.h>
#include <stdlib.h>
#include <math.h>

void Sort(int array[], int m)
{
	int i, j, k, temp;
	for (i = 0; i < m - 1; i++)
	{
		for (j = 0; j < m - i - 1; j++)
		{
			if (array[j] > array[j + 1])
			{
				temp = array[j];
				array[j] = array[j + 1];
				array[j + 1] = temp;
			}
		}
	}
}

void LinearSearch(int array[], int m, int v)
{
	int i, pos = -1;
	for (i = 0; i < m; i++)
	{
		if (array[i] == v)
		{
			pos = i;
			printf("\nElement %d fount at position %d", v, pos + 1);
			break;
		}
	}
	if (pos == -1)
	{
		printf("\nElement %d not found", v);
	}
}

void BinarySearch(int array[], int low, int high, int v)
{
	int beg = low, end = high, mid, pos = -1;
	while (beg <= end)
	{
		mid = (beg + end) / 2;
		if (array[mid] == v)
		{
			pos = mid;
			printf("\nElement %d fount at position %d", v, pos + 1);
			break;
		}
		else if (array[mid] > v)
		{
			end = mid - 1;
		}
		else
		{
			beg = mid + 1;
		}
	}
	if (pos == -1)
	{
		printf("\nElement %d not found", v);
	}
}

void InterpolationSearch(int array[], int low, int high, int v)
{
	int beg = low, end = high, mid, pos = -1;
	while (beg <= end)
	{
		mid = beg + (end - beg) * ((v - array[beg]) / (array[end] - array[beg]));
		if (array[mid] == v)
		{
			pos = mid;
			printf("\nElement %d fount at position %d", v, pos + 1);
			break;
		}
		else if (array[mid] > v)
		{
			end = mid - 1;
		}
		else
		{
			beg = mid + 1;
		}
	}
	if (pos == -1)
	{
		printf("\nElement %d not found", v);
	}
}
void JumpSearch(int array[], int low, int high, int v, int m)
{

	int step = sqrt(m), i = 0, beg = low, end = high, pos = -1;
	while (i < step)
	{
		if (v < array[step])
		{
			end = step - 1;
		}
		else
		{
			low = step + 1;
		}
		i = i + 1;
	}
	i = beg;
	while (i <= end)
	{
		if (array[i] == v)
		{
			pos = i;
			printf("\nElement %d fount at position %d", v, pos + 1);
			break;
		}
		i++;
	}
	if (pos == -1)
	{
		printf("\nElement %d not found", v);
	}
}
int main()
{
	int n, i;
	printf("\nEnter number of elements: ");
	scanf("%d", &n);
	printf("\nEnter %d elements: ", n);
	int yash[n];
	for (i = 0; i < n; i++)
	{
		scanf("%d", &yash[i]);
	}
	Sort(yash, n);
	int choice, value;
	do
	{
		printf("\n");
		printf("\nList of searchig methods:\n1. Linear Search \n2. Binary Search \n3. Interpolation Search \n4. Jump Search \n5. Exit\n");
		printf("\nWhich searching method would you like to apply? ");
		scanf("%d", &choice);
		switch (choice)
		{
		case 1:
			printf("\nThe elements of the array are: ");
			for (i = 0; i < n; i++)
			{
				printf("%d ", yash[i]);
			}
			printf("\n");
			printf("\nWhich value do you want search? ");
			scanf("%d", &value);
			LinearSearch(yash, n, value);
			break;
		case 2:
			printf("\nThe elements of the array are: ");
			for (i = 0; i < n; i++)
			{
				printf("%d ", yash[i]);
			}
			printf("\n");
			printf("\nWhich value do you want search? ");
			scanf("%d", &value);
			BinarySearch(yash, 0, n - 1, value);
			break;
		case 3:
			printf("\nThe elements of the array are: ");
			for (i = 0; i < n; i++)
			{
				printf("%d ", yash[i]);
			}
			printf("\n");
			printf("\nWhich value do you want search? ");
			scanf("%d", &value);
			InterpolationSearch(yash, 0, n - 1, value);
			break;
		case 4:
			printf("\nThe elements of the array are: ");
			for (i = 0; i < n; i++)
			{
				printf("%d ", yash[i]);
			}

			printf("\n");
			printf("\nWhich value do you want search? ");
			scanf("%d", &value);
			JumpSearch(yash, 0, n - 1, value, n);
			break;
		case 5:
		there:
			printf("\nExiting system.....");
			exit(0);
			break;
		default:
		here:
			printf("Enter valid choice\n");
			break;
		}
	} while (choice != 5);

	printf("\n");
	return 0;
}