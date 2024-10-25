public class Test
{
    public static void main(String[] args){

        //all methods are verified as working
        Point a = new Point();
        Point b = new Point(5, -3);

        System.out.println(b.getQuadrant());

        b.move(-3, 10);

        System.out.println(b.getX());
        System.out.println(b.getY());

        System.out.println(a.dist(b));
    }
}
