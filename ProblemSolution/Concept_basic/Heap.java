package sol5;

/*
 *우선 순위 큐를 힙으로 구현
 */
public class Heap {
	public static void main(String[] args) {
		PriorotyHeap pHeap = new PriorotyHeap();
			pHeap.push(3);
			pHeap.push(5);
			pHeap.push(88);
	
		System.out.println(pHeap.top());
		pHeap.pop();
		System.out.println(pHeap.top());
		pHeap.pop();
		System.out.println(pHeap.top());
		pHeap.pop();
	}
}

class PriorotyHeap {
	int Max = 100;
	int[] data = new int[Max];
	int len = 1;

	void push(int value) {
		data[len++] = value;
		int valueInx = len - 1;

		while (valueInx > 1 && (data[valueInx] < data[valueInx / 2])) {
			int temp = data[valueInx];
			data[valueInx] = data[valueInx / 2];
			data[valueInx / 2] = temp;

			valueInx = valueInx / 2;
		}

	}
	
	void pop() {
		data[1] = data[len-1];
		data[len--] =0;
		
		int index=1;
		
		while(true) {
			int gotoIndex = -1;
			
			if(index*2 >= len) break;
			if((1<= index*2 && index*2 < len)&& (index*2+1) >= len){
				gotoIndex = index*2;
			}
			
			if(data[index*2] < data[index*2+1])
			{
				gotoIndex = index*2;
				
			}else {
				gotoIndex = index*2+1;
			}
				
			
			
			if(data[index] > data[gotoIndex]) {
				int temp = data[index];
				data[index] = data[gotoIndex];
				data[gotoIndex] = temp;
				
				index = gotoIndex;
			}else break;
			
		}
	}
	
	int top() {
		return data[1];
	}

}