package recursion_A_to_Z.recursion_Level_1;

public class New {
    public static void main(String[] args) {

        int x=0012;
        System.out.println(pali(120000, 0));
        System.out.println(x);

    }

    static int pali(int n, int count) {
        if (n == 0) {
            return count;
        }
        int REM = (n % 10);

        if (REM == 0) {
            return pali(n / 10, count + 1);
        }
        return pali(n / 10, count);

    }


}
