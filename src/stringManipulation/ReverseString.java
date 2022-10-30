package stringManipulation;

public class ReverseString {

    // important differents methods explained espacially array
    public static void main(String[] args) {
        System.out.println("Method 1");

        String str="important method for understanding";
        // using for loop
            String str2="";
            // length -1: because index start at zero and length starts at 1
            // i>=0 if you just do >0 it will not print the zero index value
            // this method reverse the string not character==== for character convert to array
       for (int i=str.length()-1; i>=0; i-- ) {
           str2+=str.charAt(i);
       }
        System.out.println(str2);

        }

    }
class ArrayReversr{
    public static void main(String[] args) {
        String str="important method for understanding";
        // convert to char array
        char[] arr=new char[str.length()];
        String rev="";
        for (int i=arr.length-1; i>=0; i--){
            rev+=str.charAt(i);

        }
        System.out.println(rev);

        String str1="important method for understanding";
        char[] arr1=str1.toCharArray();
        for (int i=arr.length-1; i>=0; i--){
            rev+=str1.charAt(i);


        }


    }
}
