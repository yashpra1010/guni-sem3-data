#include <stdio.h>

struct Yash
{
	int age;
	char name[20];
};
int main()
{
	int num=0,age1=0,age2=0,age3=0,age4=0;
    
	printf("\nEnter no. of person: ");
	scanf("%d",&num);
    struct Yash y[num];
    
	for (int i = 0; i < num; i++)
	{
		printf("Enter name of Person-%d: ",i+1);
		scanf("%s",y[i].name);
		printf("Enter age of Person-%d: ",i+1);
		scanf("%d",&y[i].age);

		if (y[i].age >= 0 && y[i].age <= 120){
		    if (y[i].age >= 0 && y[i].age <= 16){
			    age1++;
		    }
			else if(y[i].age >= 17 && y[i].age <= 30){
			    age2++;
		    }
		    else if(y[i].age >= 31 && y[i].age <= 44){
			    age3++;
		    }
		    else{
			    age4++;
		    }
		}
		else{
		    printf("\nEnter Valid Age.");
		}
		
	}

	printf("\nChild (0-16): %d",age1);
	printf("\nYoung Child (17-30): %d",age2);
	printf("\nMiddle Aged Adults (31-44): %d",age3);
	printf("\nOld Aged Adults (45+): %d",age4);

}