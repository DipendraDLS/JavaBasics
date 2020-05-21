
package practice_10;

public class forLoop {
    public static void main(String[] args) {
        int[] myIntArray = {1,2,3,4,5};
        int i = 0;
        for (i = 0; i<5; i++)
        {
            System.out.println(myIntArray[i]);
        }

        //Intelligent way to itterate over forloop in java
        for (int element: myIntArray)
        {
            System.out.println(element);
        }
    }
}
