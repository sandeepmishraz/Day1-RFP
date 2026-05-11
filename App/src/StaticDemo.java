public class StaticDemo {

    static int count;

    static {
        System.out.println("Static block executed");
        count = 10;
    }

    static void display() {
        System.out.println("Static method called. Count = " + count);
    }

    public static void main(String[] args) {
        display();
    }
}