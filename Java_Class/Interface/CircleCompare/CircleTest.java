/**
 * CircleTest
 */
public class CircleTest {
public static void main(String[] args) {
    ComparableClassCircle c1=new ComparableClassCircle(10.0);
    ComparableClassCircle c2=new ComparableClassCircle(20.0);
    if (c1 instanceof Circle && c2 instanceof Circle) {
        if (c1.compareTo(c2)==1) {
            System.out.print("Maximal circle's radius is "+c1.getRadius());
        }
        else  System.out.print("Maximal circle's radius is "+c2.getRadius());
    }
 

}
    
}