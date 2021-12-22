#include <stdio.h>
#include <string.h>
int main()
{
int i = 0, j = 0, count = 0, location = 0, count1 = 0 , l=0;
char yash[20], del[20], name[20], new_name[20], main_str[20];
printf("Enter The string: ");
scanf("%s", yash);
printf("Enter String Which You Want To Delete: ");
scanf("%s", del);
while (yash[i] != '\0')
{
if (yash[i] == del[j])
{
while (del[j] != '\0')
{
i++;
j++;
}
}
else
{
name[i] = yash[i];
i++;
count++;
}
}
name[count] = '\0';
printf("Updated String: %s", name);
printf("\n\nEnter New String: ");
scanf("%s", new_name);
printf("Enter Location Where You Want To Insert: ");
scanf("%d", &location);
i=0;j=0;
l = strlen(name) + strlen(new_name);
while (i < l)
{
if (i == location)
{
while (new_name[j] != '\0')
{
main_str[i] = new_name[j];
j++;
i++;
}
}
main_str[i] = name[count1];
i++;
count1++;
}
printf("Updated String: %s\n", main_str);
return 0;
}