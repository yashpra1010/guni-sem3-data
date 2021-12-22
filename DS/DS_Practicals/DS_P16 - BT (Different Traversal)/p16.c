#include <stdio.h>
#include <malloc.h>
struct node {
    int yash;
    struct node *leftNode;
    struct node *rightNode;
};
struct node *newNode(int value){
    struct node *node=(struct node*)malloc(sizeof(struct node));
    node->yash=value;
    node->leftNode=NULL;
    node->rightNode=NULL;
    return node;
}
void printCurrentLevel(struct node *root ,int lvl){
    if(root==NULL){
        return;
    }
    if(lvl==0){
        printf(" %d ",root->yash);
    }
    if(lvl>0){
        printCurrentLevel(root->leftNode,lvl-1);
        printCurrentLevel(root->rightNode,lvl-1);
    }
}

void PreOrder(struct node *ptr)
{
	if(ptr!=NULL)
	{
		printf(" %d ",ptr->yash);
		PreOrder(ptr->leftNode);
		PreOrder(ptr->rightNode);
	}
}

void InOrder(struct node *ptr)
{
	if(ptr!=NULL)
	{
		InOrder(ptr->leftNode);
		printf(" %d ",ptr->yash);
		InOrder(ptr->rightNode);
	}
}

void PostOrder(struct node *ptr)
{
	if(ptr!=NULL)
	{
		PostOrder(ptr->leftNode);
		PostOrder(ptr->rightNode);
		printf(" %d ",ptr->yash);
	}
}

int Insert()
{
	int rawdata=0;
	scanf("%d",&rawdata);
	return rawdata;
}
int main(){
	printf("\n-----| I N P U T |-----\n");
    struct node *root= newNode(Insert());
    root->leftNode=newNode(Insert());
    root->rightNode=newNode(Insert());
    root->leftNode->leftNode=newNode(Insert());
    root->leftNode->rightNode=newNode(Insert());
    root->rightNode->leftNode=newNode(Insert());
	root->rightNode->rightNode=newNode(Insert());

	printf("\n\n----------| O U T P U T |----------\n");
    printf("Root element of binary tree is:\t\t");
    printCurrentLevel(root,0);
    printf("\nLevel-1 element of binary tree is:\t");
    printCurrentLevel(root,1);
    printf("\nLevel-2 element of binary tree is:\t");
    printCurrentLevel(root,2);
	printf("\n\nPreorder traversal of binary tree is:\t");
	PreOrder(root);
	printf("\nInorder traversal of binary tree is:\t");
	InOrder(root);
	printf("\nPostorder traversal of binary tree is:\t");
	PostOrder(root);
	printf("\n");
}