import java.util.Scanner;

public class MyScanner
{

    public void run() {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter(",|/n");
        while (true) {
            String nxt = scanner.next();
            System.out.println(nxt);
        }
    }

    public static void main (String[] args) {
        MyScanner myscanner = new MyScanner();
        MyScanner.run();
    }
}
