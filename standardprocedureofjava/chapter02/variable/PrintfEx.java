package standardprocedureofjava.chapter02.variable;

public class PrintfEx {
    public static void main(String[] args) {
        int age = 32;
        int year = 2023;
        System.out.printf("age: %d", age); // age: 32
        System.out.printf("age: %d", 14); //age: 14
        System.out.printf("age:14"); //age:14

        System.out.printf("age: %d year:%d", age, year); // age: 32 year:2023
        System.out.printf("age: %d year:%d", 15, 2020); //age: 32 year:2023

        System.out.printf("age: %d %n year:%d", 15, 2020);

        byte b = 1;
        short s = 2;
        char c = 'A';

        int finger = 10;
        long big = 100_000_000_000L;
        long hex = 0xFFFF_FFFF_FFFF_FFFFL;

        int octNum = 010;
        int hexNum = 0x10;
        int binNum = 0b10;

        System.out.printf("b=%d%n", b); // b=1
        System.out.printf("s=%d%n", s); // s=2
        System.out.printf("c=%c, %d %n", c, (int)c); // c=A, 65
        System.out.printf("finger=[%5d]%n", finger); //finger=[   10]
        System.out.printf("finger=[%-5d]%n", finger); //finger=[10   ]
        System.out.printf("finger=[%05d]%n", finger); //finger=[00010]
        System.out.printf("big=%d%n", big); //big=100000000000
        System.out.printf("hex=%#x%n", hex); // '#'은 접두사 (16진수 0x, 8진수 0) hex=0xffffffffffffffff
        System.out.printf("octNum=%o, %d%n", octNum, octNum); //octNum=10, 8
        System.out.printf("octNum=%x, %d%n", hexNum, hexNum); //octNum=10, 16
        System.out.printf("octNum=%s, %d%n", Integer.toBinaryString(binNum), binNum); //octNum=10, 2
    }
}
