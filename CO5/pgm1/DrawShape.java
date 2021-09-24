import java.awt.*;
import java.applet.*;
/* <applet code="DrawShape" width=700 height=600>
</applet> */
public class DrawShape extends Applet
{
    public void init()
    {
        setBackground(Color.yellow);
        setForeground(Color.red);
    }
    public void paint(Graphics g)
    {
        // g.drawString("Hello World........",100,200);
        g.drawLine(300,0,300,100);
        g.drawOval(0,200,50,50);
        g.drawRect(0,120,20,50);
        // g.fillArc(20,30,30,20,0,-180);
    }
}