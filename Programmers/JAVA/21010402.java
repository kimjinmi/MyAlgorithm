/*
한자리 숫자가 적힌 종이 조각이 흩어져있습니다. 
흩어진 종이 조각을 붙여 소수를 몇 개 만들 수 있는지 알아내려 합니다.

각 종이 조각에 적힌 숫자가 적힌 문자열 numbers가 주어졌을 때, 
종이 조각으로 만들 수 있는 소수가 몇 개인지 return 하도록 solution 함수를 완성해주세요.

제한사항
numbers는 길이 1 이상 7 이하인 문자열입니다.
numbers는 0~9까지 숫자만으로 이루어져 있습니다.
013은 0, 1, 3 숫자가 적힌 종이 조각이 흩어져있다는 의미입니다.
 */

import java.util.*;
class Solution {
    public int solution(String numbers) {
        HashSet<Integer> set = new HashSet<>();
        permutation("", numbers, set);
        
        int answer = 0;
        while(set.iterator().hasNext()){
            int num = set.iterator().next();
            set.remove(num);
            if(num==2) answer++;
            if(num%2!=0 && isPrime(num)){
                answer++;
            }
        }   

        return answer;
    }
    
    //소수찾기
    public boolean isPrime(int num){
        if(num==0 || num==1){
          return false;  
        } 
        for(int i=2; i*i<=num; i++){
            if(num % i == 0){
              return false;  
            } 
        }
        return true;
    }
    
    //순열
    public void permutation(String prefix, String str, HashSet<Integer> set) { 
        int n = str.length();        
        if(!prefix.equals("")) {
           set.add(Integer.valueOf(prefix)); //스트링을 Interger로 변환
        }
        
        for (int i = 0; i < n; i++){
          permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n), set);
        }
 
    }
    
    
}