import java.util.*;

public class p16
{
	void taxCalculate(double a,double b)
	{
		double income=0,tax=0,taxable_income=0;
		if(b>=100000)
		{
			income=a-100000;
		}
		else
		{
			income=a-b;
		}
		if(income>0 && income<=100000)
		{
			tax=(income*0)/100;
			taxable_income=income-tax;
			System.out.print("Income after deducting savings from Gross salary: "+income);
			System.out.print("\nTax: "+tax);
			System.out.print("\nIncome after applying tax: "+taxable_income);
		}
		else if(income>100000 && income<=200000)
		{
			tax=(income*10)/100;
			taxable_income=income-tax;
			System.out.print("Income after deducting savings from Gross salary: "+income);
			System.out.print("\nTax: "+tax);
			System.out.print("\nIncome after applying tax: "+taxable_income);
		}
		else if(income>200000 && income<=500000)
		{
			tax=(income*20)/100;
			taxable_income=income-tax;
			System.out.print("Income after deducting savings from Gross salary: "+income);
			System.out.print("\nTax: "+tax);
			System.out.print("\nIncome after applying tax: "+taxable_income);
		}
		else
		{
			tax=(income*30)/100;
			taxable_income=income-tax;
			System.out.print("\nIncome after deducting savings from Gross salary: "+income);
			System.out.print("\nTax: "+tax);
			System.out.print("\nIncome after applying tax: "+taxable_income);
		}
	}
	public static void main(String[] args)
	{
		double gross_salary,saving;Scanner yash=new Scanner(System.in);
		System.out.print("Enter Gross Salary: ");
		gross_salary=yash.nextDouble();
		System.out.print("Enter Savings: ");
		saving=yash.nextDouble();
		if(gross_salary>saving && gross_salary>0)
		{
			p16 obj = new p16();
			obj.taxCalculate(gross_salary,saving);
		}
	}
}