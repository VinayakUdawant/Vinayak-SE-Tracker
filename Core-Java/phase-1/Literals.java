public class Literals
{
    public static void main (String [] args)
    {
        int num1 = 0b101;
        int num2 = 0x7E;
        int num3 = 10_000_000;
        int num4 = 56;
        double num5 = 12e10;
        boolean b = true;
        char c = 'a';
        c++;

        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);
        System.out.println(num5);
        System.out.println(b);
        System.out.println(c);
    }
}