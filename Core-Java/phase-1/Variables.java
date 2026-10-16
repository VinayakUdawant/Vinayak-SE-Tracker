public class Variables 
{
    public static void main (String[] args)
    {
        //Integers
        byte smallNumber = 100;     // 8 bits
        short mediumNumber = 20000;     // 16 bits
        int standardNumber = 30000000;      // 32 bits
        long largeNumber = 4000000000000L;    // 64 bits
        //Fraction
        float standardFraction = 8.7f;      // 32 bits
        double largeFraction = 1234.56789;      // 64 bits
        //Character
        char singleCharacter = 'V';     // 16 bits
        //Condition
        boolean trueOrFalse = true;     // 1 bit

        System.out.println("byte: "+smallNumber);
        System.out.println("short: "+mediumNumber);
        System.out.println("int: "+standardNumber);
        System.out.println("long: "+largeNumber);
        System.out.println("float: "+standardFraction);
        System.out.println("double: "+largeFraction);
        System.out.println("char: "+singleCharacter);
        System.out.println("boolean: "+trueOrFalse); 
    }
}