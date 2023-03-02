public class TestGeoObject {
    public static void main(String[] args) {
       Square[] object={new Square(10.0),new Square(2.0)};
       for (int i = 0; i < object.length; i++) {
        if (object[i] instanceof Colorable) {
            System.out.println(object[i].getArea());
            System.out.println(object[i].howToColor());
        }
       }
       

    }
}
