package KongBlog;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Programmers17680 {
    public static void main(String[] args) {
        int cacheSize = 3;
        String[] cities = {"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "Jeju", "Pangyo", "Seoul", "NewYork", "LA"};
        System.out.println(solution(cacheSize,cities));
    }

    private static int solution(int cacheSize, String[] cities) {
        int answer =0;
        List<String> list = new ArrayList<>();
        if(cacheSize == 0){
            return cities.length*5;
        }
        for(int i=0; i<cacheSize; i++){
            cities[i] = cities[i].toLowerCase();
            if(cacheSize==cities.length){
                if(list.isEmpty()){
                    list.add(cities[i]);
                    answer+=5;
                }
                else {
                    if(list.contains(cities[i])){
                        list.add(cities[i]);
                        answer+=1;
                    }
                    else {
                        list.add(cities[i]);
                        answer+=5;
                    }
                }
            }
            else {
                list.add(cities[i]);
                answer+=5;
            }
        }

        for(int i=cacheSize; i<cities.length; i++){
            cities[i] = cities[i].toLowerCase();
            if(list.contains(cities[i])){
                list.remove(cities[i]);
                list.add(cities[i]);
                answer+=1;
            }
            else {
                list.remove(0);
                list.add(cities[i]);
                answer+=5;
            }
        }
        System.out.println(list);
        return answer;
    }
}
