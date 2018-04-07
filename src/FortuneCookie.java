import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FortuneCookie implements ActionListener {
public static void main(String[] args) {
	FortuneCookie cookie= new FortuneCookie();
cookie.showButton();

}
	
	
	
	


public  void showButton() {
	System.out.println("Button");
	JFrame frame = new JFrame();
	frame.setVisible(true);
	JButton button= new JButton();
	button.setText("Click me for a Fortune!");
	frame.add(button);
	button.addActionListener(this);
	frame.pack();
}






@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	JOptionPane.showMessageDialog(null, "Woohoo!");
	int rand = new Random().nextInt(5);
	if(rand==0) {
		JOptionPane.showMessageDialog(null, "You will have good luck!");
	}
	else if(rand==1) {
		JOptionPane.showMessageDialog(null, "You will find a penny sometime today.");
	}
	else if(rand==2) {
		JOptionPane.showMessageDialog(null, "Today will be an ideal day for you.");
	}
	else if(rand==3) {
		JOptionPane.showMessageDialog(null, "Something problemsome will happen today.");
	}
	else if(rand==4) {
		JOptionPane.showMessageDialog(null, "Everything will not go in your favor.");
	}
	else {
		JOptionPane.showMessageDialog(null, "The 5 wonders will occur today.");
	}
}
}
