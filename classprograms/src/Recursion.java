public class Recursion {
    public static int add(int a, int b) {
        if (b == 0) {
            return a;
        } else if (b > 0) {
            return add(a + 1, b - 1);
        } else {
            return add(a - 1, b + 1);
        }
    }

    public static void main(String[] args) {
        int ans = add(4, 3);
        System.out.println(ans);
    }
}

