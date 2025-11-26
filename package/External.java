package see;
import cie.Personal;
import java.util.Scanner;

public class External extends Personal {
    public int seeMarks[] = new int[5];

    public void readSEE() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 SEE Marks:");
        for (int i = 0; i < 5; i++) {
            seeMarks[i] = sc.nextInt();
        }
    }
}
