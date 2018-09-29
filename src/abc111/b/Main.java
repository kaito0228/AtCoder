import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    try (PrintWriter out = new PrintWriter(System.out);
        Scanner sc = new Scanner(System.in)) {
      Task task = new Task();
      task.solve(sc, out);
      out.flush();

    } catch (Exception e) {
      // DO NOT USE
      e.printStackTrace();
    }
  }

  private static class Task {
    private void solve(Scanner sc, PrintWriter out) {
      // TODO
      int n = nint(sc);

      out.println("Hello AtCoder");
    }

    // method
    private static int nint(Scanner sc) {
      return Integer.parseInt(sc.next());
    }

    private static long nlong(Scanner sc) {
      return Long.parseLong(sc.next());
    }

    private static double ndouble(Scanner sc) {
      return Double.parseDouble(sc.next());
    }

    private static float nfloat(Scanner sc) {
      return Float.parseFloat(sc.next());
    }

    private static String nstr(Scanner sc) {
      return sc.next();
    }

    private static long[] longLine(Scanner sc, int size) {
      long[] lLine = new long[size];
      for (int i = 0; i < size; i++) {
        lLine[i] = nlong(sc);
      }
      return lLine;
    }

    private static int[] intLine(Scanner sc, int size) {
      int[] iLine = new int[size];
      for (int i = 0; i < size; i++) {
        iLine[i] = nint(sc);
      }
      return iLine;
    }

    private static String[] strLine(Scanner sc, int size) {
      String[] strLine = new String[size];
      for (int i = 0; i < size; i++) {
        strLine[i] = nstr(sc);
      }
      return strLine;
    }

    private static long maxFromList(List<Long> longList) {
      return longList.stream().max(Comparator.naturalOrder()).get();
    }

    private static long minFromList(List<Long> longList) {
      return longList.stream().min(Comparator.naturalOrder()).get();
    }

    private static int sumDigits(int n) {
      int sum = 0;
      while (n != 0) {
        sum += n % 10;
        n /= 10;
      }
      return sum;
    }

    private static long sumDigits(long n) {
      long sum = 0;
      while (n != 0) {
        sum += n % 10;
        n /= 10;
      }
      return sum;
    }

    private static List<Integer> getIntegerList(Scanner sc, int size) {
      List<Integer> list = new ArrayList<>();
      for (int i = 0; i < size; i++) {
        list.add(nint(sc));
      }
      return list;
    }

    private static List<Long> getLongList(Scanner sc, int size) {
      List<Long> list = new ArrayList<>();
      for (int i = 0; i < size; i++) {
        list.add(nlong(sc));
      }
      return list;
    }

    private static long gcd(long m, long n) {
      if (m < n) return gcd(n, m);
      if (n == 0) return m;
      return gcd(n, m % n);
    }

    private static long lcm(long m, long n) {
      return m * n / gcd(m, n);
    }
  }
}
