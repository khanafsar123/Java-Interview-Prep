package zPractice;

public class PrimeNumber {
    public static void main(String[] args) {
     int num=4;
     boolean isPrime=true;


     for (int i=2; i<num; i++){
         if(num%i==0) {
             isPrime=false;
         }
     }

     if(num>1 && isPrime) {
         System.out.println(num + " is Prime");
     } else {
         System.out.println(num +" is not Prime");
     }



    }}
