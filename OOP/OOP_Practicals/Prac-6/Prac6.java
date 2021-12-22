/*
Variable: cust_name, cust_id, balance, bank_balance
getData() : cust_name, cust_id user input
static data() : assign value for bank name
display() : print all variables

main() :	take user input 
			call static function
			reassign bank_name
			increment balance
			print the value
*/

import java.io.*;
import java.util.*;

public class Prac6
{
	int cust_id;
	String cust_name;
	static int balance=24000;
	static String bank_name="HDFC";

	public void getData()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("\nEnter Customer ID: ");
		cust_id=scan.nextInt();
		System.out.println("\nEnter Customer Name: ");
		cust_name=scan.next();

	}
	static void data()
	{
		bank_name="Union Bank Of India";
	}
	public void display()
	{
		System.out.println("\n-----| CUSTOMER DETAILS |-----");
		System.out.println("\nCustomer ID: "+cust_id);
		System.out.println("\nCustomer Name: "+cust_name);
		System.out.println("\nBank Balance: "+balance);
		System.out.println("\nBank Name: "+bank_name);
	}
	public static void main(String[] args)
	{
		Prac6 bank=new Prac6();
		bank.getData();
		//bank.display();
		data();
		balance++;
		bank_name="Ganpat Bank";
		bank.display();
	}
}