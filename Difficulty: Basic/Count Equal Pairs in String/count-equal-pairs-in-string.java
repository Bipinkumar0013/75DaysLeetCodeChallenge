class Solution {
    public int equalPairs(String s) {
        // code here
        HashMap<Character,Integer> map =new HashMap<>();
        for(int i = 0 ; i<s.length(); i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);

        }
        int ans =0;
        for(Character ch : map.keySet()){
            int freq = map.get(ch);
            ans+= freq*freq;
            
        }
        return ans;
    }
}