import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
/*
<APPLET CODE="ButtonLableTextField.class" WIDTH=290 HEIGHT=200 >
</APPLET>
*/
public class ButtonLableTextField extends Applet implements ActionListener
{
	TextField tex1, tex2, tex3, tex4;
	Label num1, num2, calculatorAction;
	Button b1;
	public void init()
	{	
		num1 = new Label("First Number:");
		add(num1);
		tex1 = new TextField(10);
		add(tex1);
		calculatorAction = new Label("User Input(+,-,*,/,^,sin)");
		add(calculatorAction);
		tex4 = new TextField(10);
		add(tex4);
		num2 = new Label("Second Number:");
		add(num2);
		tex2 = new TextField(10);
		add(tex2);
		b1 = new Button("Calculate");
		add(b1);
		b1.addActionListener(this);
		tex3 = new TextField(20);
		add(tex3);
	}
public void actionPerformed(ActionEvent e) 
{
	if(e.getSource() == b1)
	{
	if (tex4.getText().equals("+"))
	{
		double product = Double.parseDouble(tex1.getText()) +
		Double.parseDouble(tex2.getText());
		tex3.setText(String.valueOf(product));
	}
	else if  (tex4.getText().equals("-"))
  	{
		double product = Double.parseDouble(tex1.getText()) -	
		Double.parseDouble(tex2.getText());
		tex3.setText(String.valueOf(product));
	}
	else if  (tex4.getText().equals("*"))
  	{
		double product = Double.parseDouble(tex1.getText()) *	
		Double.parseDouble(tex2.getText());
		tex3.setText(String.valueOf(product));
	}
	else if  (tex4.getText().equals("/"))
  	{
		double product = Double.parseDouble(tex1.getText()) /	
		Double.parseDouble(tex2.getText());
		tex3.setText(String.valueOf(product));
	}
	else if  (tex4.getText().equals("^"))
  	{
		double product =Math.pow( Double.parseDouble(tex1.getText()), Double.parseDouble(tex2.getText()) );	
		
		tex3.setText(String.valueOf(product));
	}
	else if  (tex4.getText().equals("sin"))
  	{
		double product =Double.parseDouble(tex1.getText())*Math.sin( 2*3.142*Double.parseDouble(tex2.getText())/360 );	
		
		tex3.setText(String.valueOf(product));
	}
}
}
}
