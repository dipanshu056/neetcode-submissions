class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int n = tickets.length;
        int count = 0;
        while(tickets[k]!=0){
            for(int i=0;i<n;i++){
                if(tickets[i]!=0){

                    count++;
                    tickets[i] = tickets[i]-1;
                    if(tickets[k]==0) return count;
                }
            }
        }
        return count;
    }
}