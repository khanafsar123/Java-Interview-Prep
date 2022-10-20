package stringManipulation;

public class ReverseString {

    // important differents methods explained espacially array
    public static void main(String[] args) {
        System.out.println("Method 1");

        String str="Java is good, built, afsar, zero";
        // using for loop
            String str2="";
            // length -1: because index start at zero and length starts at 1
            // i>=0 if you just do >0 it will not print the zero index value
            // this method reverse the string not character==== for character convert to array
       for (int i=str.length()-1; i>=0; i-- ) {
           str2+=str.charAt(i);
       }
        System.out.println(str2);
        System.out.println("=============================");
        char[] arr=new char[str.length()]; // Method 01: String to character
        char[] arr1=str.toCharArray();     // Method 02: string to character
        String [] arr2=str.split(" "); // Method 03> (String to String) this method will split arry after every space or any parameter provided


        String [] arr3=new String[] {str};

        String reverse="";
        for (int i=arr.length-1; i>=0; i--) {
            reverse+=str.charAt(i);
           // reverse=reverse+str.charAt(i); or we can do this

        }
        System.out.println(reverse);


        System.out.println("===========================");
        String str3="zero char built string";
        String [] arr4=new String[] {str3};
        String reverse1="";
        for (int i=arr4.length-1; i>=0; i--) {
            reverse1+=str3.charAt(i);
            // reverse=reverse+str.charAt(i); or we can do this
            System.out.println(reverse1);
        }

    }
}
