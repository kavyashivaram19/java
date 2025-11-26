package cie;
import java.util.Scanner;

public class Internals {
    public int internalMarks[] = new int[5];

    public void readInternals() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 Internal Marks:");
        for (int i = 0; i < 5; i++) {
            internalMarks[i] = sc.nextInt();
        }
    }
}
