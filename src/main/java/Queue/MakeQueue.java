package Queue;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 문제
 * 이 문제에서는 큐를 구현한다. 큐는 다음 세 개의 연산을 지원한다.
 *
 * Push X : 큐에 정수 X를 push한다. 만약 rear 포인터가 더 이상 뒤로 갈 수 없다면, “Overflow”를 출력한다.
 * Pop : 큐에서 정수 하나를 pop한다. 만약 front 포인터가 더 이상 뒤로 갈 수 없다면, “Underflow”를 출력한다.
 * Front : 큐의 front에 있는 정수를 출력한다. 만약 큐가 비어있다면 “NULL”을 출력한다.
 * 크기가 n인 배열로 만든 큐에 m개의 연산을 하는 프로그램을 작성하시오.
 * 입력의 편의를 위해서 Push는 “1”, Pop은 “2”, Front는 “3”으로 표현한다.
 *
 * 입력
 * 첫째 줄에 큐를 만들 수 있는 배열의 크기 n, 연산의 개수 m이 주어진다.
 * ( 1 ≤ n ≤ 100, 1 ≤ m ≤ 1,000 ) 두 번째 줄부터 연산이 주어진다.
 * 1은 Push, 2는 Pop, 3은 Front 연산을 의미한다.
 *
 * 출력
 * 연산의 결과를 출력한다.
 *
 * 예제 입력
 * 4 15
 * 1 1
 * 1 2
 * 1 3
 * 3
 * 2
 * 2
 * 3
 * 1 4
 * 1 5
 * 3
 * 2
 * 2
 * 1 6
 * 2
 * 3
 *
 * 예제 출력
 * 1
 * 3
 * Overflow
 * 3
 * Overflow
 * Underflow
 * NULL
 *
 */

public class MakeQueue {

    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        List<String> list = new ArrayList<>();

        int size = scanner.nextInt();
        int calcuCount = scanner.nextInt();
        Que queue = new Que(size);
        scanner.nextLine();

        for(int i =0;i<calcuCount;i++){
            list.add(scanner.nextLine());
        }

        for(String each : list){
            String[] numbers = each.split(" ");
            switch (numbers[0]){
                case "1":
                    queue.push(Integer.parseInt(numbers[1]));
                    break;
                case "2":
                    queue.pop();
                    break;
                case "3":
                    queue.front();
                    break;
            }
        }

    }

}

// 예외 처리를 한 메소드에 묶어서 처리 할수는 없는 것인가?
class Que {
    int size;
    int[] ary;
    int start = 0;
    int last = 0;

    Que(int size) {
        this.size = size;
        ary = new int[size];
    }

    void push(int num) {
        if (size - last == 0) {
            System.out.print("Overflow\n");
        } else {
            ary[last++] = num;
        }
    }

    void pop() {
        if (last - start == 0) {
            System.out.print("Underflow\n");
        }else{
            start++;
        }
    }

    void front() {
        if (last - start == 0) {
            System.out.print("NULL\n");
        }else{
            System.out.print(ary[start]+"\n");
        }
    }

}
