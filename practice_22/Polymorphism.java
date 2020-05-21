package practice_22;

public class Polymorphism
{
    public static void main(String[] args)
    {
      Bank bank = new Bank();     // Same class ko object haru with different forms is called polymorphism.
      Bank abc = new Bank_ABC();  // Bank vanni class ko 'abc'  bhanney object Bank_ABC lai refer garcha.
      Bank def = new Bank_DEF();  // Bank vanni class ko 'def'  bhanney object Bank_DEF lai refer garcha
      Bank xyz = new Bank_XYZ();  // Bank vanni class ko 'xyz'  bhanney object Bank_XYZ lai refer garcha

        System.out.println(bank.getInterestRate());
        System.out.println(abc.getInterestRate());
        System.out.println(def.getInterestRate());
        System.out.println(xyz.getInterestRate());
    }

}
