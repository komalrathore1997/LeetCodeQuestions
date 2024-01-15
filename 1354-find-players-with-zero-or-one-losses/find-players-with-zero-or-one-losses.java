class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        List<List<Integer>> list=new ArrayList<>();
        list.add(new ArrayList<>()); 
        list.add(new ArrayList<>());
        Map<Integer,Integer> map=new HashMap<>();
        Set<Integer> set=new HashSet<>();

        for(int i=0;i<matches.length;i++){
            map.put(matches[i][1],map.getOrDefault(matches[i][1],0)+1);
        }

        for(int i=0;i<matches.length;i++){
            if(!map.containsKey(matches[i][0])){
                set.add(matches[i][0]);
                // list.get(0).add(matches[i][0]);
            }
        }

        list.get(0).addAll(set);

        for(Map.Entry<Integer,Integer> m:map.entrySet()){
            if(m.getValue()==1){
                list.get(1).add(m.getKey());
            }
        }

        Collections.sort(list.get(0));
        Collections.sort(list.get(1));
 
        
        return list;
    }
}