public class Old35_2 {
  public boolean old35(int n) {
    return ((n % 3 == 0 || n % 5 == 0) && (n % 15 != 0));
  }
}
// more concise:
// return (n % 3 == 0 ^ n % 5 == 0);
