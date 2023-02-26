import java.util.Scanner;

public class Lab10_2 {
    public static void main(String[] args) {
        
       try {
        int [] array=new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i]=(int) (Math.random()*100+1);
        }
       Scanner sc=new Scanner(System.in);
        System.out.print("Please enter index of array(0-99): ");
        int index=sc.nextInt();
        System.out.println("The value at index is "+array[index]);
        System.out.println("End nicely");
        System.out.println("Continued Processing....");
        
        
       } catch (ArrayIndexOutOfBoundsException e) {
        // TODO: handle exception
        System.out.println("You refer to index that does not exist.");
        System.out.println("Continued Processing....");
       } 

    }
}
