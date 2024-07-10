class Solution {
    public int minOperations(String[] logs) {
        int ans=0;
        for(int i=0;i<logs.length;i++){
            if(logs[i].equals("../")){
                if(ans>0)
                    ans--;
                else
                    ans=0;
            }
            else if(logs[i].equals("./")){
                ans=ans;
            }
            else{
                ans++;
            }
        }
        if(ans<=0){
            return 0;
        }
        else{
            return ans;
        }
    }
}