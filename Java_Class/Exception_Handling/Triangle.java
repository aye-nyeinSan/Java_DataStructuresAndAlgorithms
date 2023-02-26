public class Triangle {
    private double radius1,radius2,radius3;
    public Triangle(double radius1,double radius2,double radius3) throws IllegalTriangleException
    {
        this.radius1=radius1;
        this.radius2=radius2;
        this.radius3=radius3;
        if((radius1+radius2<=radius3)||(radius2+radius3<=radius1) || (radius1+radius3<=radius2))
        throw new IllegalTriangleException(radius1,radius2,radius3,"The sum of two sides is greater tthan the other one.");

        

    }
    public double FindPerimeter(){
        double sum=radius1+radius2+radius3;
        return sum;
    }
    public double  FindArea(){
      double result=FindPerimeter()/2;
      return Math.sqrt(result*(result-radius1)*(result-radius2)*(result-radius3));
    }
}
