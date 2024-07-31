public class Palyndrome {
  public static void main(String[] args) {
    Palyndrome p = new Palyndrome();
    boolean result = p.isPalindrome(121);
    System.out.println(result);
  }

  /*
   * O(d) time complexity where d is the number of digits in the number. O(1)
   */
  public boolean isPalindrome(int x) {
    String n = Integer.toString(x); // O(d)
    int left = 0; // O(1)
    int right = n.length() - 1; // O(1)

    if (n.length() == 1) { // O(1)
      return true;
    }

    for (int i = 0; i < n.length() / 2; i++) { // O(d/2) => O(d)
      if (n.charAt(left) != n.charAt(right)) { // O(1)
        return false;
      }
      left++; // O(1)
      right--; // O(1)
    }
    return true; // O(1)
  }
}
