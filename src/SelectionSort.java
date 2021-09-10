package src;

import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class SelectionSort {
    private SelectionSort(){}
    
    public static <T extends Comparable<T>> int findMax(List<T> l, int start, int end){
        int len = end - start;
        if(len <= 0) {
            return -1;
        }
        int c = start;
        for(int i = start+1; i < end; i++){
            if(l.get(c).compareTo(l.get(i)) < 0){
                c = i;
            }
        }
        return c;
    }

    public static <T extends Comparable<T>> void selectionSort(List<T> l){
        int len = l.size(); int i, j; T tmp;
        for(i = len-1; i >= 0; i--){
            j = findMax(l, 0, i+1);
            tmp = l.get(j);
            l.set(j, l.get(i));
            l.set(i, tmp);
        }
    }

    public static <T extends Comparable<T>> boolean isSort(List<T> l){
        for(int i = 0; i < l.size() - 1; i++){
            if(l.get(i).compareTo(l.get(i + 1)) > 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Testing Selection sort");
        List<Integer> s = new ArrayList<>(); 
        Random r = new Random(System.currentTimeMillis());
        for(int i = 0; i < 50; i++){
            s.add(r.nextInt(100));
        }
        
        System.out.print("original: ");
        System.out.println(s);
        selectionSort(s);
        System.out.print("Sorted: ");
        System.out.println(s);
        System.out.println("is list sorted: " + isSort(s));

    }
}
