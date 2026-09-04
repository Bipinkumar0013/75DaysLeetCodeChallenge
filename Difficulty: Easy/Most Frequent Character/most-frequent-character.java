class Solution {
    public static char getMaxOccuringChar(String s) {
        // code here
        HashMap<Character ,Integer> map = new HashMap<>();
        for(int i = 0 ; i<s.length();i++){
            char ch = s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        //     if(!map.containsKey(ch)) map.put(ch,1);
        //     else{
        //          freq +=map.containsValue(ch);
        //         map.put(ch,freq+1);
        //     }
            
         }
      int maxFreq = 0;
      char ans = 'z';  
      for (char ch : map.keySet()) {  
          int freq = map.get(ch);        
          if (freq > maxFreq) {
              maxFreq = freq;
              ans = ch;
          } else if (freq == maxFreq && ch < ans) {
              ans = ch;
          }
      }
      return ans;
        
    }
}
