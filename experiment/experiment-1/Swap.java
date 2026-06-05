class Swap
{
   public static void main (String []args)
   {
    int a =10;
    int b =20;
    int temp;

    System.out.println("Using Third variable.");
    
    temp=a;
    a=b;
    b=temp;
    System.out.println("after swap. a="+a+" b="+b);
    
    System.out.println("Without third variable");
    int x=5;
    int y=3;
    
    x=x+y;
    y=x-y;
    x=x-y;

    System.out.println("after swap. x="+x+" y="+y);

   } 
}