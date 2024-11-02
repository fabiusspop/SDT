package L01.Builder;

public class CarTest {

    public static void main(String[] args)
    {
        Car myCar = new Car.Builder("golf 4", 2002, 75, "benzinar tata", "BMW")
                .sound(Car.Sound.Mp3)
                .navigation(Car.Navigation.SMALL)
                .build();
        System.out.println(myCar);
    }
}
