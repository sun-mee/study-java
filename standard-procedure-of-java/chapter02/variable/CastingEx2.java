package standardprocedureofjava.chapter02.variable;

public class CastingEx2 {
    public static void main(String[] args) {
        int i = 10;
        byte b = (byte)i;
        System.out.printf("[int -> byte] i=%d -> b=%d%n", i, b); // i=10 -> b=10

        i = 300;
        b = (byte)i;
        System.out.printf("[int -> byte] i=%d -> b=%d%n", i, b); // i=300 -> b=44

        b = 10;
        i = (int)b;
        System.out.printf("[byte -> int] b=%d -> i=%d%n", b, i); // b=10 -> i=10

        b = -2;
        i = (int)b;
        System.out.printf("[byte -> int] b=%d -> i=%d%n", b, i); // b=-2 -> i=-2

        System.out.printf("i="+Integer.toBinaryString(i)); // i=11111111111111111111111111111110
    }
}
