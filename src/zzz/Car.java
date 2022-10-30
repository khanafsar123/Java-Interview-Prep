package zzz;

public class Car {

    double carPrice;
    String color;

    Car(double carPrice, String color) {
        this.carPrice=carPrice;
        this.color=color;
    }

    public double SalePrice(){return carPrice;
    }
}

class Sedan extends Car {
    double length;

    Sedan(double carPrice, String color, double length) {
        super(carPrice,color);
        this.length=length;
    }
        @Override
    public double SalePrice() {
        super.SalePrice();
        double newPrice;
        if (length>20) {
           double discount = carPrice * 0.05;
           newPrice=carPrice -discount;
        } else {
            double discount = carPrice *0.1;
            newPrice=carPrice - discount;
        }
        System.out.println(newPrice);
            //System.out.println("car price after 10% discount is" + carPrice*0.9);
   return newPrice;
    }
}
class Truck extends Car {

    double weight;

    Truck(double carPrice, String color, double weight) {
        super(carPrice, color);
        this.weight = weight;
    }
        @Override
    public double SalePrice() {
        super.SalePrice();
            double newPrice;
        if (weight>2000) {
            double discount = carPrice * 0.10;
             newPrice=carPrice -discount;
        } else {
            double discount = carPrice *0.2;
             newPrice=carPrice - discount;
        }
        System.out.println(newPrice);
        return newPrice;
    }
}
class Test2{
    public static void main(String[] args) {
        Truck truck=new Truck(10000, "white", 2000);
            truck.SalePrice();

        Sedan sedan=new Sedan(10000, "white", 5000);
        sedan.SalePrice();

        Car[] arr={new Sedan(1000,"white", 1100), new Truck(5000, " black", 5800)};
        for (Car array:arr) {
            array.SalePrice();
        }
        for (int i=0; i<arr.length; i++){
            arr[i].SalePrice();
        }
    }

}