import java.util.*;
public class ArraySearch {
    public static void main(String[] args) {
		//System.out.println("Enter number to search in array: ");
		//Scanner yash=new Scanner(System.in);
		//int search=yash.nextInt();
		int arr1[]={1456,2,4,6,7,9};
		int num1=1456;
		int num2=2444;
		int i;
        for (i = 0; i < 6; i++) 
		{
            if (num1 == arr1[i]) 
			{
                System.out.println("Array contains "+num1+": true");
            }
			if(num2!=arr1[i])
			{
				System.out.println("Array contains "+num2+": false");
				break;
			}
        }
		
    }
}