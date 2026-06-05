public class rel_log_Operator
{
    public static void main(String []args)
    {
        int a =10;
        int b =20;
        
        System.out.println("Relational Operator.");
        System.out.println("a==b: "+(a==b));
        System.out.println("a!=b: "+(a!=b));
        System.out.println("a<b: "+(a<b));
        System.out.println("a>b: "+(a>b));
        System.out.println("a<=b: "+(a<=b));
        System.out.println("a>=b: "+(a>=b));

        System.out.println("Logical Operator.");
        System.out.println("(a!=b)&&(a<b): "+((a!=b)&&(a<b)));
        System.out.println("(a>=b)||(a<=b): "+((a>=b)||(a<=b)));
        System.out.println("a>=b: "+!(a>=b));
    }
}