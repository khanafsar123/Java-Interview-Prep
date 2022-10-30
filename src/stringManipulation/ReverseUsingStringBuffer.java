package stringManipulation;

public class ReverseUsingStringBuffer {
    public static void main(String[] args) {
        String str="built string afsar";
        StringBuilder str1=new StringBuilder(str);
        str1.reverse();
        System.out.println(str1);

    }
}
