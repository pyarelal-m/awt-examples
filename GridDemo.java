import java.awt.*;

import java.awt.event.*;

import java.applet.Applet;

/*

<applet code = GridDemo.class height = "300" width="300">

</applet>

*/

public class GridDemo extends Applet implements ActionListener

{

Button b1,b2,b3,b4,b5;

TextField t1;

Label l1;

public void init()

{

setLayout(new GridLayout(2,2));

b1=new Button("Coffee");

b2=new Button("Tea");

b3=new Button("Juice");

b4=new Button("Cocktail");

b5=new Button("Reset");

l1=new Label("Selected Menu : ");

t1 = new TextField("Select Menu Please");

add(b1);

add(b2);

add(b3);

add(b4);

add(b5);

add(l1);

add(t1);

b1.addActionListener(this);

b2.addActionListener(this);

b3.addActionListener(this);

b4.addActionListener(this);

b5.addActionListener(this);

}

public void actionPerformed(ActionEvent ae)

{

String action;

action=ae.getActionCommand();

if(action.equals("Coffee"))

{

t1.setText("Coffee");

}

else if(action.equals("Tea"))

{

t1.setText("Tea");

}

else if(action.equals("Juice"))

{

t1.setText("Juice");

}

else if(action.equals("Cocktail"))

{

t1.setText("Cocktail");

}

else

{

t1.setText("none");

}

}

}