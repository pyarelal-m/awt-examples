import java.awt.*;

import java.awt.event.*;

import java.applet.Applet;

/*

<applet code="CheckBoxDemo.class"  height="500"   width="500" >

</applet>

*/

public class CheckBoxDemo extends Applet implements ItemListener

{

String cb2label,like,demand;

Checkbox cb1,cb2,cb3,cb4;

public void init()

{

cb1 = new Checkbox("Tea");

cb2 = new Checkbox("Coffee",true);

cb3 = new Checkbox("Juice",true);

cb4 = new Checkbox();

add(cb1);

add(cb2);

add(cb3);

add(cb4);

cb1.addItemListener(this);

cb2.addItemListener(this);

cb3.addItemListener(this);

cb4.addItemListener(this);

cb4.setLabel("Cocktail");

cb2label=cb2.getLabel();

}

public void itemStateChanged(ItemEvent ie)

{

repaint();

}

public void paint(Graphics g)

{

g.drawString("Checkbox 2 : "+cb2label,10,40);

demand="  Tea : "+cb1.getState();

g.drawString(demand,10,60);

demand="  Coffee : "+cb2.getState();

g.drawString(demand,10,80);

demand="  Juice : "+cb3.getState();

g.drawString(demand,10,100);

demand="  Cocktail : "+cb4.getState();

g.drawString(demand,10,120);

}

}