class Solution {
    public boolean isPathCrossing(String path) {
        Set<String> set=new HashSet<>();
        set.add("0,0");
        int x=0;
        int y=0;

        for(int i=0;i<path.length();i++){
            char ch=path.charAt(i);
            if(ch=='N') y++;
            else if(ch=='S') y--;
            else if(ch=='W') x--;
            else x++;

            StringBuilder sb=new StringBuilder();
            sb.append(x).append(",").append(y);

            if(set.contains(sb.toString()))
               return true;

            set.add(sb.toString());        

        }

        return false;
    }
}