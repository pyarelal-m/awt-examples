//To execute the applet by html file, create an applet and compile it. After that create an html file and place the applet code in html file. Now click the html file.

//App_html.java
import java.applet.Applet;
import java.awt.Graphics;
public class App_html extends Applet{

public void paint(Graphics g){
g.drawString("welcome",150,150);
}

}
//Note: class must be public because its object is created by Java Plugin software that resides on the browser.