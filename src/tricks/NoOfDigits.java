package tricks;

public class NoOfDigits {
    public static void main(String[] args) {
        int n=100;
        int digits=(int)Math.log10(n)+1; // no of digits
        System.out.println(digits);
    }
}
