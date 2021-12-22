/*
Ram is developing a restaurant management system using the following modules:

1. An interface RestDetails with a variable consisting of the restaurant name and a getMenu(String choice) method to take the user input for the different food items to be ordered.
2. Abstract class Order with an abstract function as getInvoice which will generate the total invoice amount and its discounted amount based on the food item’s ordered, if the amount exceeds 2000, apply discount of 20% and a constructor to take the user input for the food order such as Sandwich, Chinese, Pizza,etc.    
3. A class known as RestMgmt inherits the interface and Abstract Class to display the choices made, food items selected and the invoice generated

*/

import java.util.*;
interface RestDetails
{
	String restname = "Coffee Culture";
	void getMenu(String choice);
}

abstract class order
{
	double invoice;
	int choice;
	String food;
	abstract void getInvoice();
}

class RestMgmt extends order implements RestDetails
{
	double discount;
	@Override
	void getInvoice()
	{
		if(invoice > 2000)
		{
			System.out.println("Invoice before discount: " + invoice);
			discount = (invoice * 20) / 100;
			System.out.println("Discout offered:" + discount);
			invoice = invoice - discount;
			System.out.println("Final Invoice Generated: " + invoice);
		}
		else
		{
			System.out.print("\nInvoice Generated: " + invoice);
		}
	}
	RestMgmt()
	{
		Scanner sc = new Scanner(System.in);
		
		while(true)
		{
			System.out.print("\n1)Sandwich\n2)Chinese\n3)Pizza\n4)Exit");
			System.out.print("\nEnter Choice:");
			choice = sc.nextInt();
			switch (choice)
			{
				case 1:
					System.out.print("\nChoice made: " + choice + "\n");
					food = "Sandwich";
					invoice = invoice + 1500;
					getMenu(food);
				break;
				case 2:
					System.out.print("\nChoice made: " + choice);
					food = "Chinese";
					invoice = invoice + 1400;
					getMenu(food);
				break;
				case 3:
					System.out.print("\nChoice made: " + choice);
					food = "Pizza";
					invoice = invoice + 1300;
					getMenu(food);
				break;
				case 4:
				return;
				default:
				System.out.print("Enter Valid Choice!!");
			}
		}
	}
	@Override
	public void getMenu(String c)
	{
		System.out.println("Food item: " + c);
	}
}
public class prac15
{
	public static void main(String[] args)
	{
		System.out.println("Price of Sandwich dish:1500");
		System.out.println("Price of Chinese dish:1400");
		System.out.println("Price of Pizza dish:1300");
		RestMgmt obj = new RestMgmt();
		obj.getInvoice();
	}
}