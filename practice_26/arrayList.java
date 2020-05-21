package practice_26;
import java.util.ArrayList;

public class arrayList
{
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<Integer>(5);
        number.add(1);
        number.add(2);
        number.add(3);
        number.add(4);
        number.add(5);
        number.add(6);

        for (Integer x: number)
            System.out.println(x);

        //For Calculating Size of Array.
        System.out.println("Array Size = " + number.size());

        //To remove Value from array use 'remove' method;
        number.remove(2);
        for (Integer x : number)
            System.out.println(x);

        //To interchange the value of Array index.
        number.set(0 , 100); //0 index ko value lai 100 le replace gardiney

        for (Integer x : number)
            System.out.println(x);

        //To clear all the value of Array use 'clear' method.
        number.clear();
    }
}
