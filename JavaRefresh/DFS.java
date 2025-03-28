import java.util.ArrayList;
import java.util.Arrays;

public class DFS {
    public static void main(String[] args) {
        int edges = 4;
        ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>(edges);
        graph.add(new ArrayList<Integer>(Arrays.asList(2, 3, 1)));
        graph.add(new ArrayList<Integer>(Arrays.asList(0)));
        graph.add(new ArrayList<Integer>(Arrays.asList(0, 4)));
        graph.add(new ArrayList<Integer>(Arrays.asList(0)));
        graph.add(new ArrayList<Integer>(Arrays.asList(2)));
        ArrayList<Integer> res = new ArrayList<>();
        boolean[] visited = new boolean[graph.size()];
        dfs(graph, res, 0, visited);
        System.out.println(res);
    }

    public static ArrayList<Integer> dfs(
        ArrayList<ArrayList<Integer>> graph,
        ArrayList<Integer> res,
        int start,
        boolean[] visited
    ) {
        res.add(start);
        visited[start] = true;
        for (int node : graph.get(start)) {
            if (!visited[node]) {
                dfs(graph, res, node, visited);
            }
        }

        return res;
    }
}
