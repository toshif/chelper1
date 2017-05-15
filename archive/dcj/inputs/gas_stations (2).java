// Sample input 2, in Java.
public class gas_stations {
  public gas_stations() {
  }

  public static long GetNumKms() {
    return 4L;
  }

  public static long GetTankSize() {
    return 2L;
  }

  public static long GetGasPrice(long i) {
    switch ((int)i) {
      case 0: return 1L;
      case 1: return 2L;
      case 2: return 4L;
      case 3: return 3L;
      default: throw new IllegalArgumentException("Invalid argument");
    }
  }
}