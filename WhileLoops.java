
/**
 * Write a description of class WhileLoops here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class WhileLoops
{
    int a = 5;
    int b = 2;
    int c = 1;
    int d = -8;
    public void run() {
        int i = 0;
        while (i < 10) {
            System.out.println("i is " + i + "but less than 10");
            i++;
        }
            System.out.println(" ");
        while (i < 15) {
            System.out.println("i is " + i + "but less than 15");
            i++;
        }
            System.out.println(" ");
        int k = 10;
        while (k > 5) {
            System.out.println("k is " + k + "but less than 5");
            k--;
        }
            System.out.println(" ");
        while (a < 10 && b <= 20) {
            System.out.println("a is " + a + " and b is " + b);
            a++;
            b++;
        }
    }
    
    public static void main(String[] args)
    {
        WhileLoops hw = new WhileLoops();
        hw.run();
    }
    
}