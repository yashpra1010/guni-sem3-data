#include <stdio.h>
#include <stdlib.h>
int Top=-1,YashPra[9];
void PushNum()
{
	int x;
	if(Top==8)
	{
		printf("\nOverflow!\n");
	}
	else
	{
		printf("\nEnter number of ball to be inserted: ");
		scanf("%d",&x);
		if(Top==-1)
		{
			Top=Top+1;
			YashPra[Top]=x;
		}
		else if(x>YashPra[Top] && YashPra[Top]%2==1 )
		{
			Top=Top+1;
			YashPra[Top]=x;			
		}
		else if(x>YashPra[Top] && YashPra[Top]%2==0 )
		{
			Top=Top+1;
			YashPra[Top]=x;			
		}
		else
		{	
			printf("\nCannot PUSH %d as condition not satisfied\n",x);
		}
	}
}

void PopNum()
{
	if(Top==-1)
	{
		printf("\nEmpty!\n");
	}
	else
	{
		printf("\nPopped ball numbered: %d",YashPra[Top]);
		Top=Top-1;
	}
}

void show()
{

	if(Top==-1)
	{
		printf("\nEmpty!\n");
	}
	else
	{
		printf("\nBalls in stack array are:\n");
		for(int i=Top;i>=0;--i)
		{
			printf("%d\n",YashPra[i]);
		}
	}
}

int main()
{
	int ch;

	Top=Top+1;
	YashPra[Top]=1;
	Top=Top+1;
	YashPra[Top]=8;
	Top=Top+1;
	YashPra[Top]=9;
	Top=Top+1;
	YashPra[Top]=3;

	while(1)
	{
	printf("\n(1) PUSH Ball");
	printf("\n(2) POP Ball");
	printf("\n(3) Show Stack");
      	printf("\n(4) Exit");
	printf("\nEnter your choice: ");
	scanf("%d",&ch);
	switch(ch)
	{
	case 1:
	PushNum();
	break;
	
	case 2:
	PopNum();
	break;

	case 3:
	show();
	break;
	  
	case 4:
	exit(0);

	default:
	printf("\nInvalid Choice Entered\n");
	break;
	}
}
return 0;
}