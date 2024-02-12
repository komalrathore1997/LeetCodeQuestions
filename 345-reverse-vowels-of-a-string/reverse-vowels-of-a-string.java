class Solution {
    public String reverseVowels(String s) {
        char[] str=s.toCharArray();
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if(!isVowel(str[i])){
                i++;
            }
            if(!isVowel(str[j])){
                j--;
            }

            if(isVowel(str[i]) && isVowel(str[j])){

                char c=str[i];
                str[i]=str[j];
                str[j]=c;
                i++;
                j--;

            }
        }
        return new String(str);
    }

    public boolean isVowel(char c){
        return c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='A' || c=='E' || c=='I' || c=='O' || c=='U' ;
    }
}