class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        HashMap<String,Integer> h=new HashMap<>();
        String []arr1=s1.split(" ");
        String []arr2=s2.split(" ");
        ArrayList<String> res=new ArrayList<>();
        for (int i = 0; i < arr1.length; i++) {
            h.put(arr1[i], h.getOrDefault(arr1[i], 0) + 1);
        }
        for (int i = 0; i < arr2.length; i++) {
            h.put(arr2[i], h.getOrDefault(arr2[i], 0) + 1);
        }
        for (Map.Entry<String, Integer> entry : h.entrySet()) {
            // System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
            if(entry.getValue()==1){
                res.add(entry.getKey());
            }
        }
        String[] res2=new String[res.size()];
        for(int i=0;i<res2.length;i++){
            res2[i]=res.get(i);
        }
        return res2;
    }
}