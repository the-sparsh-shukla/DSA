class Solution {
    public String capitalizeTitle(String title) {

        String result = "";
        int start = 0;

        for (int i = 0; i <= title.length(); i++) {

            if (i == title.length() || title.charAt(i) == ' ') {

                int length = i - start;

                if (length <= 2) {
                    for (int j = start; j < i; j++) {
                        result = result + Character.toLowerCase(title.charAt(j));
                    }
                }
                else {
                    result = result + Character.toUpperCase(title.charAt(start));

                    for (int j = start + 1; j < i; j++) {
                        result = result + Character.toLowerCase(title.charAt(j));
                    }
                }

                if (i < title.length()) {
                    result = result + " ";
                }

                start = i + 1;
            }
        }

        return result;
    }
}