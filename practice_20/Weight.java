package practice_20;

public class Weight extends Volume
{
    double weigh;

    //Default Constructor
    Weight()
    {
        super();
        weigh =-1;
    }

    //For Cuboid along its weight.
    Weight(int l , int b, int h, double m)
    {
        super(l,b,h); // super keyword leh super class ko member haru lai initialize garney kam gardeko cha.
                      // jaba Weight ko object le constructor banayera l,b,h pass garcha taba yeta bata Super class tira link
                     // jodincha ani Super class ko l,b,h initialize huncha.

        weigh = m;
    }

    //For Cube along it's weight.
    Weight(int l, double m)
    {
        super(l);
        weigh = m;

    }
}
