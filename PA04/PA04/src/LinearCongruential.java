

public class LinearCongruential implements PRNG {

  private int M;
  private int A;
  private int C;
  private int X0 = 68333;

  public LinearCongruential(int m, int a, int c){
    M = m;
    A = a;
    C = c;
  }  

  public int nextInt(){
    X0 = (A * X0 + C) % M;
    return X0;
  }
  
}