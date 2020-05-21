package practice_27;

public class exceptionHandling
{
    public static void main(String[] args)
    {
        try
        {
            int a = 10/0;

            int b[] = new int[2];
            System.out.println(b[3]);

        }
        catch (ArithmeticException e)
        {
            System.out.println(e);
        }
        catch (IndexOutOfBoundsException e)
        {
            System.out.println(e);
        }

        catch (Exception e)   //general type of exception. yo tetibela use ma auncha jaba hamilai k le garda exception
                              // ayeko ho thaa hunaa. This has the highest priority and sabai catch paxi at last ma nai
                              //huna parcha.

        {
            System.out.println(e);
        }
        finally
        {
            System.out.println("----------------------------");
        }
    }
}
