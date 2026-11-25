import java.util.*;

class Solution {
    public int countStudents(int[] students, int[] sandwiches) {

        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < students.length; i++) {
            q.add(students[i]);
        }

        int index = 0;
        int count = 0;

        while (!q.isEmpty() && count < q.size()) {

            if (q.peek() == sandwiches[index]) {
                q.poll();
                index++;
                count = 0;
            } 
            else {
                q.add(q.poll());
                count++;
            }
        }

        return q.size();
    }
}