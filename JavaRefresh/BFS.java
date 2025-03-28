import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>(5);
        graph.add(new ArrayList<>(Arrays.asList(1, 2)));
        graph.add(new ArrayList<>(Arrays.asList(0, 2)));
        graph.add(new ArrayList<>(Arrays.asList(0, 1, 3, 4)));
        graph.add(new ArrayList<>(Arrays.asList(2)));
        graph.add(new ArrayList<>(Arrays.asList(2)));

        boolean[] visited = new boolean[graph.size()];
        ArrayList<Integer> res = new ArrayList<>();
        bfs(graph, res, 0, visited);

        System.out.println(res);
    }

    public static ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> graph, ArrayList<Integer> res, int start, boolean[] visited) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        visited[start] = true;
        while (!queue.isEmpty()) {
            int node = queue.poll();
            res.add(node);
            for (int neighour: graph.get(node)) {
                if (!visited[neighour]) {
                    queue.add(neighour);
                    visited[neighour] = true;
                }
            }
        }

        return res;
    }
}
