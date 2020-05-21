package practice_23;

public class AbstractClass
{
    public static void main(String[] args)
    {
        //Bank bank = new Bank() ; // Bank is abstract class so hamiley Bank class ko object banayera reference garna sakdainau.
        Bank abc = new Bank_ABC(); // Yesari non-abstract class lai vaney referencing dina milcha.

        System.out.println(abc.getInterestRate());
    }

}
