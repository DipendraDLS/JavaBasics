package practice_25;

public class ImplementingInterfaces
{
    /*
        SuperClass                  SubClass        Keyword To Be Used
        Class                         Class             extends
        Interface                     Class             implements
        Interface                     Interface          extends
   */


    public static void main(String[] args)
    {
        Bank abc = new Bank_ABC();

        System.out.println(abc.getInterestRate());
    }
}
