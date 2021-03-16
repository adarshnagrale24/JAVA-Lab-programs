package com.company;
import java.awt.*;
import java.awt.event.*;
class emoji extends Frame
{
    emoji()
    {
        this.addWindowListener( new WindowAdapter()
        {
            @Override
            public void windowClosing(WindowEvent we)
            {
                System.exit(0);
            }
        });
    }
    @Override
    public void paint(Graphics g)
    {
        g.setColor(Color.blue);
        g.drawRect(40,40,200,200);
        g.drawOval(90,70,80,80);
        g.drawOval(110,95,5,5);
        g.drawOval(145,95,5,5);
        g.drawLine(130,95,130,115);
        g.drawArc(113,115,35,20,0,-180);


        g.fillOval(110,95,5,5);
        g.fillOval(145,95,5,5);

        g.fillArc(113,115,35,20,0,-180);
    }
    public static void main(String[] args)
    {
        emoji s=new emoji();
        s.setSize(500,500);
        s.setTitle("happy");
        s.setVisible(true);
    }
}
