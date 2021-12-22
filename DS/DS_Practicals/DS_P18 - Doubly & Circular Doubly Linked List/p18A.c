#include <stdio.h>
#include <stdlib.h>
struct node
{
	int data;
	struct node *previous, *next;
};
struct node *start;
void insert_begin()
{
	int yash;
	printf("Enter element you want to insert at first position: ");
	scanf("%d", &yash);
	struct node *new_node;
	new_node = (struct node *)malloc(sizeof(struct node));
	new_node->data = yash;
	if (start == NULL)
	{
		start = new_node;
		new_node->next = NULL;
		new_node->previous = NULL;
	}
	else
	{
		start->previous = new_node;
		new_node->next = start;
		new_node->previous = NULL;
		start = new_node;
	}
}
void insert_end()
{
	int yash;
	printf("Enter element you want to insert at last position: ");
	scanf("%d", &yash);
	struct node *new_node, *ptr;
	new_node = (struct node *)malloc(sizeof(struct node));
	ptr = start;
	new_node->data = yash;
	new_node->next = NULL;
	if (start == NULL)
	{
		start = new_node;
		new_node->previous = NULL;
	}
	else
	{
		while (ptr->next != NULL)
		{
			ptr = ptr->next;
		}
		new_node->previous = ptr;
		ptr->next = new_node;
	}
}
void insert_before()
{
	int yash, item;
	printf("Enter element you want to insert: ");
	scanf("%d", &yash);
	printf("Enter element before which yo want to insert: ");
	scanf("%d", &item);
	struct node *new_node, *ptr, *before;
	new_node = (struct node *)malloc(sizeof(struct node));
	new_node->data = yash;
	ptr = start;
	before = ptr;
	while (ptr->data != item)
	{
		before = ptr;
		ptr = ptr->next;
	}
	before->next = new_node;
	new_node->previous = before;
	new_node->next = ptr;
	ptr->previous = new_node;
}
void insert_after()
{
	int yash, item;
	printf("Enter element you want to insert: ");
	scanf("%d", &yash);
	printf("Enter element after which yo want to insert: ");
	scanf("%d", &item);
	struct node *new_node, *ptr;
	new_node = (struct node *)malloc(sizeof(struct node));
	new_node->data = yash;
	ptr = start;
	while (ptr->data != item)
	{
		ptr = ptr->next;
	}
	new_node->next = ptr->next;
	new_node->previous = ptr;
	ptr->next = new_node;
}
void delete_begin()
{
	struct node *ptr;
	ptr = start;
	start = start->next;
	start->previous = NULL;
	free(ptr);
}
void delete_last()
{
	struct node *ptr;
	ptr = start;
	while (ptr->next != NULL)
	{
		ptr = ptr->next;
	}
	ptr->previous->next = NULL;
	free(ptr);
}
void delete ()
{
	int yash;
	printf("Enter element which you want to delete: ");
	scanf("%d", &yash);
	struct node *ptr;
	ptr = start;
	while (ptr->data != yash)
	{
		ptr = ptr->next;
	}
	ptr->previous->next = ptr->next;
	ptr->next->previous = ptr->previous;
	free(ptr);
}
void delete_before()
{
	int yash;
	printf("Enter element before which you want to delete: ");
	scanf("%d", &yash);
	struct node *ptr, *before;
	ptr = start;
	before = ptr;
	while (ptr->data != yash)
	{
		before = ptr;
		ptr = ptr->next;
	}
	ptr->previous = ptr->previous->previous;
	before->previous->next = ptr;
	free(before);
}
void delete_after()
{
	int yash;
	printf("Enter element after which you want to delete: ");
	scanf("%d", &yash);
	struct node *ptr, *after;
	ptr = start;
	while (ptr->data != yash)
	{
		ptr = ptr->next;
	}
	after = ptr->next;
	ptr->next = after->next;
	after->next->previous = after->previous;
	free(after);
}
void search()
{
	int yash, pos = 0;
	printf("Insert item which you want to search: ");
	scanf("%d", &yash);
	struct node *ptr;
	ptr = start;
	while (ptr->next != NULL)
	{
		if (ptr->data == yash)
		{
			break;
		}
		else
		{
			ptr = ptr->next;
			pos++;
		}
	}
	printf("Item is available at the %d position of the list\n", pos + 1);
}
void display()
{
	printf("List is: \n");
	struct node *ptr;
	ptr = start;
	while (ptr != NULL)
	{
		printf("%d\n", ptr->data);
		ptr = ptr->next;
	}
}
int main()
{
	int choice;
	for (;;)
	{
		printf("\n1. Insert new item at the first position\n2. Insert new item at the last position\n3. Insert new item before the given value of node\n4. Insert new item after the given value of node\n5. Delete item from the first position\n6. Delete item from the last position\n7. Delete particular item\n8. Delete item before the given item\n9. Delete item after the given item\n10. Search item from the list\n11. Display all elements of the list\n12. Exit\n");
		printf("Enter your choice: ");
		scanf("%d", &choice);
		switch (choice)
		{
		case 1:
			insert_begin();
			break;
		case 2:
			insert_end();
			break;
		case 3:
			insert_before();
			break;
		case 4:
			insert_after();
			break;
		case 5:
			delete_begin();
			break;
		case 6:
			delete_last();
			break;
		case 7:
			delete ();
			break;
		case 8:
			delete_before();
			break;
		case 9:
			delete_after();
			break;
		case 10:

			search();
			break;
		case 11:
			display();
			break;
		case 12:
			exit(0);
			break;
		}
	}
	return 0;
}