class Solution {
    public double averageWaitingTime(int[][] customers) {
       double wait=0, current =0;
        for(int[] a: customers){
            current =Math.max(current ,1.0*a[0])+a[1];
            wait+= current-a[0];
        }
        return 1.0*wait/customers.length;
        
    }
}