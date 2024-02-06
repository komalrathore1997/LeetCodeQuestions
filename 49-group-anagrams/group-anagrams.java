class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map =new HashMap<>();

        for(String s:strs){
            char c[]=s.toCharArray();
            Arrays.sort(c);
            String anagramString=new String(c);

            if(!map.containsKey(anagramString)){
                map.put(anagramString,new ArrayList<>());
            }

            map.get(anagramString).add(s);
        }

        return new ArrayList<>(map.values());
    }
}