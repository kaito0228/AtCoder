package abc115.a;

import java.io.PrintWriter;
import java.util.*;

/**
 * Hello AtCoder.
 *
 * @author kaito0228
 */
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

      StringBuilder ans = new StringBuilder();
      ans.append("Christmas");
      switch (n) {
        case 22:
          ans.append(" Eve");
        case 23:
          ans.append(" Eve");
        case 24:
          ans.append(" Eve");
      }
      out.println(ans.toString());
    }

    // method
    /**
     * Returns an int. int値を受け取り、返します。
     *
     * @param sc Scanner
     * @return int
     */
    private static int nint(Scanner sc) {
      return Integer.parseInt(sc.next());
    }

    /**
     * Returns a long. long値を受け取り、返します。
     *
     * @param sc Scanner
     * @return long
     */
    private static long nlong(Scanner sc) {
      return Long.parseLong(sc.next());
    }

    /**
     * Returns a double. double値を受け取り、返します。
     *
     * @param sc Scanner
     * @return double
     */
    private static double ndouble(Scanner sc) {
      return Double.parseDouble(sc.next());
    }

    /**
     * Returns a String. 文字列を受け取り、返します。
     *
     * @param sc Scanner
     * @return String
     */
    private static String nstr(Scanner sc) {
      return sc.next();
    }

    /**
     * Returns a int array. int値を受け取り、配列にして返します。
     *
     * @param sc Scanner
     * @param length Array length
     * @return int array
     */
    private static int[] intLine(Scanner sc, int length) {
      int[] iLine = new int[length];
      for (int i = 0; i < length; i++) {
        iLine[i] = nint(sc);
      }
      return iLine;
    }

    /**
     * Returns a long array. long値を受け取り、配列にして返します。
     *
     * @param sc Scanner
     * @param length Array length
     * @return long array
     */
    private static long[] longLine(Scanner sc, int length) {
      long[] lLine = new long[length];
      for (int i = 0; i < length; i++) {
        lLine[i] = nlong(sc);
      }
      return lLine;
    }

    /**
     * Returns a String array. 文字列を受け取り、配列にして返します。
     *
     * @param sc Scanner
     * @param length Array length
     * @return String array
     */
    private static String[] strLine(Scanner sc, int length) {
      String[] strLine = new String[length];
      for (int i = 0; i < length; i++) {
        strLine[i] = nstr(sc);
      }
      return strLine;
    }

    /**
     * Returns the maximum value in the list. リスト内で最大値を返します。
     *
     * @param longList List
     * @return long maximum value
     */
    private static long maxFromList(List<Long> longList) {
      return longList.stream().max(Comparator.naturalOrder()).get();
    }

    /**
     * Returns the minimum value in the list. リスト内で最小値を返します。
     *
     * @param longList List
     * @return long minimum value
     */
    private static long minFromList(List<Long> longList) {
      return longList.stream().min(Comparator.naturalOrder()).get();
    }

    /**
     * Returns the sum of each digit. 各桁の和を返します。
     *
     * @param n int
     * @return sum of each digit
     */
    private static int sumDigits(int n) {
      int sum = 0;
      while (n != 0) {
        sum += n % 10;
        n /= 10;
      }
      return sum;
    }

    /**
     * Returns the sum of each digit. 各桁の和を返します。
     *
     * @param n long
     * @return sum of each digit
     */
    private static long sumDigits(long n) {
      long sum = 0;
      while (n != 0) {
        sum += n % 10;
        n /= 10;
      }
      return sum;
    }

    /**
     * Return a list of Integer. Integerのリストを返します。
     *
     * @param sc Scanner
     * @param size list size
     * @return list
     */
    private static List<Integer> getIntegerList(Scanner sc, int size) {
      List<Integer> list = new ArrayList<>();
      for (int i = 0; i < size; i++) {
        list.add(nint(sc));
      }
      return list;
    }

    /**
     * Return a list of Long. Longのリストを返します。
     *
     * @param sc Scanner
     * @param size list size
     * @return list
     */
    private static List<Long> getLongList(Scanner sc, int size) {
      List<Long> list = new ArrayList<>();
      for (int i = 0; i < size; i++) {
        list.add(nlong(sc));
      }
      return list;
    }

    /**
     * Returns the summation of list. リストの要素の合計値を返します。
     *
     * @param list List<Integer>
     * @return sum of list
     */
    private static int sumList(List<Integer> list) {
      int sum = 0;
      for (Integer n : list) {
        sum += n;
      }
      return sum;
    }

    /**
     * Returns the average of list. リストの要素の平均値を返します。
     *
     * @param list List<Integer>
     * @return average of list
     */
    private static double aveList(List<Integer> list) {
      return (double) sumList(list) / list.size();
    }

    /**
     * Returns the greatest common divisor of the two given values. 与えた2つの値の最大公約数を返します。
     *
     * @param m long
     * @param n long
     * @return greatest common divisor
     */
    private static long gcd(long m, long n) {
      if (m < n) return gcd(n, m);
      if (n == 0) return m;
      return gcd(n, m % n);
    }

    /**
     * Returns the least common multiple of the two given values. 与えた2つの値の最小公倍数を返します。
     *
     * @param m long
     * @param n long
     * @return least common multiple
     */
    private static long lcm(long m, long n) {
      return m * n / gcd(m, n);
    }

    /**
     * Returns the most frequent value in the list. リスト内で最頻出数値を返します。
     *
     * @param list List
     * @return most frequent value
     */
    private static Integer mode(List<Integer> list) {
      if (list.size() <= 0) {
        throw new IllegalArgumentException();
      }

      Map<Integer, Integer> modeMap = new HashMap<>();

      for (Integer x : list) {
        if (modeMap.containsKey(x)) {
          modeMap.put(x, modeMap.get(x) + 1);
        } else {
          modeMap.put(x, 1);
        }
      }

      int maxValue = 0;
      int maxKey = 0;

      for (Map.Entry<Integer, Integer> entry : modeMap.entrySet()) {
        if (maxValue < entry.getValue()) {
          maxValue = entry.getValue();
          maxKey = entry.getKey();
        }
      }

      return maxKey;
    }
  }
}
