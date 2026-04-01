class Solution {
    public int largestRectangleArea(int[] arr) {
       int n = arr.length;
       int [] nse = new int[n];//next smaller element
       Stack<Integer> st = new Stack<>();
       nse[n-1] = n;
       st.push(n-1);
       for(int i = n-2 ; i>=0 ; i--){
        while(st.size()>0 &&arr[st.peek()]>=arr[i] )st.pop();
        if(st.size()==0) nse[i] =n;
        else nse[i] =st.peek();
        st.push(i);
       }
       while(st.size()!= 0)st.pop();
       int [] pge = new int[n];//previous smaller element
       pge[0] = -1;
       st.push(0);
       for(int i =1 ; i<n ; i++){
        while(st.size()>0 &&arr[st.peek()]>=arr[i] ) st.pop();
        if(st.size()==0) pge[i] =-1;
        else pge[i]= st.peek();
        st.push(i);
       }
       int maxArea = 0;
        for (int i = 0; i < n; i++) {
            int width = nse[i] - pge[i] - 1;
            int area = arr[i] * width;
            maxArea = Math.max(maxArea, area);
        }
        return maxArea;
    }
}