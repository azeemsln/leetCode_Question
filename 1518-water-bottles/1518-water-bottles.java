class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int maximum=numBottles;
        if(numBottles>=numExchange){
            while(numBottles>=numExchange){
                int emptyBottles=numBottles;
               
                emptyBottles%=numExchange;
                numBottles=(numBottles/numExchange);
                maximum+=numBottles;
                numBottles+=emptyBottles;
            }
            return maximum;
        }
        else{
            return maximum;
        }
    }
}