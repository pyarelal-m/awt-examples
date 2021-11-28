/*To execute the applet by appletviewer tool, create an applet that contains applet tag in comment and compile it. After that run it by: appletviewer First.java. Now Html file is not required but it is for testing purpose only.*/

//App_Viewer.java
import java.applet.Applet;
import java.awt.Graphics;
public class App_Viewer extends Applet{

public void paint(Graphics g){
g.drawString("welcome to applet",150,150);
}

}
/*
<applet code="App_Viewer.class" width="300" height="300">
</applet>
*/

/*To execute the applet by appletviewer tool, write in command prompt:
c:\>javac App_Viewer.java
c:\>appletviewer App_Viewer.java*/