import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Cuteness_TV implements ActionListener {
JButton button1 = new JButton();
JButton button2 = new JButton();
JButton button3 = new JButton();

Dimension MEDIUM = new Dimension();
Dimension SMALL = new Dimension();
public static void main(String[] args) {
	 new Cuteness_TV().createUI();
}
private void createUI() {
	JFrame frame = new JFrame();
	frame.setSize(500, 500);
	frame.setVisible(true);
	JPanel panel = new JPanel();
	panel.setSize(MEDIUM);
	frame.add(panel);
	button1.setText("I BET you will not last after this Duck Video");
	button1.setSize(SMALL);
	button2.setText("CUTE & Top Rated Frog Video");
	button2.setSize(SMALL);
	button3.setText("99.99% of people loved this Fluffy Unicorns Video");
	button3.setSize(SMALL);
	panel.add(button1);
	panel.add(button2);
	panel.add(button3);
	button1.addActionListener(this);
	button2.addActionListener(this);
	button3.addActionListener(this);
	frame.pack();
}
@Override
public void actionPerformed(ActionEvent arg0) {
	JButton buttonPressed = (JButton) arg0.getSource();
	if(buttonPressed==button1) {
		showDucks();
	}
	else if(buttonPressed==button2) {
		showFrog();
	}
	else if(buttonPressed==button3) {
		showFluffyUnicorns();
	}
}


void showDucks() {
    playVideo("oMQI0bJJOvM");
}

void showFrog() {
    playVideo("HBxn56l9WcU");
}

void showFluffyUnicorns() {
    playVideo("DsxMhcQvSCA");
}

void playVideo(String videoID) {
    try {
         URI uri = new URI("https://youtu.be/" + videoID + "?autoplay=1");
         java.awt.Desktop.getDesktop().browse(uri);
    } catch (Exception e) {
         e.printStackTrace();
    }
}
}
