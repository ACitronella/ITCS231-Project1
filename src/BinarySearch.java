package src;

import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class BinarySearch {
    
    private BinarySearch(){}

    public static <T extends Comparable<T>> int searchIter(List<T> l, T o, int start, int end){
        if(l.isEmpty())
            return -1;
        int cmp, mid, i = 0;
        while(start != end){
            mid = (start + end) / 2;
            cmp = o.compareTo(l.get(mid));
            if(cmp == 0){
                System.out.println("used " + i + " iteration(s)");
                return mid; 
            }
            if(cmp < 0){
                end = mid;
            }
            else if(cmp > 0){
                start = mid + 1;
            }
            i += 1;
        }
        return -1;
    }

    public static <T extends Comparable<T>> int searchIter(List<T> l, T o){
        return searchIter(l, o, 0, l.size());
    }

    public static void main(String[] args) {
        System.out.println("Testing Binary search");
        List<Integer> s = new ArrayList<>();
        int len = 100;
        Random r = new Random(System.currentTimeMillis());
        for(int i = 0; i < len; i++){
            s.add(r.nextInt(500));
        }
        int i = r.nextInt(len);
        
        
        SelectionSort.selectionSort(s); // since its work only in sorted collection
        int z = s.get(i);
        int f = searchIter(s, z);

        System.out.println(s);
        System.out.println("Randomly sort pick one index: " + i + " got " + z);

        System.out.println("Searching " + s.get(i) + " in list");
        System.out.println("found at " + f);
        System.out.println("value if index found and random index may not equal since there may have some duplicate value");
        
        
    }

}