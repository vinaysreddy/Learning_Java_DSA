package recursion_A_to_Z.recursion_Intro;

public class FibonacciRecursion {
    public static void main(String[] args) {

        //fibo series : 0,1,1,2,3,5,8,13,21 . ...
        int ans = fibo(4);
        System.out.println(ans);

    }

    static int fibo(int n) {

        //Base condition
        if (n < 2) {
            return n;
        }
        return fibo(n - 1) + fibo(n - 2);
    }
}

/*

order of execution

Step 0 — Initial Call
fibo(4)
--------------------------
Step 1 — Expand fibo(4)
fibo(4)
= fibo(3) + fibo(2)

Stack (top → bottom):
fibo(4)
 ├── fibo(3)
 └── fibo(2)
--------------------------
Step 2 — Expand fibo(3)
fibo(3)
= fibo(2) + fibo(1)
Stack:
fibo(4)
 ├── fibo(3)
 │    ├── fibo(2)
 │    └── fibo(1)
 └── fibo(2)
--------------------------
Step 3 — Expand fibo(2)
fibo(2)
= fibo(1) + fibo(0)
--------------------------
Stack (full expansion):
fibo(4)
 ├── fibo(3)
 │    ├── fibo(2)
 │    │    ├── fibo(1)
 │    │    └── fibo(0)
 │    └── fibo(1)
 └── fibo(2)
      ├── fibo(1)
      └── fibo(0)

fibo(2) = 1 + 0 = 1
fibo(3) = fibo(2) + fibo(1) = 1 + 1 = 2
fibo(4) = fibo(3) + fibo(2) = 2 + 1 = 3
 */