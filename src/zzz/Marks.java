package zzz;

public abstract class Marks {
    /*
    We have to calculate the average of marks obtained in three subjects by student A and by student B.
    Create class 'Marks' with an abstract method 'getPercentage' that will be returning the average percentage of marks.
    Provide implementation of abstract method in classes 'A' and 'B' The constructor of student A takes the marks
     in three subjects as its parameters and the marks in four subjects as its parameters for student B. Test your code
     */



    abstract void getPercentage();

}
class A extends Marks{
    double subA;
    double subB;
    double subC;

    A(double subA,double subB, double subC) {
        this.subA = subA;
        this.subB = subB;
        this.subC = subC;
    }
    @Override
       void getPercentage() {
        double total=subA+subB+subC;
        double percentage=(subA+subB+subC)/3;
        System.out.println(percentage);
    }
}
class B extends A{
    double subD;
    B(double subA, double subB, double subC, double subD) {
        super(subA, subB, subC);
        this.subD=subD;
    }



    @Override
    void getPercentage() {
        double total=subA+subB+subC+subD;
        double percentage=(subA+subB+subC+subD)/4;
        System.out.println(percentage + "%");
    }
}

class TestMarks{
    public static void main(String[] args) {
        Marks obj=new A(90.5,55,55.6);
        obj.getPercentage();
        Marks obj1=new B(65,99,65.5,64);
        obj1.getPercentage();

    }
        }
