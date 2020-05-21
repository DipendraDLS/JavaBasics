package practice_13;

public class Myclass {
    public static void main(String[] args) {
        Student mark = new Student(); // mark-> instance/ object of Student Class.
        mark.id = 1;
        mark.name = "Mark";
        mark.age = 18;

        System.out.println(mark.name + " is " + mark.age + " years old. ");


        Student tom = new Student(); // tom-> instance/ object of Student Class.
        tom.id = 2;
        tom.name = "Tom";
        tom.age = 16;
        System.out.println(tom.name + " is " + tom.age + " years old. ");


        //proper way to access class in java
        mark.setId(1);
        mark.setName("Mark");
        mark.setAge(18);
        System.out.println(mark.getName() + " is " + mark.getAge() + " years old.");

    }
}
