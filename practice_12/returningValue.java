package practice_12;

public class returningValue {

    public static void main(String[] args)
    {

        int ans = add(5,10);// return gareko value ans ma ayera basxa.
        System.out.println("The Addition value = " + ans);
    }

    public static int add (int x, int y)
    {
        int answer = x + y;
        return (answer);
    }
}
