# 알고리즘을 푸는데 내가 알게된 내용들

## 1. java input관련부분

java에서 입력값을 받을 때, 숫자만 받을때는 `sc.nextInt()`만을 사용하면 띄어쓰기에도 문제없이 잘 받아진다(Picnic을 참고하길)
만약 string을 받아야 한다면 `StringTokenizer`를 사용하여 처리하자.

```java
String str = "this is my string";
StringTokenizer st = new StringTokenizer(str,"%%");
while(st.hasMoreTokens()) {
  System.out.println(st.nextToken());
}
```

## 2. java testcase file 처리

java에서 testcase를 일일이 입력하는건 안된다. 스캐너 초기화를 `Scanner sc = new Scanner(new FileInputStream("src/input.txt"));`이렇게 하면 input.txt에 testcase를 넣어주면 금방 디버깅할 수 있다.

## 3. 알고스팟에서 RTC가 나왔던 경우

java input을 받는 부분에서 nextLine()으로 받은 뒤 split처리하여 하니 RTC가 나왔다. 이 방식을 하지않고 `sc.nextInt()`로 받아서 처리하자.
