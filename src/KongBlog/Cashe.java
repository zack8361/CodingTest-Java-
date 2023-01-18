package KongBlog;

import java.util.ArrayDeque;

/**
 * 캐시 : 프로그래머스(Lv.2)
 */
public class Cashe {
    public static void main(String[] args) {
        int cacheSize = 3;
        String[] cities = {"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "Jeju", "Pangyo", "Seoul", "NewYork", "LA"};
        System.out.println(solution(cacheSize,cities));
    }

    private static int solution(int cacheSize, String[] cities) {
        int answer =0;
        ArrayDeque<String> cache = new ArrayDeque<>();

        for(int i=0; i<cities.length; i++){
            cities[i] = cities[i].toUpperCase(); //대소문자의 구분을 없애주기 위해서 cities 의 모든 요소들을 대문자로 변경.
            if(cache.contains(cities[i])){ //"cashe hit" 일 경우
                answer+=1;  //1을 더해주고
                cache.remove(cities[i]); //중복 데이터를 제거해준다.
                cache.addLast(cities[i]); //새로운 데이터를 queue의 마지막에 삽입.
            }
            else { //"cahse miss" 일 경우
                answer+=5; //5를 더해주고
                cache.addLast(cities[i]); //새로운 데이터를 queue의 마지막에 삽입.
                if(cache.size()>cacheSize){ //만약 queue(cache) 의 사이즈가 3 을 넘어간다면
                    cache.pollFirst(); //가장 오래된 데이터 (queue 기준 ) 가장 앞의 데이터를 삭제
                }
            }
        }

        return answer;
    }
}
