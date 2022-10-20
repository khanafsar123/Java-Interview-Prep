package generalImportant;

public class Print1To100WithOutNumbers {
    public static void main(String[] args) {
        // if it was number use simple for loop
        for (int i=0; i<=100; i++) {
            System.out.print(i+" ");
        }

        System.out.println("=====requirement says no number======");
        System.out.println("=====Method 01======");

                     // declare a variable
        int one='A'/'A'; // char is basically numeric so A/A = 1
                     // now declare another varialbe
        String s1=".........."; // 10 dots meaning length is 10 so we will get 10 here
        // use for loop
                            // declared 10 dots so the lenght is 10 and multiply 10*10
        for (int i=one; i<=(s1.length() * s1.length()); i++) {
            System.out.print(i+" ");

        }
        System.out.println(" ");
        System.out.println("=====Method 02======");
        // use asci table
        int num='A'/'A';
        for (int i=num; i<='d'; i++) {
            System.out.print(i+" ");
        }




    }
}
