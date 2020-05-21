package practice_11;

public class string {
    public static void main(String[] args) {
        String myString = "Hello I am Dipen from Kuleshwor";
        System.out.println(myString);

        // length of the string
        int myStringLength = myString.length();  //whitespace is  also counted.
        System.out.println(myStringLength);

        //converting string to lower case
        String myStringLowerCase = myString.toLowerCase();
        System.out.println(myStringLowerCase);

        //Converting string to upper case
        String myStringUpperCase = myString.toUpperCase();
        System.out.println(myStringUpperCase);

        // replacing the character of string.
        System.out.println(myString.replace('D', 'J'));

        //get the position of the character.
        System.out.println(myString.indexOf('D'));  // index starts from zero.


    }

}
