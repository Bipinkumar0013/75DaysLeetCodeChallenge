import java.util.HashSet;

class Solution {
    public int lengthOfLongestSubstring(String s) {
       HashSet<Character> set = new HashSet<>();
       int i =0 , j=0;
       int maxLen = 0;
       while(j<s.length()){
        char ch = s.charAt(j);
        if(!set.contains(ch)){
            set.add(ch);
            j++;
        }
        else{
            set.remove(s.charAt(i));
            i++;
        }
        maxLen = Math.max(maxLen,j-i);
       }
       return maxLen;
    }
}
