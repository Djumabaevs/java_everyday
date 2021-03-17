package Patterns;

public class BuilderDemo {
    public static void main(String[] args) {
        MobileBuilder mobileBuilder = new MobileBuilder();
        Mobile myMobile = mobileBuilder.with(myBuilder -> {
            myBuilder.ram = 8;
            myBuilder.battery = 7000;
            myBuilder.processor = "m10";
        }).createMobile();
        System.out.println(myMobile);
    }
}
