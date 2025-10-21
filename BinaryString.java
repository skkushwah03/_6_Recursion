package _6_Recursion;

public class BinaryString {
    public static void printBinaryString(int n, String ans) {
        if (n == 0) {
            System.out.println(ans);
            return;
        }
        printBinaryString(n - 1, ans + "0");
        printBinaryString(n - 1, ans + "1");
    }
    public static void main(String[] args) {
        printBinaryString(3, "");
    }
}
