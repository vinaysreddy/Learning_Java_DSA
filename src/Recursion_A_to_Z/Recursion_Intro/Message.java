package Recursion_A_to_Z.Recursion_Intro;

public class Message {
    public static void main(String[] args) {
        message();
    }

    static void message() {
        System.out.println("Hello World");
        message1();
    }

    static void message1() {
        System.out.println("Hello World");
        message2();
    }

    static void message2() {
        System.out.println("Hello World");
        message3();
    }

    static void message3() {
        System.out.println("Hello World");
        message4();
    }

    static void message4() {
        System.out.println("Hello World");
    }


}


/*
note[VVVV.IMP] :
1) All function calls goes into the stack memory
2) While teh function is not finished executing, it will stay in the stack
3) When function finishes executing it is removed/popped from the stack and .....
....** flow of the program is restored where that function is called **

(which in simpler terms means the execution cursor will move to next line where the call
is completed,basic rule of a function/method)

 */