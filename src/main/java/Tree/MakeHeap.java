package Tree;

//힙을 구현

class PriorityQueue {
    public int MAX = 100;
    int[] data = new int[MAX];
    int len = 1;

    void push(int x) {
        data[len++] = x;
        int inx = len - 1;

        while (inx > 1) {
            if (data[inx] < data[inx / 2]) {
                int temp = data[inx];
                data[inx] = data[inx / 2];
                data[inx / 2] = temp;
            } else break;

            inx = inx / 2;
        }
    }

    void pop() {
        data[1] = data[len - 1];
        data[len - 1] = 0;
        len--;

        int inx = 1;

        // 1. 자식이 모두 없는 경우
        // 2. 왼쪽 자식만 존재하는 경우
        // 3. 왼쪽 오른쪽 모두 있는 경우

        while (true) {

            int pInx = -1;

            if (len <= inx * 2) break;
            else if ((1 <= inx * 2 && inx * 2 < len) && len <= inx * 2 + 1) {
                pInx = inx * 2;
            } else {
                if (data[inx * 2] < data[inx * 2 + 1]) {
                    pInx = inx * 2;
                } else {
                    pInx = inx * 2 + 1;
                }
            }
            if (data[inx] > data[pInx]) {
                int temp = data[inx];
                data[inx] = data[pInx];
                data[pInx] = temp;

                inx = pInx;
            } else break;
        }
    }

    int top() {
        return data[1];
    }
}

public class MakeHeap {

    public static void main(String[] args){
        PriorityQueue pr = new PriorityQueue();
        pr.push(3);
        pr.push(5);
        pr.push(88);

        System.out.println(pr.top());
        pr.pop();

        System.out.println(pr.top());
        pr.pop();

        System.out.println(pr.top());
        pr.pop();

    }



}
