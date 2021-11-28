import java.awt.*;

import java.awt.event.*;

import java.applet.Applet;

/*

<applet code="ChoiceDemo.class" height=500 width=500>

</applet>

*/

public class ChoiceDemo extends Applet implements ItemListener

{

Choice Beverages,Snacks;

String CurrentBeverage, CurrentSnack;

int index;

public void init()

{

Beverages=new Choice();

Snacks=new Choice();

Beverages.add("Coffee");

Beverages.add("Tea");

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

g.drawString("Menu",10,60);

CurrentBeverage=Beverages.getSelectedItem();

g.drawString(CurrentBeverage,10,80);

CurrentSnack=Snacks.getSelectedItem();

g.drawString(CurrentSnack,10,100);

}

}
