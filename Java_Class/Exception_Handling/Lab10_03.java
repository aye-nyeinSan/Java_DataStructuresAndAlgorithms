public class Lab10_03 {

    public static void main(String[] args) {
        try{
           /* Triangle t1=new Triangle(1, 2, 3);
            System.out.println("Perimeter for t1 "+t1.FindPerimeter());
            System.out.println("Area for t1  "+t1.FindArea());*/
            Triangle t2=new Triangle(3, 4, 5);
            System.out.println("Perimeter for t1 "+t2.FindPerimeter());
            System.out.println("Area for t1  "+t2.FindArea());

        }
        catch(IllegalTriangleException e){
            System.out.println("Illegal Triangle");
            System.out.println("side1 "+e.getSide1());
            System.out.println("side2 "+e.getSide2());
            System.out.println("side3 "+e.getSide3());

        }
    }
} 
