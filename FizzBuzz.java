public class FizzBuzz

{
    public void run() {
        int i = 1;
        while (i >= 1 && i <= 100) {
            System.out.println(i);
            i += 1;
        }

        if (i/3.0 == i/5.0 ) {
            System.out.println("FizzBuzz");
        } else {
            System.out.println(i);
        }
        }
    }

    public static void main(String[] args)
    {
        FizzBuzz hw = new FizzBuzz();
        hw.run();
    }
}
