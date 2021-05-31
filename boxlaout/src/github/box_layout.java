package github;
import javax.swing.*;
import java.awt.*;

public class box_layout extends Frame{

  Button b1=new Button("A");
    Button b2=new Button("B");
    Button b3=new Button("C");
    Button b4=new Button("D");
    Button b5=new Button("E");
    Button b6=new Button("G");
    Button b7=new Button("H");
    Button b8=new Button("I");

    box_layout(){
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
        add(b7);
        add(b8);

    }

    public static void main(String[] args) {

      box_layout b=new box_layout();
      b.setSize(400,400);
      b.setVisible(true);
      b.setLayout(new BoxLayout(b,BoxLayout.Y_AXIS));

    }
}