
public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] value = {80, 75, 10, 60, 15, 49, 12, 25};
		int count = value.length;
		
		System.out.println("선택 정렬 실행 전");
		printArrayForSelectionSort(value, count);
		
		System.out.println("선택 정렬 실행");
		selectionSort(value, count);
		
		System.out.println("선택 정렬 실행 후");
		printArrayForSelectionSort(value, value.length);
	}
	
	public static void selectionSort(int[] value, int count) {
		int min = 0, temp = 0;
		
		for (int i = 0; i < count - 1; i++) {
			min = i;
			for(int j = i+1; j < count; j++) {
				if (value[j] < value[min]) {
					min = j;
				}
			}
			temp = value[i];
			value[i] = value[min];
			value[min] = temp;
			
			System.out.println("Step " + (i+1));
			printArrayForSelectionSort(value, count);
		}
	}
	
	public static void printArrayForSelectionSort(int[] value, int count) {
		for(int i=0; i<count; i++) {
			System.out.print(value[i] + ", ");
		}
		System.out.println();
	}

}
