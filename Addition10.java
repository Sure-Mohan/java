import java.io.*;
import java.util.Scanner;

class Addition10 {
    int add(int x, int y) {
        return x + y;
    }

    int add(int x, int y, int z) {
        return x + y + z;
    }
}

public class Main {
    public static void main(String args[]) {
        Addition a = new Addition();
        System.out.println("Sum of 5 and 10 is: " + a.add(5, 10));
        System.out.println("Sum of 5, 10 and 15 is: " + a.add(5, 10, 15));
    }
}
