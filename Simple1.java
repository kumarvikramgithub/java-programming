package mypack;
import java.util.Scanner;
interface shape{
	void perimeter();
}	

public class Simple1{ 
void perimeter(double x,double y){
	if(x==y)	
	    System.out.println("Shape is Square!"+"\n"+"Primeter of Square  : "+(4*x));
    else
		System.out.println("Shape is Rectangle!"+"\n"+"Primeter of Rectangle  : "+(2*(x+y)));

	}	 
public static void main(String args[]){
System.out.println("Welcome To Implementation of Package With Interface\n\n");
    Scanner input = new Scanner(System.in); 
	System.out.println("Enter  two number to calculate perimeter :- ");
    double num3 =  input.nextDouble();
    double num4 =  input.nextDouble();
    Simple1 obj1 =new Simple1();
    obj1.perimeter(num3,num4);
}
}