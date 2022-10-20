package generalImportant;

public class static1 {
    //    Q2. How can we run a java program without making any object?

    // static block is called automatically by jvm if you run program just by creating the main method
    // alway remember static block is first priority
    // static method we have to call.
    // remember no need to create object for the static method

    public static void test(){
        System.out.println("Static method");

    }

    static {
        System.out.println("static block");
    }
    public static void main(String[] args) {
        test(); // for static no need to create the object
        static1.test(); // or call by class name

    }
        //Question#3: differences and similirities between static block and static method
    /*      Difference:
            Static block will run automatically when class is loaded.
            static method we will call by method name or with the class name
            we can call static method inside another method.
            Similirities:
            we do not need to create the object for both
     */


}
