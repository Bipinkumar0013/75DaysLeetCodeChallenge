class Solution {
    boolean twoSum(int arr[], int target) {
        // code here
        HashSet<Integer> set = new HashSet<>();
        for(int ele : arr){
            int rem = target - ele ;
            if(set.contains(rem))return true;
            set.add(ele);
            
        }
        return false;
    }
}