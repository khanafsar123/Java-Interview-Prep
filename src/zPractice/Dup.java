package zPractice;

public class Dup {
    public static void main(String[] args) {
        int [] num={5,10,15,333,77,1,-5,10000};
        int largest=num[0];
        int smallest=num[0];

        for (int i=0; i< num.length; i++){
            if(num[i]>largest){
                largest=num[i];
            }


        }
        System.out.println("largest number is:: "+largest);

        System.out.println("Smallest number");
        for(int i=0; i<num.length; i++) {
            if(num[i]<smallest){
                smallest=num[i];
            }
        }
        System.out.println("smallest number is:: "+smallest);



            }}