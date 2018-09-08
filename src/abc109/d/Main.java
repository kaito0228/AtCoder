package abc109.d;

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
    }
  }

  private static class Task {
    private void solve(Scanner sc, PrintWriter out) {

      int H = nint(sc);
      int W = nint(sc);

      int[][] a = new int[H][W];

      for (int i = 0; i < H; i++) {
        for (int j = 0; j < W; j++) {
          a[i][j] = nint(sc);
        }
      }

      ArrayList<String> ans = new ArrayList<>();
      for (int i = 0; i < H; ++i) {
        for (int j = 0; j < W - 1; ++j) {
          if (a[i][j] != 0 && a[i][j] % 2 != 0) {
            a[i][j]--;
            a[i][j + 1]++;
            ans.add((i + 1) + " " + (j + 1) + " " + (i + 1) + " " + (j + 2));
          }
        }
      }

      for (int i = 0; i < H - 1; ++i) {
        if (a[i][W - 1] != 0 && a[i][W - 1] % 2 != 0) {
          a[i][W - 1]--;
          a[i + 1][W - 1]++;
          ans.add((i + 1) + " " + (W) + " " + (i + 2) + " " + (W));
        }
      }

      out.println(ans.size());
      ans.stream().forEach(out::println);
    }
  }

  // method
  static int nint(Scanner sc) {
    return Integer.parseInt(sc.next());
  }

  static long nlong(Scanner sc) {
    return Long.parseLong(sc.next());
  }

  static double ndouble(Scanner sc) {
    return Double.parseDouble(sc.next());
  }

  static float nfloat(Scanner sc) {
    return Float.parseFloat(sc.next());
  }

  static String nstr(Scanner sc) {
    return sc.next();
  }

  static long[] longLine(Scanner sc, int size) {
    long[] lLine = new long[size];
    for (int i = 0; i < size; i++) {
      lLine[i] = nlong(sc);
    }
    return lLine;
  }

  static int[] intLine(Scanner sc, int size) {
    int[] iLine = new int[size];
    for (int i = 0; i < size; i++) {
      iLine[i] = nint(sc);
    }
    return iLine;
  }

  static String[] strLine(Scanner sc, int size) {
    String[] strLine = new String[size];
    for (int i = 0; i < size; i++) {
      strLine[i] = nstr(sc);
    }
    return strLine;
  }

  static long maxFromList(List<Long> longList) {
    return longList.stream().max(Comparator.naturalOrder()).get();
  }

  static long minFromList(List<Long> longList) {
    return longList.stream().min(Comparator.naturalOrder()).get();
  }

  public static int sumDigits(int n) {
    int sum = 0;
    while (n != 0) {
      sum += n % 10;
      n /= 10;
    }
    return sum;
  }

  public static long sumDigits(long n) {
    long sum = 0;
    while (n != 0) {
      sum += n % 10;
      n /= 10;
    }
    return sum;
  }

  static List<Integer> getIntegerList(Scanner sc, int size) {
    List<Integer> list = new ArrayList<>();
    for (int i = 0; i < size; i++) {
      list.add(nint(sc));
    }
    return list;
  }

  static List<Long> getLongList(Scanner sc, int size) {
    List<Long> list = new ArrayList<>();
    for (int i = 0; i < size; i++) {
      list.add(nlong(sc));
    }
    return list;
  }
}
