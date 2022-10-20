package generalImportant;

public class Static3 {
    // Q#4: how to create object if we make the constructor private?

    int age;

    static {
        Static3 obj1=new Static3(3);
    }

    private Static3(int age){
        this.age=age;
    }

    public static void main(String[] args) {
        Static3 obj=new Static3(3); // we can create object for the private constructor within same class
                // we can not call the private method outside the class it will give error
                // simple solution is to create a static block and paste the created obj inside
                // like I did above the constructor

    }








}
