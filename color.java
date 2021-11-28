import java.awt.*;
import java.applet.*;

/*
<applet code="color.class" width=500 height=500>
</applet>
*/

public class color extends Applet
{
	
	public void init()
	{
		setBackground(Color.red);
		setForeground(Color.yellow);
	}
	
	public void paint(Graphics g)

	{
		Color c1=new Color(100,100,255);
		g.drawString("welcome to India",55,55);
		g.setColor(c1);
		g.drawString("welcome to India",155,155);
		
		g.setColor(Color.black);
		g.drawLine(100,100,200,200);
		g.setColor(Color.getHSBColor(220,122,222));
		g.drawOval(100,100,100,100);
			

	}
}