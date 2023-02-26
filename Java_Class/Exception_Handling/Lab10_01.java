import java.util.InputMismatchException;
import java.util.Scanner;

class Lab10_01{
    public static void main(String[] args) {
        boolean continueInput=true;
      
      
       do {
        
        try{
            Scanner sc =new Scanner(System.in);
            System.out.print("enter an integer: ");
    
            int number1=sc.nextInt();
            int number2=sc.nextInt();
            int sum= number1+number2;
            System.out.println("The num entered is "+sum);
            continueInput=false;
        }
        catch(InputMismatchException e){
         System.out.println("Try again.(Incorrect input: an integer is required)");
          
        }

       } while (continueInput); 
        
       
        
    }
   
}