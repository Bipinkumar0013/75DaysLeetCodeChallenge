class Solution {
    static int countDistinct(int arr[]) {
        // code here
        HashSet<Integer> set = new HashSet<>();
        for(int ele : arr) set.add(ele);
        return set.size();
    }
}