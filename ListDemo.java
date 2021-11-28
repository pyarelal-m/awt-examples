import java.awt.*;

import java.awt.event.*;

import java.applet.Applet;

/*

<applet code="ListDemo.class" width=500 height=500>

</applet>

*/

public class ListDemo extends Applet implements ItemListener

{

String demand,demands[];

List Beverages, Snacks;

public void init()

{

Beverages = new List(4);

Snacks=new List(4,false);

Beverages.add("Tea");

Beverages.add("Coffee");

Beverages.add("Juices");

Beverages.add("Cocktail");

Snacks.add("Burger");

Snacks.add("Pizza");

Snacks.add("French Fries");

Snacks.add("Hot Dog");

add(Beverages);

add(Snacks);

Beverages.addItemListener(this);

Snacks.addItemListener(this);

}

public void itemStateChanged(ItemEvent ie)

{

repaint();

}

public void paint(Graphics g)

{

g.drawString("Beverages Ordered : ",20,100);

demand = Beverages.getSelectedItem();

g.drawString(demand,20,120);

g.drawString("Snacks Ordered : ",20,140);

demand = Snacks.getSelectedItem();

g.drawString(demand,20,160);

}

}