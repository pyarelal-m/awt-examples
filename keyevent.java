import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*
<applet code="keyevent" width=300 height=100>
</applet>
*/

public class keyevent extends Applet implements KeyListener
{

String str=" ";
int x=10,y=10;

public void init()
{
	addKeyListener(this);
	requestFocus();
}

public void keyPressed(KeyEvent ke)
{
	showStatus("Key Down");
}

public void keyReleased(KeyEvent ke)
{
	showStatus("Key Up");
}

public void keyTyped(KeyEvent ke)
{
	str+=ke.getKeyChar();
                  	repaint();
}


public void paint(Graphics g)
{
	g.drawString(str,x,y);
}
}