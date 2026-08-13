class Solution {
    public int[] findEvenNumbers(int[] digits) {

        ArrayList<Integer> list = new ArrayList<>();
        boolean[] used = new boolean[1000];

        for (int i = 0; i < digits.length; i++) {

            if (digits[i] == 0) {
                continue;
            }

            for (int j = 0; j < digits.length; j++) {

                if (j == i) {
                    continue;
                }

                for (int k = 0; k < digits.length; k++) {

                    if (k == i || k == j) {
                        continue;
                    }

                    if (digits[k] % 2 != 0) {
                        continue;
                    }

                    int number = digits[i] * 100
                            + digits[j] * 10
                            + digits[k];

                    if (!used[number]) {
                        used[number] = true;
                        list.add(number);
                    }
                }
            }
        }

        int[] answer = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        Arrays.sort(answer);

        return answer;
    }
}