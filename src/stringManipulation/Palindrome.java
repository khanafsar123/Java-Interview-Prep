package stringManipulation;

public class Palindrome {
    public static void main(String[] args) {

        String str="Mom";
        String rev="";
        for (int i=str.length()-1; i>=0; i--) {
            rev += str.charAt(i);
        }
        if(str.toLowerCase().equals(rev.toLowerCase()))
        {
            System.out.println(str + " is Palindrome");
        } else {
            System.out.println(str + " is not palindrome");
                }

    }
}
