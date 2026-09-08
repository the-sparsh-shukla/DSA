class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int len=s.length();
        int win=p.length();
        ArrayList<Integer> list=new ArrayList<>();
        int sArr[]=new int [26];
         int pArr[]=new int [26];
         if (len < win) {
            return list;
         }
         for (int i=0;i<win;i++){
            int si=s.charAt(i)-'a';
            int pi=p.charAt(i)-'a';
            sArr[si]++;
            pArr[pi]++;
         }
         if (Arrays.equals(sArr,pArr)){
            list.add(0);
         }
         for (int i=1;i<=len-win;i++){
            int pr=s.charAt(i-1)-'a';
            int nxt=s.charAt(i+win-1)-'a';
            sArr[nxt]++;
            sArr[pr]--;
            if (Arrays.equals(sArr,pArr)){
                list.add(i);
            }
         }
         return list;
    
        
    }
}