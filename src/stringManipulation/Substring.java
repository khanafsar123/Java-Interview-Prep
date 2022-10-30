package stringManipulation;

public class Substring {
    public static void main(String[] args) {

        // we have tow method one is range and the second is just give the begining indes
        // we need two begning index and ending indes to make a substring
        String s1="the java programing is easy but we need more practice";

        // with beging and ending index
        String s2=s1.substring(27,40);
        System.out.println(s2);

        // second method
        System.out.println(s1.substring(27));


    }
}
