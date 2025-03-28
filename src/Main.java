public class Main {
    public static void main(String[] args) {

        Point p = new Point(3,4);
        Rectangle r1 = new Rectangle(p,3,4);
        System.out.println(r1.area());
        System.out.println(r1.perimeter());

        Triangle t1 = new Triangle(p,3,4,5,5);
        System.out.println(t1.area());
        System.out.println(t1.perimeter());

    }
}