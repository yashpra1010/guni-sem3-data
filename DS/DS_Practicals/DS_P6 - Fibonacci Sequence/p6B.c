#include <stdio.h>
void TOH(int n, char a, char b, char c)
{
if (n > 0)
{
TOH(n - 1, a, c, b);
printf("\nTop Disk moved from %c to %c ", a, b);
TOH(n - 1, c, b, a);
}
}
int main()
{
int yash;
printf("\nEnter the Number of Disks: ");
scanf("%d", &yash);
TOH(yash, 'A', 'B', 'C');
printf("\n\n");
}