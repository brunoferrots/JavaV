package thread;

public class Main {
    public static void main(String[] args) {
        new Thread(() -> System.out.println("Testing")).start();

    }
}
