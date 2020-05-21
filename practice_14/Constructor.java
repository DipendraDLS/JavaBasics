package practice_14;

public class Constructor {
    public static void main(String[] args)
    {
        Cube cube1 = new Cube(); // Here Cube() is the default constructor yesle default constructor lai call garcha.
        System.out.println(cube1.getCubeVolume());

        Cube cube2 = new Cube(20,30,40); // parameterized constructor lai call garcha
        System.out.println(cube2.getCubeVolume());

    }
}
