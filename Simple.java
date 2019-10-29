package mypack;
import java.util.Scanner; 
class Rectangle{
	void perimeter( double x,double y){
	System.out.println("Perimeter of Rectangle: "+(2*(x+y)));
	}
}
class check extends Rectangle {
	void perimeter( double x, double y){
	if(x==y)	
	    System.out.println("Rectangle is Square Also !"+"\n"+"Primeter of Rectangle or Square: "+(4*x));
    else
		System.out.println("Rectangle is Not Square !");
	    super.perimeter(x,y);
	}
}	

public class Simple{  
public static void main(String args[]){ 
    System.out.println("Welcome To Implementation of Package With Polymorphism\n\n"); 
	Scanner input = new Scanner(System.in);
    System.out.println("Enter  two number to calculate perimeter :- ");
    double num1 =  input.nextDouble();
    double num2 =  input.nextDouble();
    check obj =new check();
    obj.perimeter(num1,num2);
	
	
   }
}   

