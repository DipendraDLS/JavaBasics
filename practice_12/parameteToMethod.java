package practice_12;

public class parameteToMethod {
    public static void main(String[] args)
    {
      sayHello("Dipendra");
      Add(5,10);
    }

    //Method with Parameter
    public static void sayHello(String name)
    {
        System.out.println("Hello " + name);
    }

    //Method with multiple Parameter
    public static void Add(int x, int y)
    {
        int add = x + y;
        System.out.println("Addition Value = " + add );
    }

}
