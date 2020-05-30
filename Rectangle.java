public class Rectangle {
    int a, b;
    Rectangle(int sa, int sb)
    {
        a = sa;
        b = sb;
    }
    double pr()
    {
        return (a + b)*2;
    }
    double area()
    {
        return a*b;
    }

}
class Test2 {
    public static void main(String[] args)
    {
        Rectangle tr = new Rectangle(3,5);
        System.out.println("Площадь треугольника = " + tr.area());
        System.out.println("Периметр треугольника = " + tr.pr());
    }
}