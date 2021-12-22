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
int main(){
    struct node *root= newNode(20);
    root->leftNode=newNode(15);
    root->rightNode=newNode(30);
    root->leftNode->leftNode=newNode(25);
    root->leftNode->rightNode=newNode(19);
    root->rightNode->leftNode=newNode(31);
    root->rightNode->rightNode=newNode(45);
    printf("Root element of binary tree is: ");
    printCurrentLevel(root,0);
    printf("\nLevel-1 element of binary tree is: ");
    printCurrentLevel(root,1);
    printf("\nLevel-2 element of binary tree is: ");
    printCurrentLevel(root,2);
}