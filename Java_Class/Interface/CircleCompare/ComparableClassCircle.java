public class ComparableClassCircle extends Circle implements Comparable<ComparableClassCircle> {

   public ComparableClassCircle() {
    
   }
    public ComparableClassCircle(double radius){
    super(radius);
   }
    @Override
    public int compareTo(ComparableClassCircle o) {
    
        if(getRadius()> o.getRadius()) return 1;
        else return 0;
        
    }

  
}
