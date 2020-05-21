package practice_9;

public class array {
    /*
        Declaring Array in Diffferent way.

        int myIntArray[]= {1,2,3,4,5};
        int[] myIntArray = {1,2,3,4,5};
        int[] myIntArray = new int[5];
        int[] myIntArray = new int[] {1,2,3,4,5};
     */

    public static void main(String[] args) {
        int[] myIntArray = {1,2,3,4,5};

        int index = 0;

        while (index<5){
            System.out.println(myIntArray[index]);
            index++;
        }
    }


}
