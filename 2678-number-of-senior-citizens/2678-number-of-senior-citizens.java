class Solution {
    public int countSeniors(String[] details) {
        int n=details.length;
        int count=0;
        for(int i=0;i<n;i++){
            String str=details[i];
            if(str.charAt(11) >='6'&& str.charAt(12) >'0' || str.charAt(11) >'6' ){
                count++;
            }
        }
        return count;
    }
}