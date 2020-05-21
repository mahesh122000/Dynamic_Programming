class Solution {
    public int maxEvents(int[][] events) {
    PriorityQueue<int[]> queue = new PriorityQueue<>((x, y) -> {
        return x[1] == y[1] ? x[0] - y[0] : x[1] - y[1];
    });
    Arrays.sort(events, (x, y) -> {
        return x[0] == y[0] ? x[1] - y[1] : x[0] - y[0];
    });
    int result = 0;
    int day = events[0][0];
    int index = 0;
    while (day <= 100000) {
        while (index < events.length && events[index][0] <= day) queue.offer(events[index++]);
        while (!queue.isEmpty() && queue.peek()[1] < day) queue.poll();
        if (!queue.isEmpty()) {
            result++;
            queue.poll();
            day++;
        } else {
            if (index == events.length) return result;
            day = events[index][0];
        }
    }
    