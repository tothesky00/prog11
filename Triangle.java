import java.util.Scanner;

public class Triangle {
    int a, b, c;
    Triangle(int sa, int sb, int sc)
    {
        a = sa;
        b = sb;
        c = sc;
    }
    double pr() // площадь треугольника
    {
        return a + b + c;
    }
    double area() // площадь треугольника
    {
        double p = (a + b + c) / 2;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }

}
class Test1 {
    public static void main(String[] args)
    {
        Triangle tr = new Triangle(3, 4, 5);
        System.out.println("Площадь треугольника = " + tr.area());
        System.out.println("Периметр треугольника = " + tr.pr());
    }
}