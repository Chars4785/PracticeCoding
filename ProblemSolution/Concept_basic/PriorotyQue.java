package sol5;

public class PriorotyQue {
	public static void main(String[] args) {
		PriorityQueue myQu = new PriorityQueue();
		myQu.push(1);
		myQu.push(8);
		myQu.push(7);
		myQu.push(5);
		System.out.println(myQu.top()); // 8
		
		myQu.pop();
		System.out.println(myQu.top()); // 7

		myQu.pop();
		System.out.println(myQu.top()); // 5
		
		myQu.pop();
		System.out.println(myQu.top()); // 1
		//overFlow
		//underFlow 는 생략
	}
}

class PriorityQueue {
	int Max = 100;
	int[] data = new int[Max];
	int len = 0;

	void push(int x) {
		data[len++] = x;
	}

	void pop() {
		int myMax = -91292389, myMaxInx = -1;
		for (int i = 0; i < len; i++) {
			if (data[i] > myMax) {
				myMax = data[i];
				myMaxInx = i;
			} // 가장 큰 값이 어디 있는지 구하기 위해서
		}

		for (int i = myMaxInx; i < len; i++) {
			data[i] = data[i + 1];
		} // 다 앞으로 땡겨주고
		len--;
	}

	int top() {
		int myMax = -328942;

		for (int i = 0; i < len; i++) {
			if (data[i] > myMax) {
				myMax = data[i];
			}
		}
		return myMax;
	}
}
