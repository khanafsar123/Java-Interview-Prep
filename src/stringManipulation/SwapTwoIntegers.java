package stringManipulation;

public class SwapTwoIntegers {
    public static void main(String[] args) {
        // introducing a local variable

        int num=9;
        int num1=10;

        int temp;

        temp = num;
        num = num1;
        num1 = temp;

        System.out.println(num);
        System.out.println(num1);

        // without temp num

        int x=9;
        int y=10;

        x=x+y; // 19
        y=x-y; // 9
        x=x-y;  // 10

        System.out.println(x);
        System.out.println(y);


        // by multiplication and division

        int a=6;
        int b=7;

        a=a*b; //42
        b=a/b; // 6
        a=a/b; // 7

        System.out.println(a);
        System.out.println(b);


        // by ^

        int c=3;
        int d=4;

        c=c^d;
        d=c^d;
        c=c^d;

        System.out.println(c);
        System.out.println(d);



    }
}
