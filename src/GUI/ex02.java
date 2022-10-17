package GUI;

import javax.swing.*;
import javax.swing.plaf.basic.BasicProgressBarUI;
import java.awt.*;

public class ex02 extends JFrame {
    ex02(){ //생성자 안에 다가 코딩
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("BorderLayout Practice");
        this.setSize(400,400);
        Container c = this.getContentPane();
        c.setLayout(new BorderLayout(5,7));
        c.add(new JButton("WEST"),BorderLayout.WEST);
        c.add(new JButton("NORTH"),BorderLayout.NORTH);
        c.add(new JButton("SOUTH"),BorderLayout.SOUTH);
        c.add(new JButton("EAST"),BorderLayout.EAST);
        c.add(new JButton("CENTER"),BorderLayout.CENTER);
        this.setVisible(true);
    }
    public static void main(String[] args) {
        ex02 ex = new ex02();

    }
}
