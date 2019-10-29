import java.util.Scanner;
abstract class calculator
{
	abstract void calc(double x,double y);
}
class sum extends calculator{
void calc(double x,double y)
{System.out.println("the sum of "+x+" and "+y+" = "+ (x+y));}
}
class subtract extends calculator{
void calc(double x,double y)
{System.out.println("the subtraction of "+x+" and "+y+" = "+ (x-y));}
}
class multiply extends calculator{
void calc(double x,double y)
{System.out.println("the multiplication of "+x+" and "+y+" = "+ (x*y));}
}
class divide extends calculator{
void calc(double x,double y)
{System.out.println("the division of "+x+" and "+y+" = "+ (x/y));}
}
class remainder extends calculator{
void calc(double x,double y)
{System.out.println("the remainder of "+x+" and "+y+" = "+ (x%y));}
}
class calculator1{
public static void main(String args[]){
Scanner input = new Scanner(System.in);
System.out.println("enter  two number to calculate :- ");
double num1 =  input.nextDouble();
double num2 =  input.nextDouble();
calculator obj1=new sum();
obj1.calc(num1,num2);
obj1=new subtract();
obj1.calc(num1,num2);
obj1=new multiply();
obj1.calc(num1,num2);
obj1=new divide();
obj1.calc(num1,num2);
obj1=new remainder();
obj1.calc(num1,num2);
}
}

 