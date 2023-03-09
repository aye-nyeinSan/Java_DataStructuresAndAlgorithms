public class TestCircle {
    public static void main(String[] args) {
        Circle c1=new Circle(12.0);
        Circle c2=new Circle(12.0);
        System.out.println(c1.equals(c2));
        System.out.println(c1.compareTo(c2));
    }
}
