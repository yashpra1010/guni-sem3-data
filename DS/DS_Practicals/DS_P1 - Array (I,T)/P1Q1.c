//Question-1
/* //include header file
#include <stdio.h>
//inside main
int main()
{
	//declare array
	int arr[6];
	int i,LOC;
	int I=LOC+1;
	//assign these call values to an array element
	//traverse the element, variable i...comment, varible name meaningful
	//taking for loop,...i=1 to 6
 	printf("\nInitializing....\n");
	for (i = 0; i < 6; i++)
	{
		printf("Enter number of calls attended: ");
		scanf("%d",&arr[i]);
	}

	//print the element from the array arr[i+1]
	printf("\nEntered values are....\n");
	for (i = 0; i < 6; i++)
	{
		printf("\nDay-%d: %d",i+1,arr[i]);
	}
	LOC=i;
	while ()
	{
		
	}

	return 0;
} */

//Question-2

#include<stdio.h>
int main()
{
	int Day[6];
	int n=6 , location=6 , j;
	j = n;
	printf("\nInitializing....\n");
	for (int i = 0; i < 6; i++)
	{
		printf("Enter number of calls attended: ");
		scanf("%d",&Day[i]);
	}

	printf("Number of calls per day : \n");
	for (int i = 0; i<6; i++)
	{
		printf(" Day-%d : %d \n",i+1,Day[i]);
	}

	n = n+1;
	while( j >= location)
	{
	Day[j+1] = Day[j];
	j=j-1;
	}

	printf("\nEnter calls for last day: -\n");
	scanf("%d",&Day[location]);

	printf("Number of calls per day after insertion : \n");
	
	for(int i=0; i<=n; i++)
	{
		printf(" Day-%d : %d \n",i+1, Day[i]);
	}
	
	return 0;
}



/* STEP-1 : Loc of the last element, Loc = 6 
Step 2: int I = 1 to N (6+1) 
step 3: check the condition I >= Loc,J=6 
follow next 5 and 6 steps 
step 4: move current position to the one step back 
Step 5: while( J >= loc) { Day[J+1] = Day[J]; J = J - 1; } 
Step 6: Day[loc] = new_item; 
step 7: Print array(using traversal) */