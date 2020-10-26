
/**
 * Write a description of class Practice3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Practice3
{
   public static void main (String[] args) {
       long sumSquares = 0;
       long sum = 0;
       for (int i = 1; i <= 100; i++) {
           sumSquares += i*i;
           sum += i;
        }
        
        System.out.println(sum*sum - sumSquares);
    }
}