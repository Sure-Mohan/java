import java.io.*;
import java.util.Scanner;
class Addition {
    int add(int x, int y) {
        return x + y;
    }
    int multiplication(int x, int y) {
        return x * y;
    }
}
public class Main {
    public static void main(String args[]) {
        Addition a = new Addition();
        System.out.println("Sum of 5 and 10 is: " + a.add(5, 10));
        System.out.println("Multiplication of 5 and 10 is: " + a.multiplication(5, 10));
    }
}
