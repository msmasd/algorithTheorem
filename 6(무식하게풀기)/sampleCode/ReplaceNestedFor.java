import java.util.Iterator;
import java.util.Vector;

public class ReplaceNestedFor {

  public static void main(String[] args) {
    Vector<Integer> input = new Vector<Integer>();
    ReplaceNestedFor t1 = new ReplaceNestedFor();
    t1.pick(4, input, 2);
  }
  
  void printPicked(Vector<Integer> picked) {
    Iterator item = picked.iterator();
    while(item.hasNext()) {
      System.out.print(item.next()+ " ");
    }
    System.out.println();
  }

  // n: 전체 원소의 수
  // picked: 지금까지 고른 원소들의 번호
  // toPick: 더 고를 원소의 수
  // 일 때, 앞으로 toPick개의 원소를 고르는 모든 방법을 출력한다.
  public void pick(int n, Vector<Integer> picked, int toPick) {
    // 기저 사례: 더 고를 원소가 없을 때 고른 원소들을 출력한다.
    if(toPick == 0) { printPicked(picked); return; }
    // 고를 수 있는 가장 작은 번호를 계산한다.
    int smallest = picked.isEmpty() ? 0 : picked.lastElement() + 1;
    // 이 단계에서 원소 하나를 고른다.
    for(int next = smallest; next < n; ++next) {
      picked.add(next);
      pick(n, picked, toPick - 1);
      picked.removeElementAt(picked.size() - 1);
    } 
  }
  
}