class Solution {
    public String removeOuterParentheses(String s) {
        int out=0;
        StringBuilder c = new StringBuilder();
        for(char a:s.toCharArray()){
            if(a=='(' && out++>0) c.append(a);
            if(a==')' && out-->1) c.append(a);
        }
        return c.toString();
    }
}