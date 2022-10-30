package zPractice;

public class Printwithoutloop {
    public static void print(int num) {
        if (num<=100) {
            System.out.println(num+" ");
            num++;
            print(num);
        }}

    public static void main(String[] args) {
        print(1);



    int a='d'/'d'; // 1
    String str="..........";

    for (int i=a; i<=(str.length() * str.length());  i++) {
        System.out.println(i);
    }

}
}