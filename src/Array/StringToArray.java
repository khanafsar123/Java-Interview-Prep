package Array;

public class StringToArray {
    public static void main(String[] args) {
        String str="Converting String to Array";
        // Method 01 - Char Array
        char[] arr=new char[str.length()];
        // Method 02 - Char Array
        char[] arr1=str.toCharArray();

        // Method 03 (String Array)
        String[] arr2=str.split(" ");
        // Method 04 (String Array)
        String[] arr3=new String[]{str};

        String rev="";
        for (int i=arr2.length-1; i>=0; i--){
            rev+=arr2[i]+" ";

        }
        System.out.println(rev+" ");


    }
}
