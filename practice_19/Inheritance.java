package practice_19;

public class Inheritance {
    public static void main(String[] args) {
        Polygon pol =new Polygon();
        Rectangle rec = new Rectangle();
        Triangle tri = new Triangle();

        rec. setValues(10,10);   //setValues vanni method Polygon class ko jaslai inherit gariyeko cha Rectangle class le.
        System.out.println(rec.areaOfRectangel());

        tri.setValues(10, 10);  //setValues vanni method Polygon class ko jaslai inherit gariyeko cha Triangle class le.
        System.out.println(tri.areaOfTriangle());
    }
}
