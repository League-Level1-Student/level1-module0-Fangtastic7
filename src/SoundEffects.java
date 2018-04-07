import java.applet.AudioClip;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SoundEffects implements ActionListener {

	public static void main(String[] args) {
		SoundEffects se = new SoundEffects();
		se.playSound("sawing-wood-daniel_simon.wav");
		new JackintheBox().createUI();
	}
	private void createUI() {
		JFrame frame = new JFrame();
		frame.setVisible(true);
		JPanel panel = new JPanel();
		frame.add(panel);
		JButton button1 = new JButton();
		button1.setText("Crash Cymbal");
		button1.setSize(100, 100);
		panel.add(button1);
		button1.addActionListener(this);
	}
	
	
	
	
	private void playSound(String fileName) {
	     AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName)); 
	     sound.play();
	}

}
