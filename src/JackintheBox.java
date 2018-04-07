import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Dimension;

import javax.print.DocFlavor.URL;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import javafx.scene.media.AudioClip;

public class JackintheBox implements ActionListener {
	int t=0;
	public static void main(String[] args) {
		
		
	
	 new JackintheBox().createUI();
	}
void createUI() {
	// TODO Auto-generated method stub
	JFrame frame = new JFrame();
	
	frame.setVisible(true);
	JButton button = new JButton();
	button.setText("Suprise");
	frame.add(button);
	frame.setSize(500, 500);
	button.addActionListener(this);
}
	
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	t = t+1;
	if(t==5) {
		showPicture("jackInTheBox.png");
		createLabelImage("jackInTheBox.png");
		playSound("homer-woohoo.wav");
	}
	
}
private void playSound(String string) {
	// TODO Auto-generated method stub
	 try {
         java.applet.AudioClip sound = JApplet.newAudioClip(getClass().getResource(string));
         sound.play();
    } catch (Exception e) {
         e.printStackTrace();
    }

}
private void showPicture(String filename) { 
    try {
         JLabel imageLabel = createLabelImage(filename);
         JFrame frame = new JFrame();
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     
         frame.add(imageLabel);
         frame.setVisible(true);
        
         frame.pack();
    } catch (Exception e) {
         e.printStackTrace();
    }
}
private JLabel createLabelImage(String fileName) {
    try {
         java.net.URL imageURL = getClass().getResource(fileName);
         if (imageURL == null) {
              System.err.println("Could not find image " + fileName);
              return new JLabel();
         } else {
              Icon icon = new ImageIcon(imageURL);
              JLabel imageLabel = new JLabel(icon);
              return imageLabel;
         }
    } catch (Exception e) {
         System.err.println("Could not find image " + fileName);
         return new JLabel();
    }
   
   }
}

