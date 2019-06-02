package recursive;

import java.util.Scanner;
/**
 * 두 정수 n, k를 입력받아 k개의 1을 가진 n자리 이진 패턴을 출력하는 프로그램을 작성하세요.
 *
 * 두 정수 n,k가 입력으로 주어진다. ( 0< n <= 30, 0 <= k < 8 , n>=k )
 *
 * 예제 입력
 * 4 2
 * 예제 출력
 * 1100
 * 1010
 * 1001
 * 0110
 * 0101
 * 0011
 *
 *
 */
public class Tobin {

    private static Scanner scanner = new Scanner(System.in);
    static int N,K,ary[];

    public static void main(String[] args) {
        N = scanner.nextInt();
        K = scanner.nextInt();
        ary = new int[N];
        printBinary(0,K);
    }

    public static void printBinary(int index, int k){

        if(k==0){
            print();
            return;
        }

        if(index ==N){
            return;
        }

        ary[index]=1;
        printBinary(index+1,k-1);

        ary[index]=0;
        printBinary(index+1,k);
    }

    private static void print() {
        for(int i=0;i<N;i++){
            System.out.print(ary[i]);
        }
        System.out.println();
    }
}
