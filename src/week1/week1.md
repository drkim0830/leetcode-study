# 1108 Defanging an IP address - 상수
처음엔 그냥 String의 함수 replaceAll 함수를 사용하면 쉽게 해결할 수 있을 것 같았으나 `Time Limit Exceeded` 가 뜸...
그래서 Tokenizer를 활용해서 미리 나눈 뒤에 .을 [.]으로 치환하도록 구현
##### 주어진 String의 길이 N만큼 반복하며 .을 찾아 [.]으로 바꾸는 방법과 복잡도는 비슷할 것으로 생각되어 O(N)의 복잡도

# 3. Longest Substring Without Repeating Characters - 대래
주어진 String s의 0번 인덱스 위치에서부터 끝까지 반복하며 substring에서 뒤에 들어갈 위치의 char가 substring에 포함되어 있지 않다면 추가
만약 포함되어 있으면 다음 인덱스 위치에서 다시 반복 진행
반복 도중 최대 값에 대한 길이를 저장하도록
##### String s의 길이를 2중 반복하면서 해당 길이에 문자가 포함되는지 검사하는 과정까지 총 O(N^3)의 복잡도
O(N^2logN)인가...?

# 70. Climbing Stairs - 종상
0부터 차례대로 나올 수 있는 갯수를 세다보면 피보나치 수열이라는 것을 확인
n의 범위가 주어지지 않아서 Top-down으로 재귀돌리면서 memoization 쓸까...하고 고민하다가 그냥 Bottom-Up으로 N번 반복하는게 잦은 재귀호출 문제도 막을 수 있을 것 같아서 해당 방법으로 구현함
##### 2부터 N까지 1,2단계 전의 값들을 이용하여 계산하기 때문에 O(N)의 복잡도

# 617. Merge Two Binary Trees
무슨 문제인지 처음에 이해를 못했으나 역시 갓 구글 번역기를 돌리고 이해함
하나의 함수에서 결과를 주면서 자식 노드 유무에 따라 반복이 진행되기 때문에 Top-down 재귀로 구현하면 되겠다고 생각
리프노드인지 검사하여 리프노드면 return 하도록 하고 그렇지 않으면 반복
##### T1의 노드 갯수 N, T2의 노드 갯수 M의 사이즈만큼 다 돌기 때문에 O(N + M)의 복잡도

