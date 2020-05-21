package practice_16;

public class StaticMethod {
    public static void main(String[] args)
    {
         myClass object = new myClass();
//        object.doSomething("Hello");   // yesto grada statically nai access gar vanera recomendation dinxa
          String message= myClass.doSomething("Hello");  // class name bata nai access gareko leh yeslai static vaneko ho.
          System.out.println(message);

          String message1 = object.doSomethingElse("Hello Guys"); // doSomethingElse vanni method isn't the static method
                                                                  //so yeslai object banayera matrai access garna pauncha.
          System.out.println(message1);


    }
    

}
