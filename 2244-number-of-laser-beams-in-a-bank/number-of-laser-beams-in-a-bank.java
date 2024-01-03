class Solution {
    public int numberOfBeams(String[] bank) {
        List<Integer> list=new ArrayList<>();
        int numberOfBeams=0;
        for(String s:bank){
            int count=0;
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)=='1'){
                    count++;
                }
            }
            if(count!=0){
                list.add(count);
            }
        }    

            // {3,0,2,1}

        for(int i=0;i<list.size()-1;i++){
            numberOfBeams+=list.get(i)*list.get(i+1);
        }

        return numberOfBeams;
    }
}