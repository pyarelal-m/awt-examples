import java.awt.*;

import java.awt.event.*;

import java.applet.Applet;

/*

<applet code="BorderLayoutDemo" height=500 width="500">

</applet>

*/

public class BorderLayoutDemo extends Applet

{

Button n,s,w,e,c;

public void init()

{

setLayout(new BorderLayout());

n=new Button("North");

s=new Button("South");

w=new Button("West");

e=new Button("East");

c=new Button("Center");

add(n,BorderLayout.NORTH);

add(s,BorderLayout.SOUTH);

add(w,BorderLayout.WEST);

add(e,BorderLayout.EAST);

add(c,BorderLayout.CENTER);

}

}
