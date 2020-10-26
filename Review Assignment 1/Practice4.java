
/**
 * Write a description of class Practice4 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Practice4
{
  public static void main (String[] args) {
      for (int a = 1; a <= 1000; a++) {
          for (int b = 1; b <= 1000; b++) {
              double c = (Math.sqrt(a*a + b*b));
              if (a + b + c == 1000) {
                  System.out.println("A = " + a + ", B = " + b + ", C = " + c); 
                  System.out.println("A x B x C" + (a * b * c));
                }
            }
        }
    }
} 