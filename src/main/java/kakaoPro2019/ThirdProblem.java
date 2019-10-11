package kakaoPro2019;


import java.util.Arrays;
import java.util.stream.Stream;

/**
 * 2019년 카카오 문제 3번
 * 후보키
 * https://melisuyam-tech.tistory.com/entry/2019-%EC%B9%B4%EC%B9%B4%EC%98%A4-%EC%8B%A0%EC%9E%85-%EA%B3%B5%EC%B1%84-1%EC%B0%A8-%EB%AC%B8%EC%A0%9C-%ED%92%80%EC%9D%B4-1%EB%B2%88-%EC%98%A4%ED%94%88-%EC%B1%84%ED%8C%85%EB%B0%A9?category=761730
 */

public class ThirdProblem {


    public static void main(String[] args) {
        String[] arr = new String[]{"a", "b", "c"};
        Stream<String> stream = Arrays.stream(arr);
        Stream<String> streamOfArrayPart =
                Arrays.stream(arr, 1, 3); // 1~2 요소 [b, c]

    }

}
