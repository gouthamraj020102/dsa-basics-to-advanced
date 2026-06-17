public class Recursion {
    public static void main(String[] args) {
        int n = 15;
        func(n);
    }

    public static void func(int num) {
        if (num == 0) {
            return;
        }
        System.out.println(num);
        num = num - 1;
        func(num);
    }

}
