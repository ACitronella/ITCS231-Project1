package src;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class ArrayReshape2d {
    
    private ArrayReshape2d(){};

    private static Random r = new Random(System.currentTimeMillis());
    
    public static void printArr2d(int[][] a){
        System.out.print("[");
        for (int i = 0; i < a.length-1; i++) {
            System.out.println(Arrays.toString(a[i]) + ",");
        }
        System.out.print(Arrays.toString(a[a.length-1]));
        System.out.println("]");   
    }

    public static int[][] arrayReshape2d(int[][] mat, int r, int c) {
        if(r == -1){
            r = mat.length / c;
        }
        else if(c == -1){
            c = mat.length / r;
        }

        int[][] n = new int[r][c];
        int count = 0;
        int ri, ci;
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[0].length; j++){
                ri = count / c;
                ci = count % c;
                n[ri][ci] = mat[i][j];
                count++;
            }
        }
        return n;
    }

    public static List<List<Integer>> commonDivisor(int n){
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        l1.add(1);
        l2.add(n);
        for(int i = 2; i <= n; i++){
            if(n % i == 0){
                l1.add(i);
                l2.add(n/i);
            }
        }
        return List.of(l1, l2);
    }

    public static void main(String[] args) {
        System.out.println("Array reshape 2d");
        int ri, ci, row, col;
        if (args.length == 2){
            row = Integer.parseInt(args[0]);
            col = Integer.parseInt(args[1]);
        }
        else{
            row = 4;
            col = 2;
            System.out.println("No args or invalid, taking default");
        }
        System.out.println("Init array shape (" + row + ", " + col + ")");
        int all = row * col;
        List<List<Integer>> s = commonDivisor(all);
        List<Integer> allPossibleRow = s.get(0);
        List<Integer> allPossibleCol = s.get(1);

        int[][] a = new int[row][col];
        for(int i = 0; i < a.length; i++){
            Arrays.setAll(a[i], (int z) -> r.nextInt(100));
        }
        System.out.println("Default array. Filled with random value");
        printArr2d(a);
        
        for(int i = 0; i < allPossibleCol.size(); i+=1){
            ri = allPossibleCol.get(i);
            ci = allPossibleRow.get(i);
            System.out.println("Array with shape:" + ri + ", " + ci + "\n");
            printArr2d(arrayReshape2d(a, ri, ci));
        }

    }
}
