package FunctionalReactive;

public class Lambda1 {
    public static void main(String[] args) {
        MyFunInterface fun = () -> System.out.println("hello");
        fun.myMethod();
        onTheFly( () -> System.out.println("hello") );
    }
    public static void onTheFly(MyFunInterface fun) {
        fun.myMethod();
    }
}
@FunctionalInterface
 interface MyFunInterface {
    public void myMethod();
}

