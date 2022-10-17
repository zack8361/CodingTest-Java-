package GUI;

import javax.swing.*;
import java.awt.*;
import java.sql.SQLOutput;

public class MyFrame extends JFrame {
    public MyFrame(){
        Container c = this.getContentPane();
        this.setLocation(200,200);
        this.setSize(500,500);
        c.setLayout(new GridLayout(3,4,5,5));
        for(int i=0; i<12; i++){
            JButton b = new JButton(Integer.toString(i));
            b.setBackground(Color.green);
            c.add(b);

        }
        this.setVisible(true);
        System.out.println("ㅇㅇㅇ");
    }

    public static void main(String[] args) {

        MyFrame f = new MyFrame();
        System.out.println("메인 종료합니다.");

    }
}
