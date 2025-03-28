import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

class Pair {
    int node;
    int distance;

    Pair(int node, int distance) {
        this.node = node;
        this.distance = distance;
    }
}


public class Dijkstra {
    public static void main(String[] args) {
        ArrayList<ArrayList<Pair>> graph = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            graph.add(new ArrayList<Pair>());
        }

        graph.get(0).add(new Pair(1, 2));
        graph.get(0).add(new Pair(2, 6));
        graph.get(1).add(new Pair(2, 1));
        int[] res = new int[3];
        int[] visited = new int[3];
        for (int ind = 0;ind < 3; ind++) {
            res[ind] = Integer.MAX_VALUE;
        }

        dijiUtil(graph, res, 0, visited);
        System.out.println(Arrays.toString(res));
    }

    public static int[] dijiUtil(ArrayList<ArrayList<Pair>> graph, int[] res, int start, int[]visited) {
        res[start] = 0;
        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> a.distance - b.distance);
        pq.add(new Pair(start, 0));
        while (!pq.isEmpty()) {
            Pair curr = pq.poll();
            // if (visited[curr.node] == 1) {
            //     continue;
            // }

            visited[curr.node] = 1;
            for (Pair p : graph.get(curr.node)) {
                if (res[p.node] > res[curr.node] + p.distance) {
                    res[p.node] = res[curr.node] + p.distance;
                    pq.add(new Pair(p.node, res[p.node]));
                    visited[p.node] = 1;
                }
            }
        }

        return res;
    }
}
