class Solution {
    public boolean lemonadeChange(int[] bills) {
        int n=bills.length;
        int change5=0;
        int change10=0;
        for(int i=0;i<n;i++){
            if(bills[i]==5){
                change5=change5+1;
            }
            else if(bills[i]==10){
                change10++;
                change5--;
            }
            else{
                if(change10>0){
                    change10--;
                    change5--;
                }
                else{
                    change5=change5-3;
                }
            }
            if(change5<0){
                return false;   
            }
            
        }
        return true;
            
            
            
            
    }
        
}