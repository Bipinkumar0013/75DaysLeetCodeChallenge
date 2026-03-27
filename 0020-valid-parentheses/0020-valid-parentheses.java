class Solution {
     public boolean isValid(String s) {
        Stack<Character> st = new Stack();
        int n = s.length();
        for(int i =0; i< n;i++){
          char ch = s.charAt(i);
          if(ch=='(' ||ch=='{'|| ch=='[')st.push(ch);
          else{
            if(st.size()==0) return false;
            char top =st.peek();
            if(same(top,ch)) st.pop();
            else return false;
          }
        }
        return (st.size()==0);
        }
    public static boolean same(char a, char b){
      if(a=='('&& b==')') return true;
      if(a=='['&& b==']') return true;
      if(a=='{'&& b=='}') return true;
      else return false;
    }
}