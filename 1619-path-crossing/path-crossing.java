class Solution {
    public boolean isPathCrossing(String path) {
        int x=0;
        int y=0;
        Map<Integer,HashSet<Integer>> map=new HashMap<>();
        map.put(0,new HashSet<>());
        map.get(0).add(0);

        for(int i=0;i<path.length();i++){
            char ch=path.charAt(i);
            if(ch=='N') y++;
            else if(ch=='S') y--;
            else if(ch=='W') x--;
            else x++;

            if(map.containsKey(x) && map.get(x).contains(y)){
                return true;
            }else if(map.containsKey(x)){
                map.get(x).add(y);
            }else{
                map.put(x,new HashSet<>());
                map.get(x).add(y);
            }

        }

        return false;
    }
}