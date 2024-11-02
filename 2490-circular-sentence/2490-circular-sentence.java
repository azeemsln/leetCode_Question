class Solution {
    public boolean isCircularSentence(String sentence) {
        String[] sen=sentence.split(" ");
        int n=sen.length;
        if(n==1){
            if(sen[0].charAt(0)==sen[0].charAt(sen[0].length()-1)){
                return true;
            }
            return false;
        }
        for(int i=0;i<n-1;i++){
            if(sen[i].charAt(sen[i].length()-1)!=sen[i+1].charAt(0)){
                return false;
            }
            
        }
        if(sen[n-1].charAt(sen[n-1].length()-1)==sen[0].charAt(0)){
            return true;
        }
        return false;
    }
}