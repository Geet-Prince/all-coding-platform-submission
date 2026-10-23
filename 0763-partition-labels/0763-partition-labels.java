class Solution {
    public List<Integer> partitionLabels(String s) {
        HashMap<Character,Integer>asd=new HashMap<>();
        List<Integer>asdf=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            asd.put(ch,i);
        }
        int max=-1;
        int length=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            length++;
            max=Math.max(asd.get(ch),max);
            if(i==max){
                asdf.add(length);
                length=0;
            }
        }
        return asdf;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna