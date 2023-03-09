import java.util.ArrayList;
import java.util.Scanner;

public class SortList  {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter five integers and five doubles: ");
        ArrayList<Number> numbers=new ArrayList<>();
        Integer integers;Double doubles;
        for (int i = 0; i < 5; i++) {
            integers=sc.nextInt();
            numbers.add(integers);
        }
        for (int i = 0; i < 5; i++) {
           doubles=sc.nextDouble();
            numbers.add(doubles);
        }
        Numbers.sort(numbers);
        System.out.println(numbers);
    }
}
