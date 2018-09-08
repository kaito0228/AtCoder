package abc109.d;

import java.io.PrintWriter;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        try (PrintWriter out = new PrintWriter(System.out); Scanner sc = new Scanner(System.in);) {
            Task task = new Task();
            task.solve(sc, out);
            out.flush();

        } catch (Exception e) {
            // DO NOT USE
        }
    }

    static class Task {
        public void solve(Scanner sc, PrintWriter out) {

            int h = nint(sc);
            int w = nint(sc);

            int[][] a = new int[h][w];

            int stock = 0;
            boolean flag = false;

            for (int i = 0; i < h; i++) {
                stock = 0;
                flag = false;
                for (int j = 0; i < w; i++) {
                    stock = nint(sc);
                    flag = true;

                    if (stock % 2 != 0){
                        stock--;
                        flag = true;
                    }
                    a[i][j] = stock;
                }
            }


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