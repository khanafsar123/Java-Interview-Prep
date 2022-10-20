package generalImportant;

public class Print1to100WithoutLoop {
    /*
    Print number 1-100 without using loop
     */
    // create a method

    public static void printNumber(int num){     // static method banay, hm object create kiye baghair call kr sakty hain
        if (num<=100){
            System.out.print(num+" ");          // number agr 100 sy kam hy to print karo
            num++;                              // jab tak 100 nhe hot 1 add karo,
            printNumber(num);                   // num add karo agr 100 sy kam hy to method recall karo
        }}

    public static void main(String[] args) {
        printNumber(1);

    }

}
