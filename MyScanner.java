import java.util.Scanner;

public class MyScanner
{

    public void run() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            if (scanner.hasNext()) {
                String str1 = scanner.next();
                System.out.println(str1);
            } else if (scanner.hasNextInt()) {
                String str2 = scanner.next();
                System.out.println(str2);
            } else if (scanner.hasNextInt()) {
                String str3 = scanner.next();
                System.out.println(str3 + str3 + str3);
            }        
        }
    }

    public static void main(String[] args) {
        MyScanner myScanner = new MyScanner();
        myScanner.run();
    }
}

