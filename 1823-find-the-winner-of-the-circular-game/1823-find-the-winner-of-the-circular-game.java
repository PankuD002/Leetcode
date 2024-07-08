class Solution {
    public int findTheWinner(int n, int k) {
        LinkedList<Integer> list =new LinkedList<>();
        for(int i=1;i<=n;i++){
            list.add(i);
        }
        int winner=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<k-1;j++){
                list.add(list.poll());
            }
            winner=list.poll();
        }
        return winner;
    }
}