package Array;

public class LargestAndSmallest {
    public static void main(String[] args) {
      int[] arr={-88, -10, 100, 4, 1, 1000, 11000, 140};

      // declare two variables Max and Min
        // we assume the zero index is the largest
        // same for the smallest

        int largestNo = arr[0];
        int smallestNo = arr[0];

        // for loop start from 1st index becuase we already assumed that smallest and largest no on the 0 index

        for (int i=1; i<arr.length; i++){
            // now if condition
            // if number of i is greater is largest number store that into the largest number
            if(arr[i] > largestNo){
                // store the number into the largest number
                largestNo = arr[i];
            } else if (arr[i] < smallestNo) {
                smallestNo = arr[i];
            }
        }
        System.out.println("Largest Number is::"+largestNo);
        System.out.println("Smallest Number is::"+ smallestNo);




    }}
