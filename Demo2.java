class Demo2 extends Demo1
{
  void run()
  {
   System.out.println("I am Demo2 class method");
   super.run();
  }
  void divide(double data,int n)
  {
	System.out.println(data/2.45) ; 
  }
  
  public static void main(String[] args)
  {
    Demo2 d1 = new Demo2();
	System.out.println(d1 instanceof Demo2);
	System.out.println(d1 instanceof Demo1);
	d1.divide(23.34d,);
   }
}