package stringManipulation;

public class IgnoreCase {
    public static void main(String[] args) {
        // when we are comparing strings ignaore case is importatnt
        // Also equals is boolean

        String s1="khan";
        String s2="KHAN";

        Boolean s3=s1.equalsIgnoreCase(s2);
        System.out.println(s3);


    }
}
