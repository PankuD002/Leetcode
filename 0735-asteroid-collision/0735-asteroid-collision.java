class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st =new Stack<>();
        for(int as:asteroids){
            if(as>0){
                st.push(as);
            }
            else{
                while(!st.isEmpty() && st.peek()>0 && st.peek()<Math.abs(as)){
                    st.pop();
                }
                if(!st.isEmpty() && st.peek()>0 && st.peek()==Math.abs(as)){
                    st.pop();
                }
                else if(st.isEmpty()||st.peek()<0){
                    st.push(as);                    
                }
            }
        }
        int[]result=new int[st.size()];
        for(int i=result.length-1;i>=0;i--){
            result[i]=st.pop();
        }
        return result;
        
    }
}