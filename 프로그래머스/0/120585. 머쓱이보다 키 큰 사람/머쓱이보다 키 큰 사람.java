class Solution {
    public int solution(int[] array, int height) {
        int answer = 0;
        int i = 0;
        
        for(i=0;i<array.length;i++){
            if(array[i]>height){
                answer++;
            }
        }
        
        return answer;
    }
}