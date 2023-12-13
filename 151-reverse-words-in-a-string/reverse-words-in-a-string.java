class Solution {
    public String reverseWords(String s) {
        if(s==null || s.length()==0){
            return "";
        }
        String[] str = s.trim().split("\\s+");
		StringBuilder ans = new StringBuilder();
		int i = 0;

		int j = str.length - 1;
		while (i < j) {
			swap(str, i, j);
			i++;
			j--;
		}
		
		for(int k=0;k<str.length;k++) {
			if(!str[i].equals("")){
                ans.append(str[k]).append(" ");
            }
		}
		
		return ans.length()==0?"":ans.substring(0,ans.length()-1);

    }

    private static void swap(String[] str, int i, int j) {
          String temp=str[i];
          str[i]=str[j];
          str[j]=temp;
	}
}