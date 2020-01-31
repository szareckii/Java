public class Methods {
    public static void main(String[] argv) {
        int a = getSum(2, 3);
        int b = getSum(5, 6);

        System.out.println(a);
        System.out.println(b);
    }

    static int getSum(int x, int y) {
        return x + y;
    }
}
