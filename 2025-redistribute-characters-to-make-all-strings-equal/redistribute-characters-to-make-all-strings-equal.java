class Solution {
    public boolean makeEqual(String[] words) {
        Map<Character,Integer> map=new HashMap<>();
        for(String word:words){
            for(int i=0;i<word.length();i++){
                map.put(word.charAt(i),map.getOrDefault(word.charAt(i),0)+1);
            }
        }
        int n=words.length;
        for(Map.Entry<Character,Integer> s:map.entrySet()){
            if(s.getValue()%n!=0){
                return false;
            }
        }

        return true;
    }
}