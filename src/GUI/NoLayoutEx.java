package GUI;

import javax.swing.*;
import java.awt.*;

public class NoLayoutEx extends JFrame {

    public NoLayoutEx(){
        this.setTitle("절대 위치 절대 크기");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400,400);

        Container c =  this.getContentPane();
        c.setBackground(Color.LIGHT_GRAY);
        c.setLayout(null); // 배치 관리자 삭제

        for(int i=0; i<12; i++){
            JButton b = new JButton(Integer.toString(i));
            b.setSize(80,20);
            b.setLocation(10,10);
            c.add(b);
        }
        this.setVisible(true);
    }


    public static void main(String[] args) {
        new NoLayoutEx();

    }
}
