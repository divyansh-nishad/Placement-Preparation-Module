public class FindEventualSafeStates {
    class Solution {
        public List<Integer> eventualSafeNodes(int[][] graph) {
            int n = graph.length;
            List<Integer> ans = new ArrayList();
            List<List<Integer>> revGraph = new ArrayList();
            for (int ptr = 0; ptr < n; ptr++) {
                revGraph.add(new ArrayList());
            }

            for (int src = 0; src < n; src++) {
                for (int ptr = 0; ptr < graph[src].length; ptr++) {
                    int dest = graph[src][ptr];
                    revGraph.get(dest).add(src);
                }
            }
            System.out.println(revGraph);
            int[] inDgree = new int[n];
            for (int ptr = 0; ptr < n; ptr++) {
                for (Integer element : revGraph.get(ptr)) {
                    inDgree[element]++;
                }
            }
            Queue<Integer> q = new LinkedList();
            for (int ptr = 0; ptr < n; ptr++) {
                if (inDgree[ptr] == 0) {
                    q.add(ptr);
                }
            }

            while (!q.isEmpty()) {
                int curr = q.poll();
                ans.add(curr);
                for (Integer element : revGraph.get(curr)) {
                    inDgree[element]--;
                    if (inDgree[element] == 0) {
                        q.add(element);
                    }
                }
            }
            Collections.sort(ans);
            return ans;
        }
    }

}
