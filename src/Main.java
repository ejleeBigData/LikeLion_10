public class Main {

    public static String publicFiled = "퍼블릭";

    public static void main(String[] args) {

        System.out.println(publicFiled);

    }
}

class Child extends Main {
    public Child() {
        System.out.println(Main.publicFiled);
    }
}