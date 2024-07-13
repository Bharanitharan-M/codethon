
import java.util.*;

public class React_Developer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int mem_id[] = new int[num];
        for (int i = 0; i < num; i++) {
            mem_id[i] = sc.nextInt();
        }
        int n2 = sc.nextInt();
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            adj.add(new ArrayList<>());
        }
        for (int i = 0; i < n2; i++) {
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            int index1 = -1, index2 = -1;
            for (int j = 0; j < num; j++) {
                if (mem_id[j] == num1) {
                    index1 = j;
                }
                if (mem_id[j] == num2) {
                    index2 = j;
                }
            }
            if (index1 != -1 && index2 != -1) {
                adj.get(index1).add(index2);
            }
        }
        int per1 = sc.nextInt();
        int per2 = sc.nextInt();
        int indexPer1 = -1, indexPer2 = -1;
        for (int i = 0; i < num; i++) {
            if (mem_id[i] == per1) {
                indexPer1 = i;
            }
            if (mem_id[i] == per2) {
                indexPer2 = i;
            }
        }
        boolean[] vis = new boolean[num];
        if (indexPer1 != -1 && indexPer2 != -1) {
            dfs(adj, vis, indexPer1);
        }
        if (vis[indexPer2]) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
        sc.close();
    }

    public static void dfs(ArrayList<ArrayList<Integer>> adj, boolean[] vis, int per1) {
        vis[per1] = true;
        for (int it : adj.get(per1)) {
            if (!vis[it]) {
                dfs(adj, vis, it);
            }
        }
    }
}