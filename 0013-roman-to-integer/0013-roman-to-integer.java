class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> list =new HashMap<Character, Integer>();
        list.put('I',1);
        list.put('V',5);
        list.put('X',10);
        list.put('L',50);
        list.put('C',100);
        list.put('D',500);
        list.put('M',1000);
        
        int ans=0;
        for(int i=0;i<s.length();i++){
            if(i<s.length()-1 && list.get(s.charAt(i))<list.get(s.charAt(i+1))){
                ans-=list.get(s.charAt(i));
            }
            else{
                ans+=list.get(s.charAt(i));
            }
        }
        return ans;
    }
}