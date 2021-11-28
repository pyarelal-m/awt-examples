import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*
<applet code="mouseevent" width=300 height=100>
</applet>
*/

public class mouseevent extends Applet implements MouseListener,MouseMotionListener
{
String str=" ";
int x=0,y=0;


public void init()
{
	addMouseListener(this);
	addMouseMotionListener(this);
}


public void mouseClicked(MouseEvent me)
{
	x=0;
	y=20;
	str="Mouse Clicked.";
	repaint();
}

public void mouseEntered(MouseEvent me)
{
	x=0;
	y=20;
	str="Mouse Entered.";
	repaint();
}


public void mouseExited(MouseEvent me)
{
	x=0;
	y=20;
	str="Mouse Exited.";
	repaint();
}


public void mousePressed(MouseEvent me)
{
	x=me.getX();
	y=me.getY();
	str="Mouse Pressed.";
	repaint();
}


public void mouseReleased(MouseEvent me)
{
	x=me.getX();
	y=me.getY();
	str="Mouse Released.";
	repaint();
}


public void mouseDragged(MouseEvent me)
{
	x=me.getX();
	y=me.getY();
	str="Mouse is dragging";
	showStatus("Dragging mouse at "+x+","+y);
	repaint();
}


public void mouseMoved(MouseEvent me)
{
	x=me.getX();
	y=me.getY();
	showStatus("Moving mouse at "+x+","+y);
	repaint();
}

public void paint(Graphics g)
{
	g.drawString(str,x,y);
}
}