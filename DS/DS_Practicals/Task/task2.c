#include <stdio.h>
  
int main()
{
    char first[20], second[20], yash[20];
    int i = 0, j = 0;
  
    printf("\nEnter First string: ");
	scanf("%s",first);
    printf("\nEnter Second string: ");
	scanf("%s",second);
  
    while (first[i] != '\0') {
        yash[j] = first[i];
        i++;
        j++;
    }

    i = 0;
    while (second[i] != '\0') {
        yash[j] = second[i];
        i++;
        j++;
    }
    yash[j] = '\0';
  
    printf("\nFinal string: %s\n", yash);
  
    return 0;
}