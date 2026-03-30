class Solution {
    public int[] canSeePersonsCount(int[] arr) {
        int n = arr.length;
        int [] arr2 = new int[n];
        Stack<Integer> st = new Stack<>();
        // arr2[n-1] = 0;
        // st.push(arr[n-1]);
        for(int i=n-1 ; i>=0 ;i-- ){
            int count=0;
            while(st.size()>0 && st.peek()<=arr[i]){ 
                st.pop();
                count++;
            }
            if(st.size()>0) count++;
            arr2[i] = count;
            st.push(arr[i]);
        }
        return arr2;
    }
}