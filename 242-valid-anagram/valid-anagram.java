class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        char[] ss=s.toCharArray();
        char[] ts=t.toCharArray();
        Arrays.sort(ss);
        Arrays.sort(ts);

        for(int i=0;i<ss.length;i++){
            if(ss[i]!=ts[i]){
                return false;
            }
        }

        return true;
    }
}