

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class findAnce{
	
    public static void main(String[] args){

      Scanner scanner = new Scanner(System.in);
      int[][] ary = new int[1010][1010];
      ary[0][0] =1;
      int N = scanner.nextInt();
      int X = scanner.nextInt();
      int Y = scanner.nextInt();
      int Xparent=0;
      int Yparent=0;
      
      for(int i =0;i<N-1;i++){
        int parent = scanner.nextInt();
        int child = scanner.nextInt();
        ary[parent][child] =1;
        if(child == X) Xparent = parent;
        if(child == Y) Yparent = parent;
      }
      
      List<Integer> Xpas = new ArrayList<>();
      int[] Ypas = new int[1010];
      
      Xpas.add(Xparent);
      Ypas[Yparent] =1;
      
      while(Xparent != 0){
        for(int i =0;;i++){
          if(ary[i][Xparent]==1){
            Xpas.add(i);
            Xparent =i;
            break;
          }
        }
      }
      
      
      while(Yparent != 0){
        for(int i =0;;i++){
          if(ary[i][Yparent]==1){
            Ypas[i]=1;
            Yparent =i;
            break;
          }
        }
      }
      
      for(int e : Xpas){ 
        if(Ypas[e] == 1){
          System.out.println(e);
          break;
        }
      }
      
      

    }
}

/*
 * 트리의 노드 X에 대하여 “조상"을 정의할 수 있다.
* X의 “조상"이란, 루트까지 올라가는 중에 만나는 모든 노드를 말한다.
*  예를 들어, 아래와 같이 트리가 주어질 경우, 노드 8의 “조상"은 노드 0, 노드 2, 노드 6이 된다.
* 두 노드 X, Y의 공통 조상이란, X와 Y가 공통으로 갖는 조상을 말한다. 
* 예를 들어, 노드 7과 노드 10의 공통조상은 노드 2, 노드 0이 된다.
* 가장 가까운 공통 조상이란, X와 Y가 공통으로 갖는 조상들 중에서 X, Y와 가장 가까운 조상을 말한다. 
* 예를 들어, 노드 7과 노드 10의 가장 가까운 공통 조상은 노드 2가 된다.
* 트리가 주어지고, 두 노드 X, Y가 주어질 때, 가장 가까운 공통 조상을 찾는 프로그램을 작성하시오.
*
* 입력 
* 첫 번째 줄에 트리의 노드 개수 n, 두 노드 X, Y의 번호가 주어진다.
*( 1 ≤ X, Y ≤ n ≤ 1000 ) 두 번째 줄부터 트리의 간선 정보가 주어진다.
* 각 줄은 2개의 숫자 a, b로 이루어지며, 이는 노드 a가 노드 b의 부모노드라는 것을 의미한다.
*루트는 노드 0이라고 가정한다.  

출력
두 노드 X, Y의 공통 조상을 출력한다.

11 7 10
0 1
0 2
1 3
1 4
1 5
2 6
2 10
6 7
6 8
6 9
예제 출력
2
*/
