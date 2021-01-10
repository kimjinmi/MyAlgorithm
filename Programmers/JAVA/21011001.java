/*
n개의 음이 아닌 정수가 있습니다. 이 수를 적절히 더하거나 빼서 타겟 넘버를 만들려고 합니다. 예를 들어 [1, 1, 1, 1, 1]로 숫자 3을 만들려면 다음 다섯 방법을 쓸 수 있습니다.

-1+1+1+1+1 = 3
+1-1+1+1+1 = 3
+1+1-1+1+1 = 3
+1+1+1-1+1 = 3
+1+1+1+1-1 = 3
사용할 수 있는 숫자가 담긴 배열 numbers, 타겟 넘버 target이 매개변수로 주어질 때 숫자를 적절히 더하고 빼서 타겟 넘버를 만드는 방법의 수를 return 하도록 solution 함수를 작성해주세요.

제한사항
주어지는 숫자의 개수는 2개 이상 20개 이하입니다.
각 숫자는 1 이상 50 이하인 자연수입니다.
타겟 넘버는 1 이상 1000 이하인 자연수입니다.
(참고 : https://zzang9ha.tistory.com/222)
 */
class Solution {
    public static int answer = 0;
    
    public void dfs(int[] numbers, int target, int index){
        if(index == numbers.length){
            int sum = 0;
            for(int i=0;i<numbers.length;i++){
                sum += numbers[i];
            }
            answer += (sum == target) ? 1 : 0;  /* 합과 target이 같으면 +1 다르면 +0 */
			return;
		}
		dfs(numbers, target, index+1);	/* numbers배열 모두 사용할 때 까지 dfs 탐색 */
		numbers[index] *= -1;		
		dfs(numbers, target, index+1);
    }
    public int solution(int[] numbers, int target) {
        dfs(numbers, target, 0);
        return answer;
    }
}