#include <stdio.h>
#include <stdlib.h>

int yash[10];
int rear = -1;
int front = -1;
 
void insert()
{
    int add_item;
    if(rear == 9)
    {
		printf("Queue Overflow !\n");
	}
    else
    {
        if(front == -1)
		{
        	front = 0;
		}
        printf("Inset the element in queue : ");
        scanf("%d", &add_item);
        rear = rear+1;
        yash[rear] = add_item;
    }
}

void delete()
{
    if(front == -1 || front>rear)
    {
        printf("Queue Underflow!\n");
        return ;
    }
    else
    {
        printf("Element deleted from queue is: %d\n", yash[front]);
        front=front+1;
    }
}
 
void display()
{
    int i;
    if (front == -1)
        printf("Queue is empty!\n");
    else
    {
        printf("Queue is: \n");
        for (i = front; i <= rear; i++)
            printf("%d ", yash[i]);
        printf("\n");
    }
}

int main()
{
    int ch;
    while(1)
    {
        printf("1. Insert element to queue\n");
        printf("2. Delete element from queue\n");
        printf("3. Display all elements of queue\n");
        printf("4. Quit\n\n");
        printf("Enter your choice: ");
        scanf("%d",&ch);
        switch(ch)
        {
            case 1:
            insert();
            break;
            case 2:
            delete();
            break;
            case 3:
            display();
            break;
            case 4:
            exit(0);
            default:
            printf("Invalid choice!!\n");
        }
    }
}