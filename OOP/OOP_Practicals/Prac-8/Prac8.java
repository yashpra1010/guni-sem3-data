import java.util.*;
public class Prac8 {
    public static void main(String[] args) {
		System.out.println("Enter size of Array 1: ");
		Scanner yash=new Scanner(System.in);
		int num1=yash.nextInt();
		int arr1[]=new int[num1];
		int i,j=0;
		for(i=0;i<num1;i++)
		{
			System.out.println("\nEnter element "+(i+1)+" of Array 1:");
			arr1[i]=yash.nextInt();
		}
        
		System.out.println("Enter size of Array 2: ");
		int num2=yash.nextInt();
		int arr2[]=new int[num2];

		for(i=0;i<num2;i++)
		{
			System.out.println("\nEnter element "+(i+1)+" of Array 2:");
			arr2[i]=yash.nextInt();
		}

        System.out.println("Array 1: " + Arrays.toString(arr1));
        System.out.println("Array 2: " + Arrays.toString(arr2));
        System.out.println("\nCommon Elements Are: ");
        for (i = 0; i < 8; i++) {
            for (j = 0; j < 8; j++) {
                if (arr1[i] == arr2[j]) {
                    System.out.println(arr1[i]);
                }
            }
        }
    }
}


/*

import java.util.*;
public class Prac8 {
    public static void main(String[] args) {
        int[] Yash = { 1, 2, 5, 5, 8 ,9 , 7 ,10 };
        int[] arr2 = { 1, 0, 6, 15, 6 , 4 , 7 ,0 };
        System.out.println("Array 1: " + Arrays.toString(Yash));
        System.out.println("Array 2: " + Arrays.toString(arr2));
        System.out.println("\nCommon Elements Are: ");
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (Yash[i] == arr2[j]) {
                    System.out.println(Yash[i]);
                }
            }
        }
    }
}

*/
