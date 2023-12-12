//brute force apporch

class Solution {
    public void moveZeroes(int[] arr) {
        int i=0;
        int j=0;
        while(j<arr.length-1){
            if(arr[j]==0){
               j++; 
            } 
            else{
               i++;
               j++;
            } 


            if(arr[i]==0 && arr[j]!=0){
                swap(arr,i,j);
                i++;
            }
        }

    }

    public void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}