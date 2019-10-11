package kakaoPro2019;



import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ProblemSecondTime {

    public static void main(String[] args) {

        String[] result = {"Enter uid1234 Muzi","Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"};

        String[] answer = solution(result);

    }

        public static String[] solution(String[] record) {
            String[] answer = new String[100050];
            int index=0;
            Map<String,String> user = new HashMap<>();

            for(String each : record ){
                switch (each.charAt(0)){
                    case 'E':{
                        String[] temp = each.split(" ");
                        user.put(temp[1],temp[2]);
                        answer[index++] = temp[0]+"님이 들어왔습니다.";
                    }
                    case 'L':{
                        String[] temp = each.split(" ");
                        answer[index++] = temp[0]+"님이 나갔습니다.";
                    }
                    case 'C':{
                        String[] tepublic static void main(String[] args) {

                            String[] result = {"Enter uid1234 Muzi","Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"};

                            String[] answer = solution(result);

                        }

                        public static String[] solution(String[] record) {
                            String[] answer = new String[100050];
                            int index=0;
                            Map<String,String> user = new HashMap<>();

                            for(String each : record ){
                                switch (each.charAt(0)){
                                    case 'E':{
                                        String[] temp = each.split(" ");
                                        user.put(temp[1],temp[2]);
                                        answer[index++] = temp[0]+"님이 들어왔습니다.";
                                    }
                                    case 'L':{
                                        String[] temp = each.split(" ");
                                        answer[index++] = temp[0]+"님이 나갔습니다.";
                                    }
                                    case 'C':{
                                        String[] temp = each.split(" ");
                                        user.put(temp[1],temp[2]);
                                    }
                                }
                            }

                            System.out.println("hi");
                            return answer;

                        }
                    }
                    mp = each.split(" ");
                        user.put(temp[1],temp[2]);
                    }
                }
            }

            System.out.println("hi");
            return answer;

    }
}
