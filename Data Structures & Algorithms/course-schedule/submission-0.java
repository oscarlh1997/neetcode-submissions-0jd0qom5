class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
    List<List<Integer>> next = new ArrayList<>();
    for (int i = 0; i < numCourses; i++) next.add(new ArrayList<>());
    int[] indegree = new int[numCourses];

    for (int[] p : prerequisites) {
        next.get(p[1]).add(p[0]); // al acabar p[1] se desbloquea p[0]
        indegree[p[0]]++;
    }

    Deque<Integer> queue = new ArrayDeque<>();
    for (int i = 0; i < numCourses; i++) {
        if (indegree[i] == 0) queue.offer(i);
    }

    int done = 0;
    while (!queue.isEmpty()) {
        int course = queue.poll();
        done++;
        for (int n : next.get(course)) {
            if (--indegree[n] == 0) queue.offer(n);
        }
    }
    return done == numCourses;
}
}
