package openchallenge;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;

class Word{

    String eng;
    String kor;

    public Word(String eng, String kor){
        this.eng = eng;
        this.kor = kor;
    }
    public String getEng(){
        return eng;
    }
    public String getKor(){
        return kor;
    }
}

public class Oc07 {
    static Scanner kong = new Scanner(System.in);
    static Vector<Word> v = new Vector<Word>();
    public static void run(){
        Word[] Array = new Word[4];
        while (true) {
            int index = (int) (Math.random() * v.size());
            for (int i = 0; i < 4; i++) {
                Array[i] = v.get(index);
                System.out.print("(" + (i + 1) + ")" + Array[i].getKor());
            }

        }
    }
    public static void main(String[] args) {
        Scanner kong = new Scanner(System.in);


        System.out.println("Java 단어 테스트를 시작합니다. -1을 입력하면 종료합니다.");
        System.out.println("현재 10개의 단어가 들어 있습니다.");
        System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
        v.add(new Word("Array","배열"));
        v.add(new Word("Apple","사과"));
        v.add(new Word("int","정수"));
        v.add(new Word("double","실수"));
        v.add(new Word("Extends","상속"));
        v.add(new Word("Character","캐릭터"));
        v.add(new Word("Kong","콩"));
        v.add(new Word("Lee","차노"));
        v.add(new Word("Nam","윤형"));

        int index = (int)(Math.random()*v.size()); //vector 내의 랜덤으로 인덱스 값 지정
        Word w = v.get(index);
        while (true) {
            System.out.println(w.getEng() + "?");
            break;
        }
        run();

    }
}















