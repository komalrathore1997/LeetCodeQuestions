class Solution {
    public int compress(char[] chars) {
        StringBuilder sb=new StringBuilder();
        int n=chars.length;
        for(int i=0;i<n;){
            char c=chars[i];
            int count=1;
            while(i+1<n && c==chars[i+1]){
                i++;
                count++;
            }
            sb.append(c);
            if(count>1){    
               sb.append(count);
            }
            i++;
            
        }

        char[] com=sb.toString().toCharArray();
        for(int i=0;i<com.length;i++){
            chars[i]=com[i];
        }

        return com.length;




    }
}