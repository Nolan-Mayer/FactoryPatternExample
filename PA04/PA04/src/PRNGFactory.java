
public class PRNGFactory {

  PRNG result = null;

  public PRNG getPRNG(String prng) {

    if (prng.equals("glibc")) {
      result = new LinearCongruential(0x80000000, 1103515245, 12345);
    } else if (prng.equals("VB")) {
      result = new LinearCongruential(16777216, 1140671485, 12820163);
    } else if (prng.equals("RtlUniform")) {
      result = new LinearCongruential(0x7FFFFFFF, 2147483629, 2147483587);
    } else if (prng.equals("CarbonLib")) {
      result = new LinearCongruential(0x7FFFFFFF, 16807, 0);
    } else if (prng.equals("minstd_rand")) {
      result = new LinearCongruential(0x7FFFFFFF, 48271, 0);
    }

    return result;

  }

}