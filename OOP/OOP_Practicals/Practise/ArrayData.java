import java.util.*;
public class ArrayData
{
	public static void main(String[] args) {
		int[] num_array1={11,33,22,44,88,77,99,66};
		String[] var_array2 = {"Java","Python","PHP","C#","C Programming","C++"};
		System.out.println("\nOriginal numeric array : "+Arrays.toString(num_array1));
		Arrays.sort(num_array1);
		System.out.println("\nSorted numeric array : "+Arrays.toString(num_array1));

		System.out.println("\nOriginal string array : "+Arrays.toString(var_array2));
		Arrays.sort(var_array2);
		System.out.println("\nSorted string array : "+Arrays.toString(var_array2));
	}
}