package Grind75.Medium;

import java.util.ArrayList;
import java.util.List;

public class Problem207 {
    public static void main(String[] args) {
        int numCourses = 2;
        int[][] prerequisites = {{1, 0}};
        System.out.println(canFinish(numCourses, prerequisites));
    }

    public static boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) {
            graph.add(new ArrayList<>());
        }
        for (int[] pre : prerequisites) {
            graph.get(pre[0]).add(pre[1]);
        }
        int[] visited = new int[numCourses];
        for (int i = 0; i < numCourses; i++) {
            if (!dfs(graph, i, visited)) return false;
        }
        return true;
    }

    public static boolean dfs(List<List<Integer>> graph, int node, int[] visited) {
        if (visited[node] == 1) return false;
        if (visited[node] == 2) return true;

        visited[node] = 1;
        for (int neighbor : graph.get(node)) {
            if (!dfs(graph, neighbor, visited)) return false;
        }
        visited[node] = 2;
        return true;
    }
}
