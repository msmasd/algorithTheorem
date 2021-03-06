# Big-O

Big-O 시간은 알고리즘의 효율성을 나타내는 지표 혹은 언어이다.

## 시간복잡도

단순히 증가하는 비율을 나타내는 개념이고, 수행 시간에서 상수항을 무시해 버린다. 즉 O(2N)은 O(N)으로 표기한다.

지배적이지 않는 항은 무시한다. N(N^2 + 10N)이렇게 있을 경우 10N의 경우를 무시한다. N이 충분히 큰 경우에 10N이 영향을 미치는것보다 N^2가 미치는 영향도가 크기때문이다.

## 공간복잡도

시간 복잡도와 평행선을 달리는 개념이다. 크기가 n인 배열을 만들고자 한다면, O(n)의 공간이 필요하다. nXn 크기의 2차원 배열을 만들고자 한다면 O(n^2)의 공간이 필요하다.

* "A 일을 모두 끝마친 후에 B일을 수행하라" -> A + B
* "A 일을 할 때마다 B 일을 수행하라" -> A * B

