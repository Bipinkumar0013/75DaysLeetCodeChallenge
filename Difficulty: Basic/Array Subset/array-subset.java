
class Solution {
    public boolean isSubset(int a[], int b[]) {
        // code here
        HashMap<Integer,Integer> aMap = new HashMap<>();
         HashMap<Integer,Integer> bMap = new HashMap<>();
         //put value with freq
         for(int i = 0 ; i<a.length; i++){
             aMap.put(a[i],aMap.getOrDefault(a[i],0)+1);
         }
          for(int i = 0 ; i<b.length; i++){
             bMap.put(b[i],bMap.getOrDefault(b[i],0)+1);
         }
         //compare b to a by value and frequency
         for (int ele : bMap.keySet()) {
             if (!aMap.containsKey(ele)) {
                 return false; 
             }
             if (bMap.get(ele)>aMap.get(ele)) {
                 return false; 
             }
         }
         return true;
    }
}
