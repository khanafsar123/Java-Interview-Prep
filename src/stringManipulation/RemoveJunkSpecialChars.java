package stringManipulation;

public class RemoveJunkSpecialChars {
    public static void main(String[] args) {
        String str="123$%*abc this is )(34..";
        String s2=str.replaceAll("[^a-zA-z]", "");
        System.out.println(s2);
    }
}
