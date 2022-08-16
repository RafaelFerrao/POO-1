public class App {
    public static void main(String[] args) throws Exception {
        Clock c1 = new Clock();
        c1.initialize(23, 58);
        System.out.println(c1.clockEvent());
        System.out.println(c1.clockEvent());
        System.out.println(c1.clockEvent());
        System.out.println(c1.clockEvent());
        System.out.println(c1.clockEvent());
        System.out.println(c1.clockEvent());

    }
}
