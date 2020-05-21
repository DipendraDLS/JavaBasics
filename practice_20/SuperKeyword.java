package practice_20;

public class SuperKeyword
{
    public static void main(String[] args)
    {
        Weight weig = new Weight(2,3,4,6.5); //cuboid wala constructor call huncha
        Weight weig1 = new Weight(2, 6.5);          // cube wala constructor call huncha
        Weight weigh2 = new Weight();           //Default constructor lai call garcha

        int vol = weig.calcVolume();
        System.out.println("Volume = " + vol);
        System.out.println("Weight = " + weig.weigh);

    }
}
