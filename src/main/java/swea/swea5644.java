package swea;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * [모의 SW 역량테스트] 무선 충전
 * https://swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=AWXRDL1aeugDFAUo
 *
 *
 5
 20 3
 2 2 3 2 2 2 2 3 3 4 4 3 2 2 3 3 3 2 2 3
 4 4 1 4 4 1 4 4 1 1 1 4 1 4 3 3 3 3 3 3
 4 4 1 100
 7 10 3 40
 6 3 2 70
 …

 // 총 테스트 케이스 개수 T=5
 // 첫 번째 테스트 케이스: M=20, A=3
 // 사용자A의 이동 정보
 // 사용자B의 이동 정보
 // AP 1의 정보 (4, 4), C1=1, P1=100
 // AP 2의 정보 (7, 10), C2=3, P2=40
 // AP 3의 정보 (6, 3), C3=2, P3=70
 // 나머지는 sample_input.txt 참조
 *
 *
 */

public class swea5644 {

    int[] moveX = {0,0,1,0,-1};
    int[] moveY = {0,-1,0,1,0};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int M = scanner.nextInt();
        int A = scanner.nextInt();

        List<Integer> userA = new ArrayList<>();
        List<Integer> userB = new ArrayList<>();
        List<Charge> charges = new ArrayList<>();

        for(int j=0;j<M;j++){
            userA.add(scanner.nextInt());
        }

        for(int j=0;j<M;j++){
            userB.add(scanner.nextInt());
        }

        for(int i =0;i<A;i++){
            charges.add(new Charge(
                    scanner.nextInt(),scanner.nextInt(),scanner.nextInt(),scanner.nextInt()
            ));
        }

        // 주어진 시간동안 움직이기.
        for(int i=0;i<M;i++){




        }



    }

}

class Charge{
    int x;
    int y;
    int range;
    int power;

    public Charge(int x, int y, int range, int power) {
        this.x = x;
        this.y = y;
        this.range = range;
        this.power = power;
    }
}

class User{
    int x;
    int y;
}

