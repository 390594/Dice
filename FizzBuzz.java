public class FizzBuzz

{
    public void run() {
        for (int i = 1; i <= 100; i++)
        {
            if ( i/10.0 == 5 || i/10.0 == 0 ) {
                System.out.println("Buzz");
            }
        }
    }    

    public static void main(String[] args)
    {
        FizzBuzz hw = new FizzBuzz();
        hw.run();
    }
}
