import java.util.ArrayList;
import java.util.Scanner;

public class Maximum_Weight_Node {
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
        int max = 0;
        for(int i = 0; i < n; i++){
            max = Math.max(max, weight_node[i]);
        }
        System.out.println(max);
        scan.close();
    }
}
