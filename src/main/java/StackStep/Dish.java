package StackStep;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;
import java.lang.String;


/**
 * 문제
 * 접시가 a, b, c, d 가 있고, 알파벳 순으로 한쪽이 막혀 있는 세척기에 들어간다고 할 때,
 * b a c d 순으로 꺼내기 위해서는 push, push, pop, pop, push, pop, push, pop을 하면 된다.
 * 세척기에서 꺼내는 순서가 주어질 때 그 동작을 출력하는 프로그램을 작성하시오.
 * 만약 주어진 순서대로 접시를 꺼낼 수 없다면 “impossible”을 출력한다.
 *
 * 입력
 * 첫째 줄에 소문자 알파벳이 주어진다. 중복된 소문자 알파벳은 입력되지 않는다. 알파벳 소문자는 26개이다.
 *
 * 출력
 * 접시를 꺼내는 것이 가능한 경우 push, pop의 순서를 출력한다. 이것이 불가능하다면 impossible을 출력한다.
 *
 * 예제 입력
 * bacd
 * 예제 출력
 * push
 * push
 * pop
 * pop
 * push
 * pop
 * push
 * pop
 *
 * 예제 입력
 * dabc
 * 예제 출력
 * impossible
 */

public class Dish {
    // a 97 번 z 122 번
    // 이런 상황에서 어떻게 하지 뭐 예를 들어서 도중에 그만 끝나야 하는 상황이라면
    // 이런 상황에 대한 대처하는 코드를 좀 정규화 해놓기

    public static void main(String[] args) {
        List<String> answer = new ArrayList<>();
        Stack<Character> stack = new Stack<>();

        int startAp = 97;
        boolean flag = true;
        Scanner scanner = new Scanner(System.in);
        String apl = scanner.nextLine();

        for (int i = 0; i < apl.length(); i++) {

            while (stack.empty() || stack.peek() != apl.charAt(i)) {
                stack.push((char) startAp++);
                answer.add("push");
            }

            if(stack.size() > apl.length()){
                flag = false;
                break;
            }else{
                stack.pop();
                answer.add("pop");
            }

        }


        if(flag){
            for(String each: answer){
                System.out.println(each);
            }
        }else{
            System.out.println("impossible");
        }

    }
}
