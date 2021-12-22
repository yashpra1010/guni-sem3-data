import java.util.*;

public class Array_List{
	public static void main(String[] args) {
		
		ArrayList <String> al=new ArrayList <String>();

//adding elements
		al.add("AEM");
		al.add("OOP");
		al.add("DS");
		al.add("DBMS");
		al.add("ED");
		al.add("DYS-BG");

//accessing element
		System.out.println("Returning element: "+al.get(1));

//changing element
		al.set(5,"BG");

		//System.out.println(subject);

//traversing list	
		System.out.println("\nArrayList 1:"+al);
		/* for(String subject:al){
			System.out.println(subject);
		} */

//removing element at index 0
		al.remove(0);

/*----------------------------------------------------------*/
		ArrayList <String> al2=new ArrayList <String>();

		al2.add("BOSS");
		al2.add("BCS");
		System.out.println("\nArrayList 2:"+al2);

		al2.addAll(al);
		System.out.println("\nArrayList 2 (updated):"+al2);

		al2.removeIf(sem2 -> sem2.contains("BOSS")); //lamba function
		System.out.println("\nArrayList 2 (after using Lambda Func.):"+al2);

		//System.out.println(al2.retainAll(al));

		al.removeAll(al); //removes elements not memory space
		System.out.println("\nAfter al.removeAll (ArrayList-1):"+al);
		
		al2.clear(); //completely wipes out memory
		System.out.println("\nAfter al2.clear() (ArrayList-2):"+al2);

	}
}