package hayeren_final;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Test {
    static int c = 1;
    public static void main(String[] args) {
        final int a = 54;

        Human h = new Human(2000);
        System.out.println(h.getYear());

        Triangle t = new Triangle(1,1,1,5,4,1);
        t.printPerimeter();


        JFrame f = new JFrame();
        f.setSize(400,600);
        JButton j = new JButton("Press me");
        f.add(j);

        j.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Count " + c ++);
            }
        });
        f.setVisible(true);
    }

}
