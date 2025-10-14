package Recursion_A_to_Z.Recursion_Intro;

public class NumbersExampleRecursion {
    //write a function that takes in a number and print it
    // print first 5 numbers : 1 2 3 4 5

    public static void main(String[] args) {
        print(1);
    }

    static void print(int n) {
        // why adding this check
        // This is known as Base condition of the recursion : Used to stop making new calls
        if (n > 5) {
            return;
        }
        System.out.println(n);

        // recursive call
        // if you are calling a function again and again, you can treat it as separate call in the stack
        print(n + 1);
    }
}

/*
What happens if we ignore Base Condition?
No Base condition->call happens again and again->
->That means stack gets filled continuously
->Takes memory->At one point Memory exceeds->
->Leads to StackOverflowError


Why Recursion?
1) It helps in solving Bigger and complex problems in simple way
2) You can convert the recursion solution to iterative solution and vice versa
3) Space complexity is not constant because of recursive calls
4) It helps us in breaking bigger problems into smaller problems

****** Visualising Recursion (VVVVVV.IMP)->RECURSION TREE
in the above program

[program start] main()->print(1)->print(2)->print(3)->print(4)->print(5) then
the call goes in reverse by popping from stack pop
[print(5)->print(4)->print(3)->print(2)->print(1)->main()[program end]]

RECURSION TREE:
-> A recursion tree is a visual representation of the recursive calls made
   by a recursive algorithm.
-> It helps you understand how a recursive function breaks a problem into smaller
   subproblems and how the total time complexity adds up.




*/