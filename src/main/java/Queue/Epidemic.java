package Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
*문제
 * 철수네 마을에는 갑자기 전염병이 유행하기 시작하였다.
 * 이 전염병은 전염이 매우 강해서, 이웃한 마을끼리는 전염되는 것을 피할 수 없다.
 * 철수네 마을은 1번부터 N번까지 번호가 매겨져 있다.
 * 철수네 마을의 구조는 꽤나 복잡한데, i번 마을에서 출발하면 i * 2 번 마을에 갈 수 있고,
 * 또한 i / 3(i를 3으로 나눈 몫) 번째 마을에도 갈 수 있다. 전염병은 사람에 의하여 옮는 것으로 알려져 있다.
 * 따라서 i번 마을에 전염병이 돌게 되면, i * 2 번 마을과 i / 3(i를 3으로 나눈 몫) 번 마을 역시 전염병이 돌게 된다.
 * K번 마을이 가장 처음으로 전염병이 돌기 시작했을 때, 전염병이 돌지 않는 마을의 개수를 구하는 프로그램을 작성하시오.
 *
 *
 *
 * 입력
 * 첫째 줄에 전체 마을의 개수 N과, 처음으로 전염병이 돌기 시작한 마을 번호 K가 주어진다. ( 1 ≤ N, K ≤ 100,000 )
 *
 * 출력
 * 전염병이 돌지 않는 마을의 개수를 출력한다.
 *
 * 예제 입력
 * 10 3
 * 예제 출력
 * 4
 */

public class Epidemic {


    public static void main(String[] args) {
        Queue<Integer> town = new LinkedList<>();       // 좀 어떤 구조인지 보기 그리고 Stack()을 사용하는 경우도 있는데 좀 살펴 보기
        int[] visited = new int[100_050];               //static 사용하면 런타임 걸림, 100_000 으로 해도 런타임 걸림

        Scanner scanner = new Scanner(System.in);
        int townAmount = scanner.nextInt();
        int startTown = scanner.nextInt();
        town.add(startTown);
        visited[startTown] = 1;
        int count = 1;

        while (!town.isEmpty()) {
            startTown = town.poll();

            if (startTown * 2 <= townAmount && visited[startTown * 2] != 1) {
                town.add(startTown * 2);
                visited[startTown * 2] = 1;
                count++;
            }

            if (startTown / 3 != 0 && visited[startTown / 3] != 1) {
                visited[startTown / 3] = 1;
                town.add(startTown / 3);
                count++;
            }
        }
        System.out.print(townAmount - count);
    }
}
