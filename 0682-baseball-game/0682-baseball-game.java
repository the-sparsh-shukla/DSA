class Solution {
    public int calPoints(String[] operations) {

        int[] score = new int[operations.length];

        int index = 0;

        for (int i = 0; i < operations.length; i++) {

            if (operations[i].equals("C")) {
                index--;
            }

            else if (operations[i].equals("D")) {
                score[index] = 2 * score[index - 1];
                index++;
            }

            else if (operations[i].equals("+")) {
                score[index] = score[index - 1] + score[index - 2];
                index++;
            }

            else {
                score[index] = Integer.parseInt(operations[i]);
                index++;
            }
        }

        int sum = 0;

        for (int i = 0; i < index; i++) {
            sum = sum + score[i];
        }

        return sum;
    }
}