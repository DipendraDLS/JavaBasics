package practice_20;

public class Volume {
    protected int length;
    protected int breadth;
    protected int height;

    //Default constructor
    Volume()
    {
        length =-1;
        breadth = -1;
        height = -1;
    }

    //Volume for cuboid
    Volume( int l, int b ,int h)
    {
        length = l;
        breadth = b;
        height = h;
    }

    //volume of cube
    Volume(int l)
    {
        length=breadth=height=l;
    }
    //calculating volume and return calculated value to main.
    int calcVolume()
    {
        return length*breadth*height;
    }
}
