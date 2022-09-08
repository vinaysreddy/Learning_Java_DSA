package tricks;

public class EvenUsingBitwiseOperator {
    public static void main(String[] args) {
        int num = 5;

        System.out.println(xor(num) == true ? "EVEN" : "ODD");// XOR even^1 == number+1 odd^1=num-1
        System.out.println(and(num) == true ? "EVEN" : "ODD");// AND even&1=0   odd&1=1
        System.out.println(or(num) == true ? "EVEN" : "ODD");//5|1=5  4|1is always >4

    }

     static boolean or(int num) {
        if((num | 1)==num) return false;
        return true;
    }

    static boolean xor(int num) {
        if ((num ^ 1) == num + 1) return true;
        return false;
    }

    static boolean and(int num) {
        if ((num & 1) == 0) return true;
        return false;
    }
}
