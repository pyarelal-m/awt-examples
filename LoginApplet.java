import java.awt.*;
import java.applet.*;
import java.awt.event.*;

/*
 <applet code="LoginApplet.class" height="150" width="300"></applet>
*/
public class LoginApplet extends Applet implements ActionListener
{
	Label lbUser,lbPassword,lbMsg;
	TextField txtUser,txtPassword;
	Button btnLogin;
	
	public void init()
	{
		this.setLayout(null);
		
		lbUser=new Label("Username");
		lbPassword=new Label("Password");
		lbMsg=new Label();
		
		txtPassword=new TextField(20);
		txtUser=new TextField(20);
		
		btnLogin=new Button("Login...");
		
		txtPassword.setEchoChar('*');
		btnLogin.addActionListener(this);
		
		lbUser.setBounds(10,10,80,25);
		lbPassword.setBounds(10,40,80,25);
		txtUser.setBounds(100,10,150,25);
		txtPassword.setBounds(100,40,150,25);
		btnLogin.setBounds(100,70,50,25);
		lbMsg.setBounds(10,100,150,25);
		
		add(lbUser);
		add(txtUser);
		add(lbPassword);
		add(txtPassword);
		add(btnLogin);
		add(lbMsg);
		
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if(txtUser.getText().equals("admin") && txtPassword.getText().equals("123"))
		{
			lbMsg.setText("Login Successful!");
		}
		else
		{
			lbMsg.setText("Login Failed!");
		}
	}
}

