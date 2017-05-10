// Sample input 2, in Java.
public class crates {
  public crates() {
  }

  public static long GetNumStacks() {
    return 4L;
  }

  public static long GetStackHeight(long i) {
    switch ((int)i) {
      case 1: return 1L;
      case 2: return 2L;
      case 3: return 5L;
      case 4: return 1L;
      default: throw new IllegalArgumentException("Invalid argument");
    }
  }
}