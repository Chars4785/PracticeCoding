package kakaoPro2019;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * 2019년 카카오 신입 공채 1차 코딩 테스트
 * 오픈 채팅방 문제
 */

public class FirstProblem {

    public static void main(String[] args) {
        String[] answer = {"Enter uid1234 Muzi",
                "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo",
                "Change uid4567 Ryan"};
        Solution so = new Solution();

        String[] result =so.solution(answer);

        for(String each : result){
            System.out.println(each);
        }

    }

}

class Solution {
    public String[] solution(String[] record) {
        String[] answer;

        Map<String, String> audience = new HashMap<>();
        ArrayList<String[]> actArray = new ArrayList<>();

        int index = 0;

        for(String each : record){

            String[] temp = each.split(" "); //나누게 된다. Enter, uid123,Muzi
            // Enter uid name
            // leave uid
            // change uid name
            switch (temp[0]){
                case "Enter":
                    audience.put(temp[1],temp[2]);
                    actArray.add(new String[]{temp[1],"님이 들어왔습니다."});
                    break;
                case "Leave":
                    actArray.add(new String[]{temp[1],"님이 나갔습니다."});
                    break;
                case "Change":
                    audience.put(temp[1],temp[2]);
                    break;
            }
        }

        answer = new String[actArray.size()];

        for(String[] each: actArray){
            String temp = audience.get(each[0])+each[1];
            answer[index++] = temp;
        }


        return answer;
    }
}