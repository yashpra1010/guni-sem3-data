import java.util.*;
public class Prac4
{
public void login(){
System.out.println("Enter Username: ");
Scanner yash = new Scanner(System.in);
String username=yash.next();
System.out.println("Enter Password: ");
String Password=yash.next();
if(username.equals("Ganpat") && Password.equals("ICT"))
{
System.out.println("Welcome "+username);
}
else
{
System.out.println("Failed To Login!!!");
}
}
public static void main(String[] args)
{
Prac4 obj = new Prac4();
obj.login();
}}