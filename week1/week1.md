# 1108 Defanging an IP address - 상수
#### 처음엔 그냥 String의 함수 replaceAll 함수를 사용하면 쉽게 해결할 수 있을 것 같았으나 `Time Limit Exceeded` 가 뜸...
#### 그래서 Tokenizer를 활용해서 미리 나눈 뒤에 .을 [.]으로 치환하도록 구현

# 70. Climbing Stairs - 종상
#### 1부터 차례대로 나올 수 있는 갯수를 세다보면 피보나치 수열이라는 것을 확인
#### n의 범위가 주어지지 않아서 Top-down으로 재귀돌림녀서 memoization 쓸까...하고 고민하다가 그냥 Bottom-Up으로 N번 반복하는게 쉽고 편할 것 같아서 해당 방법으로 구현함

