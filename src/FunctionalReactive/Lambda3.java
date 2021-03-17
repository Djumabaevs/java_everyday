package FunctionalReactive;

public class Lambda3 {
    public static void main(String[] args) {
        Name name = () -> System.out.println("hello");
        name.myName();
        MathOperation add = ((a, b) -> System.out.println(a+b));
        add.operation(10,20);
        LengthOfString len = str -> str.length();
        int a = len.length("BasicsStrong");
        System.out.println(a);

    }
}
@FunctionalInterface
interface Name {
    public void myName();
}
interface MathOperation {
    public void operation(int a, int b);
}
interface LengthOfString {
    int length(String s);
}
