import java.util.Scanner;
import java.lang.*;
class Stack1
{
	int top ,size;
	int stack[] ,i = 0;
	Stack1()
	{
		top =-1;
	   System.out.println("Enter size of Stack:--->\n");
	   Scanner sc = new Scanner(System.in);
	   size = sc.nextInt(); 
	   System.out.println("Size =  "+ size);
	stack=new int[size];
	}  
   void push(int data)
   {
	   if(top<size-1 )
	   { 
		   stack[++top]= data;
		   
		   System.out.println("\n"+ data +" is Pushed into stack");
	   }
	   else
	   {
		   System.out.println("Stack is overflow !!!.  Data not puhed into stack  "); 
	   }
	   
   }
   void pop()
   {
	   if(top==-1)
	   {
		   System.out.println("Stack is UnderFlow !!!. Data is not poped from stack");
	   }
	   else
	   {
		   System.out.println("\n"+stack[top] + " is poped from stack");
		   top--;
	   }
   }
   void display()
   {
	   for(i=0;i<=top;i++)
	   {
		   System.out.print("Element are:-"+stack[i] +",  ");
	   }
   }
   
}