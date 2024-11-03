class Solution {
    public boolean rotateString(String s, String goal) {
        int n=s.length();
        char[] sa=s.toCharArray();
        for(int i=0;i<n;i++){
            if(new String(sa).equals(goal)){
                return true;
            }
            char a=sa[0];
            for(int j=0;j<n-1;j++){
                
                sa[j]=sa[j+1];
            }
            sa[n-1]=a;
        }
        return false;
    }
}