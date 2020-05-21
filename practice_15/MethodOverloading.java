package practice_15;

public class MethodOverloading
{
    public static void main(String[] args)
    {
        int sumInt = add(5,6); //return gareko value store gareko sumInt ma.
        double sumDouble = add (5.4, 6.6); //return gareko value store gareko sumDouble ma.

        System.out.println("SumInt = " + sumInt);
        System.out.println("SumDouble = " + sumDouble);
    }
    public static int add(int a , int b)
    {
        return (a+b);
    }
    public static double add(double a, double b)
    {
        return a+b;
    }
}
