import java.util.ArrayList;
import java.util.Scanner;

public class Largest_Sum_Cycle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] weight_node = new int[n];
      
        for(int i = 0; i < n; i++)
        {
           weight_node[i] = scan.nextInt();
        }
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i = 0; i < n; i++)
        {
            adj.add(new ArrayList<>());
        }
        for(int i = 0; i < n; i++)
        {
            adj.get(i).add(weight_node[i]);
        }
        scan.close();
    }
}
