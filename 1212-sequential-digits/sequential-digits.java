class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> result=new ArrayList<>();
        Queue<Integer> q=new LinkedList<>();
        for(int i=1;i<10;i++){
            q.add(i);
            while(q.size() > 0){
                int curr=q.poll();
                if(curr>=low && curr<=high) result.add(curr);
                int lastDigit = curr%10;
                int next=curr*10 + lastDigit + 1;
                if(lastDigit<9 && next<=high) q.add(next);
            }
        }

        Collections.sort(result);
        return result;
    }
}