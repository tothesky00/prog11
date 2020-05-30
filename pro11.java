import java.util.Scanner;

public class pro11 {

    public static void main(String[] args) {
         Array.run();
    }
}

class Array {
    private int[] intArray;
    static private int n;

    Array(int n) {
        this.intArray = new int[n];
    }

    private static Scanner sc = new Scanner(System.in);

    private static Array create() {
        System.out.println("create Array");
        System.out.print("Length = ");
        n = sc.nextInt();
        Array Massiv = new Array(n);
        for (int i = 0; i < n; i++) {
            System.out.print("Array[" + i + "] = ");
            Massiv.intArray[i] = sc.nextInt();
        }
        return Massiv;
    }

    static private Array Massive = create();

    private static void view() {
        System.out.println("view");
        for (int i = 0; i < n; i++) {
            System.out.print("Array[" + i + "] = ");
            System.out.println(Massive.intArray[i]);
        }
    }

    private static void sort(){
        System.out.println("sort done");
        int b;
        for (int i = 0; i < n; i++) {
            for (int k = 0; k < n; k++){
                if (Massive.intArray[k] > Massive.intArray[i]) {
                    b = Massive.intArray[k];
                    Massive.intArray[k] = Massive.intArray[i];
                    Massive.intArray[i] = b;
                }
            }
        }
    }


    public static void run(){
        System.out.println("Array");
        view();
        sort();
        view();
        System.out.println("Array done");
        System.out.println(" ");
    }

}