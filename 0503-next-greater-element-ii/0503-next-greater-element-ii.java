class Solution {
    public int[] nextGreaterElements(int[] arr) {
        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        int [] arr2 = new int[n];
        //pushing all stack
        for(int i = n-1 ; i>=0 ; i--){
            st.push(arr[i]);
        }
        //fill arr2 in right manner
        for(int i = n-1 ; i>= 0 ; i--){
            while(st.size()>0 && arr[i] >=st.peek()) st.pop();
            if(st.size()==0) arr2[i] = -1;
            else arr2[i] = st.peek();
            st.push(arr[i]);
        }
        return arr2;
    }
}