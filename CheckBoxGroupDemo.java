import java.awt.*;

import java.awt.event.*;

import java.applet.Applet;

/*

<applet code="CheckBoxGroupDemo.class"  height="500"   width="500" >

</applet>

*/

public class CheckBoxGroupDemo extends Applet implements ItemListener

{

String demand;

Checkbox cb1,cb2,cb3,cb4,cb5,cb6,cb7,cb8;

CheckboxGroup beverages,snacks;

public void init()

{

beverages = new CheckboxGroup();

snacks = new CheckboxGroup();

cb1 = new Checkbox("Tea",beverages,false);

cb2 = new Checkbox("Coffee",beverages, false);

cb3 = new Checkbox("Juice",beverages, false);

cb4 = new Checkbox("Coktail",beverages, false);

cb5 = new Checkbox("Burger",snacks, false);

cb6 = new Checkbox("Pizaa",snacks, false);

cb7 = new Checkbox("French Fries",snacks, false);

cb8 = new Checkbox("Hot Dog",snacks, false);

add(cb1);

add(cb2);

add(cb3);

add(cb4);

add(cb5);

add(cb6);

add(cb7);

add(cb8);

cb1.addItemListener(this);

cb2.addItemListener(this);

cb3.addItemListener(this);

cb4.addItemListener(this);

cb5.addItemListener(this);

cb6.addItemListener(this);

cb7.addItemListener(this);

cb8.addItemListener(this);

}

public void itemStateChanged(ItemEvent ie)

{

repaint();

}

public void paint(Graphics g)

{

g.drawString("Beverages ",10,40);

demand="  Tea : "+cb1.getState();

g.drawString(demand,10,60);

demand="  Coffee : "+cb2.getState();

g.drawString(demand,10,80);

demand="  Juice : "+cb3.getState();

g.drawString(demand,10,100);

demand="  Cocktail : "+cb4.getState();

g.drawString(demand,10,120);

g.drawString("Snacks",10,140);

demand="  Burger : "+cb5.getState();

g.drawString(demand,10,160);

demand="  Pizza : "+cb6.getState();

g.drawString(demand,10,180);

demand="  French Fries : "+cb7.getState();

g.drawString(demand,10,200);

demand="  Hot Dog : "+cb8.getState();

g.drawString(demand,10,220);

}

}                      