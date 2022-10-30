package Array;

public class MissingNumber {
    public static void main(String[] args) {
         //     int [] n={1,2,3,5};
        //      in simple math we will do like sum all number and thn we will do add the missing number and subtract
        //       sum n= 1+2+3+5    = 11 > with missing number
        //      sum n1= 1+2+3+4+5 = 15 > witout missing number
        //      now n1-n2 = 4 missing number

        int [] n={1,2,3,4,5,6,8,9};
        int sum=0;

        for (int i=0; i<n.length; i++){
            sum=sum+n[i];

        }
        System.out.println(sum);

        // now use another for loop that will take all the values
        int sum1=0;
        for (int j=0; j<=9; j++) {
            sum1 = sum1+j; // we are not taking any array so directly take j
        }
        System.out.println(sum1);

        // now simply sum1 - sum

        int missingNumber = sum1 - sum;

        System.out.println("Missin Number is: " + missingNumber);



    }
}
