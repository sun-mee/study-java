package standardprocedureofjava.chapter07.objectOrientedProgrammingll;

public class CastingTest1 {
    public static void main(String[] args) {
        Car car = null;
        FireEngine fe = new FireEngine();
        FireEngine fe2 = null;

        fe.water();
        car = fe; // (Car)fe생략
        //car.water(); //컴파일 에러 car타입의 참조변수로는 water()를 호출할 수 없다.
        fe2 = (FireEngine) car; // 자손타입 <- 조상타입
        fe2.water();
    }
}

class Car {
    String color;
    int door;

    void drive() {
        System.out.println("drive, Brrrr~");
    }

    void stop() {
        System.out.println("stop!!!");
    }
}

class FireEngine extends Car {
    void water() {
        System.out.println("water!!");
    }
}