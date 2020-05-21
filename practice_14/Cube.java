package practice_14;

public class Cube {
     int length;
     int breadth;
     int height;

     public int getCubeVolume()  //Method
     {
         return (length*breadth*height);
     }
     Cube() // default constructor
     {
         length= 10;
         breadth= 20;
         height = 30;
     }
     Cube(int l, int b, int h) // parameterized constructor. Here it can also be said as overloading of constructor.
     {
         length = l;
         breadth = b;
         height = h;
     }
}
