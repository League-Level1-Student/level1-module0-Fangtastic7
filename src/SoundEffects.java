import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SoundEffects implements ActionListener {
	JButton button1 = new JButton();
	JButton button2 = new JButton();
	JButton button3 = new JButton();
	public static void main(String[] args) {
		SoundEffects se = new SoundEffects();
		se.playSound("sawing-wood-daniel_simon.wav");
		new SoundEffects().createUI();
		
	}
	private void createUI() {
		JFrame frame = new JFrame();
		frame.setSize(600, 600);
		frame.setVisible(true);
		JPanel panel = new JPanel();
		
		panel.setSize(500, 300);
		frame.add(panel);
		button1.setText("Crash Cymbal");
		button1.setSize(500, 300);
		panel.add(button1);
		button1.addActionListener(this);
		button2.setText("Snare Drum");
		button2.setSize(500,300);
		panel.add(button2);
		button2.addActionListener(this);
		frame.pack();
	}
	
	
	
	
	
	private void playSound(String fileName) {
	    AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
	    sound.play();
	     
	     
	     
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		JButton buttonPressed = (JButton) arg0.getSource();
		// TODO Auto-generated method stub
		if(buttonPressed==button1) {
			playSound("crashcymbal.wav");
		}
		else if(buttonPressed==button2) {
			playSound("snare.wav");
		}
	}

}
