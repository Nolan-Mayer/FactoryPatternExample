import java.util.*;

/**
 * Main class for CMP 357 PA 4.
 *
 */
public class Main {
  /**
   * Application entry point.
   *
   * @param args Command-line arguments; ignored by this app
   */
  public static void main(String[] args) {
    PRNGFactory fac = new PRNGFactory();
    int[] arr = new int[5];
    String[] prngNames = {"glibc", "VB", "RtlUniform", "CarbonLib", "minstd_rand"};

    for(String prngName : prngNames) {
      PRNG prng = fac.getPRNG(prngName);
      for(int i = 0; i < 5; i++) {
        arr[i] = prng.nextInt();
      }
      System.out.println("5 \"random\" ints from " + prngName);
      System.out.println("\t" + Arrays.toString(arr) + "\n");
    }
  }
}
