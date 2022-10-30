package Array;

import java.util.HashSet;

public class DuplicateElements {
    public static void main(String[] args) {
     // For Strings
        String [] names = {"java","javaScript","ruby","c++","java", "c++"};
        // compare 1 element with everyElement

        for (int i=0; i<names.length; i++) {
            // if i=java
            // j will be javaScript because below we did j=i+1;
            for(int j=i+1; j< names.length; j++) {
            // now compare i and j
                if(names[i].equals(names[j])){
                    System.out.println("duplicate element is: " +names[i]);
                }

            }
        }

    }}
