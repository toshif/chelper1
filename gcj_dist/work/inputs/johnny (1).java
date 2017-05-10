// Sample input 1, in Java.
public class johnny {
  public johnny() {
  }

  public static long NumberOfCards() {
    return 4L;
  }

  public static boolean IsBetter(long i, long j) {
    if (i == 0L && j == 0L) return false;
    if (i == 0L && j == 1L) return true;
    if (i == 0L && j == 2L) return true;
    if (i == 0L && j == 3L) return true;
    if (i == 1L && j == 0L) return false;
    if (i == 1L && j == 1L) return false;
    if (i == 1L && j == 2L) return false;
    if (i == 1L && j == 3L) return true;
    if (i == 2L && j == 0L) return false;
    if (i == 2L && j == 1L) return true;
    if (i == 2L && j == 2L) return false;
    if (i == 2L && j == 3L) return false;
    if (i == 3L && j == 0L) return false;
    if (i == 3L && j == 1L) return false;
    if (i == 3L && j == 2L) return true;
    if (i == 3L && j == 3L) return false;
    throw new IllegalArgumentException("Invalid argument");
  }
}