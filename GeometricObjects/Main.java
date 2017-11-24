public class Main {

    public static void main(String[] args) {
        Circle circleA = new Circle(10, "green", true);
        Rectangle rectangleA = new Rectangle(10,20, "blue", false);
        System.out.println(circleA.toString());
        System.out.println(rectangleA.toString());
    }
}
