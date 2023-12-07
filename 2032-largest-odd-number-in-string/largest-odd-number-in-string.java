class Solution {
    public String largestOddNumber(String num) {
       String result="";
       for(int i=num.length()-1;i>=0;i--){
           var ch=num.charAt(i);
           if(Character.getNumericValue(ch)%2!=0){
               return num.substring(0,i+1);
           }
       }
       return result;
    }
}