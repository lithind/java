import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*
<applet code=Mouse width=800 height=800>
</applet>
*/
public class Mouse extends Applet implements MouseListener,MouseMotionListener
 {
	int x=40,y=40;
	String msg="MOUSE EVENTS";
	public void init()
  	   {
		addMouseListener(this);
  		addMouseMotionListener(this);
		setBackground(Color.pink);
		setForeground(Color.red);
	   }
public void mouseEntered(MouseEvent me)
	{
		setBackground(Color.red);
		repaint();
	}
public void mouseExited(MouseEvent me)
	{
		msg="MOUSE EXITED";
		setBackground(Color.black);
 		showStatus("mouse exited");
		repaint();
	}
public void mousePressed(MouseEvent me)
	{
		msg="MOUSE PRESSED";
		setBackground(Color.yellow);
		showStatus("mouse pressed");
		repaint();
	}
public void mouseReleased(MouseEvent me)
	{
		msg="MOUSE RELEASED";
		setBackground(Color.blue);
		showStatus("mouse Released");
		repaint();
	}
public void mouseMoved(MouseEvent me)
	{
		msg="MOUSE MOVED";
		x=me.getX();
		y=me.getY();
		setBackground(Color.black);
		showStatus("mouse moved");
		repaint();
	}

public void mouseClicked(MouseEvent me)
	{
		msg="MOUSE CLICKED";
		setBackground(Color.yellow);
		showStatus("mouse clicked");
		repaint();
	}
public void mouseDragged(MouseEvent me)
	{
		msg="MOUSE DRAGGED";
		setBackground(Color.green);
		showStatus("mouse dragged("+me.getX()+","+me.getY()+")");
		repaint();
	}
public void paint(Graphics g)
	{
		g.drawString(msg,x,y);
	}
}