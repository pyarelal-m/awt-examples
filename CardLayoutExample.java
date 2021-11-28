import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*
<applet code="CardLayoutExample.class" height=200 width=200>
</applet>
*/

class card extends Panel
{
	Label lb;
	Button btn;
	
public card(String title, CardLayoutExample parent,Color col)
	{
		lb=new Label(title);
		btn=new Button("Next");
		btn.addActionListener(parent);
		setLayout(new FlowLayout());
		setBackground(col);
		add(lb);
		add(btn);
	}
}

public class CardLayoutExample extends Applet implements  ActionListener
{
	card card1,card2,card3,card4,card5,card6,card7,card8,card9,card10,card11,card12,card13;
	CardLayout cardlayout=new CardLayout();
	int i=1;
	
    public void init() 
    {
    	card1=new card("1",this,Color.red);
    	card2=new card("2",this,Color.blue);
    	card3=new card("3",this,Color.green);
    	card4=new card("4",this,Color.yellow);
    	card5=new card("5",this,Color.cyan);
    	card6=new card("6",this,Color.gray);
    	card7=new card("7",this,Color.MAGENTA);
    	card8=new card("8",this,Color.orange);
    	card9=new card("9",this,Color.pink);
 card10=new card("10",this,Color.getHSBColor(50,100,250));
    	card11=new card("King",this,Color.white);
    	card12=new card("Queen",this,Color.lightGray);
    	card13=new card("Jack",this,Color.DARK_GRAY);
    	
    	
    	setLayout(cardlayout);
    	
    	add(card1,"c1");
    	add(card2,"c2");
    	add(card3,"c3");
    	add(card4,"c4");
    	add(card5,"c5");
    	add(card6,"c6");
    	add(card7,"c7");
    	add(card8,"c8");
    	add(card9,"c9");
    	add(card10,"c10");
    	add(card11,"c11");
    	add(card12,"c12");
    	add(card13,"c13");
    	
    	cardlayout.show(this,"c1");
    	
    	
    }
    
    public void actionPerformed(ActionEvent e)
    {
    	i++;
    	if(i>13)
    	{
    		i=1;
    	}
    	switch(i)
    	{
    		case 1:
    			 cardlayout.show(this,"c1");
    			 break;
    		case 2:
    			 cardlayout.show(this,"c2");
    			 break;
    		case 3:
    			 cardlayout.show(this,"c3");
    			 break;
    		case 4:
    			 cardlayout.show(this,"c4");
    			 break;
    		case 5:
    			 cardlayout.show(this,"c5");
    			 break;
    		case 6:
    			 cardlayout.show(this,"c6");
    			 break;
    		case 7:
    			 cardlayout.show(this,"c7");
    			 break;
    		case 8:
    			 cardlayout.show(this,"c8");
    			 break;
    		case 9:
    			 cardlayout.show(this,"c9");
    			 break;
    		case 10:
    			 cardlayout.show(this,"c10");
    			 break;
    		case 11:
    			 cardlayout.show(this,"c11");
    			 break;
    		case 12:
    			 cardlayout.show(this,"c12");
    			 break;
    		case 13:
    			 cardlayout.show(this,"c13");
    			 break;
    			 
    	}
    	
    
    }

}