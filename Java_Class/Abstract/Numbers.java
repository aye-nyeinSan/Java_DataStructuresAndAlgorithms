import java.util.ArrayList;


public abstract class Numbers {
    public static void sort(ArrayList<Number> list){
        //Bubble Sort
        int n = list.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (list.get(j).doubleValue() > list.get(j + 1).doubleValue()) {
                    Number temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }
    }
}
