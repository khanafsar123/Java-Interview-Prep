package stringManipulation;

public class ReverseAnInteger {
    public static void main(String[] args) {
        // reverse function is not working on integer so use string buffer\
        int num3=123456;
        // first convert integer to string by using built in function String.valueOf(integer variable)
        StringBuffer num2=new StringBuffer(String.valueOf(num3));
        System.out.println(num2.reverse());



        // Method 02
        int num=123459;
        // declare a variable
        int rev=0;

        // now use while loop

        while (num!=0){
            rev = rev *10 + num % 10; // num%10 = 5    reverse =0*10 = 0 so 0+5 =5,
            num = num/10; // 12345/10 = 1234
        }
        System.out.println("Reverse num is: "+rev);





    }
}
