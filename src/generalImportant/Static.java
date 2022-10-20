package generalImportant;

public class Static {
    // 1. Create a static block
    static {                    //static block is executed first we can have multile static method differnt variation
        System.out.println("static block");
    }
    static {
        System.out.println("static block2");
    }

    public static void main(String[] args) {
        System.out.println("main method");
    }
    static {
        System.out.println("static block3");
    }

    /*
                static can be anywher in class, and is sequentially executed
                java gives priority to static, so it will be executed first no matter where in the class
     */
}
