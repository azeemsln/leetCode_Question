class Solution {
    public int chalkReplacer(int[] chalk, int k) {
        long max=0;
        for(int i=0;i<chalk.length;i++){
            max+=chalk[i];
        }
        
       
            int x=(int)(k%max);
       
        // if(x==0){
        //     return 0;
        // }
        int i;
        for(i=0;i<chalk.length;i++){
            if(x<chalk[i]){
                return i;
            }
            x-=chalk[i];
        }
        return -1;
    }
}