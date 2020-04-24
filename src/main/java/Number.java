public class Number {
  private int number;

  public Number(int number) {
    this.number = number;
  }

  public boolean isFactorOf(int factor) {
    return factor % number == 0;
  }
}
