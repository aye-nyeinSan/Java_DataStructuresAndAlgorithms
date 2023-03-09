public class Circle extends GeometricObject implements Comparable<Circle>{
    private double radius;

    public  Circle() {
        
    }
    public  Circle(double radius) {
        this.radius=radius;
    }
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    @Override
    public double getArea() {
         return Math.PI * radius * radius;
       
    }
    @Override
    public double getPerimeter() {
        return 2* Math.PI * radius;
    
    }
   
    public boolean equals(Circle o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof Circle) ){
            return false;
        }
       if (this.compareTo(o)==0) {
        return true;
       } 
        return false;
    }
    @Override
    public int compareTo(Circle o) {
        if (this.radius > o.radius) {return 1;}
        else if(this.radius <o.radius){return -1;}
        else return 0;
        
       
    }
    
}
