/*
Input: -	cls
			as
			2
Output: -	class
*/

#include<stdio.h>
#include<string.h>

int main()
{
	char Yash1[10],Yash2[10],Yash3[10]; //main,new,final
	int pos,len1,len2,length,temp2,temp=0,temp1;
	int i=0;

	printf("\nEnter main string: ");
	scanf("%s",Yash1); //cls
	
	printf("\nEnter new string: ");
	scanf("%s",Yash2); //as

	printf("\nEnter position from where you want to insert new string: ");
	scanf("%d",&pos); //2

	len1=strlen(Yash1); //3
	len2=strlen(Yash2); //2

	while(i<=len1)
	{
		Yash3[i]=Yash1[i]; //copy main_str into final_str
		i++;
	}
	length=len1+len2;
	temp1=len2+pos;
	for (int i = pos; i < length; i++) //i=2,i<5,i++
	{
		temp2=Yash3[i];
		if (temp<len2) //inserting 2nd str into 1st str
		{
			Yash1[i]=Yash2[temp];
			temp++;
		}
		Yash1[temp1]=temp2;
		temp1++;
	}
	printf("%s",Yash1);
	return 0;
}

/*
string is getting appended in main_str only
final_str is used for spliting the main_str from given pos
*/