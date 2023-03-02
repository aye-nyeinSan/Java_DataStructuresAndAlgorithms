public class Square extends GeometricObject implements Colorable {
    private double side;

    public Square(){
        this.side=0;
    }
    public Square(double s){
        this.side=s;
    }

    @Override
    public double getArea() {
        return side*side;

    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getPerimeter() {
        return 4*side;
   
    }

    @Override
    public String howToColor() {
       return "Color all four sides";
    }
    
}
