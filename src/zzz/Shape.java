package zzz;

public interface Shape {
    /*
    1. Create an Interface 'Shape' with undefined methods as calculateArea and calculate Perimiter.
    Create 2 classes Circle & Square that implements functionality defined in the Shape Interface.
    Test your code.
     */
    void calculateArea(int r);
    void calculatePerimiter(int r);
}
class Circle implements Shape{


    @Override
    public void calculatePerimiter(int r) {
        double v = 3.14 * r; // formula for perimiter is 2(πr)
        double perimiter = 2*v;
        System.out.println(perimiter);
    }

    @Override
    public void calculateArea(int r) {
        double areaCircle=3.14*r*r;
        System.out.println(areaCircle);
    }
}
class Square implements Shape{
    @Override
    public void calculateArea(int r) {
                int Area=r*r;
        System.out.println(Area);
    }

    @Override
    public void calculatePerimiter(int r) {
        int perimeter = 4 * r;
        System.out.println(perimeter);

    }
}
class Test{
    public static void main(String[] args) {
        Shape obj=new Circle();
        obj.calculateArea(6);
        obj.calculatePerimiter(5);




    }



}

