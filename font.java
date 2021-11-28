import java.awt.*;
import java.applet.*;

/*
<applet code="font.class" width=500 height=500>
</applet>
*/

public class font extends Applet
{
	
	public void init()
	{
		setBackground(Color.red);
		setForeground(Color.yellow);
	}
	
	public void paint(Graphics g)

	{
		Font f1=new Font("Arial",Font.PLAIN,15);
	Font f2=new Font("Times New Roman",Font.BOLD,20);
	Font f3=new Font("Verdana",Font.BOLD|Font.ITALIC,30);
		
		g.setFont(f1);
		g.drawString("welcome to India",55,55);
		
		g.setFont(f2);
		g.drawString("welcome to India",155,155);
		
		g.setFont(f3);
		g.drawString("welcome to India",200,200);
		
		
		
	}
}