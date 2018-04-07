/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 1
 */


import java.applet.AudioClip;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class DrumKit extends MouseAdapter {

    JLabel drumLabelWithImage;
    JLabel snare_drum;
    public static void main(String[] args) throws Exception {
   	 new DrumKit().getGoing();
    }

    private void getGoing() throws MalformedURLException {
   	 // 1. Make a JFrame variable and initialize it using "new JFrame()"
   	 JFrame object = new JFrame();
   	 // 2. Make the frame visible
   	 	object.setVisible(true);
   	 // 3. Set the size of the frame
   	 	object.setSize(600, 300);
   	 // 4. Set the title of the frame
   	 	object.setTitle("Drum Kit");
   	 // 5. Make a JPanel and initialize it.
   	 	JPanel object2 = new JPanel();
   	 // 6. Add the panel to the frame. (The panel is invisible.)
   	 	object.getContentPane().add(object2);
   	 // 7. Download an image of a drum from the Internet. Drop it into your Eclipse project under "default package".
   	 // 8. Put the name of your image in a String variable.
   	 		String crash = "crash.jpg";
   	 // 9. Edit the next line to use your String variable
// drumLabelWithImage = createLabelImage(drumImageString);
   	 		drumLabelWithImage = createLabelImage(crash);
   	 // 10. Add the image to the panel
   	 		object2.add(drumLabelWithImage);
   	 // 11. Set the layout of the panel to "new GridLayout()"
   	 	object2.setLayout(new GridLayout());
   	 	//	object2.setLayout(new GridLayout());
   	 // 12. call the pack() method on the frame
   	 		//object.pack();
   	 // 13. add a mouse listener to drumLabelWithImage.
   	 		drumLabelWithImage.addMouseListener(this);
   	 		
   	 		//JPanel snaredrum = new JPanel();
   	 		//object.getContentPane().add(snaredrum);
   	 		String snare = "snare.jpg";
   	 		snare_drum = createLabelImage(snare);
   	 		object2.add(snare_drum);
   	 		
   	 	
   	 		object.pack();
   	 		
   	 		snare_drum.addMouseListener(this);
    }

    public void  mouseClicked(MouseEvent e) {
   	 // 14. When the mouse is clicked, print "mouse clicked"

    		System.out.println("mouse clicked");

   	 JLabel drumClicked = (JLabel) e.getSource();
   	 // 15. Download a drum sound and drop it into your "default package". You can find it on freesound.org. To download it, log in as leagueofamazing/code4life.
   	 // 16. If they clicked on the drumImage...
   	 	
   		
   	
   		 // 17. ...use the playSound method to play a drum sound.
   	 if(drumClicked == drumLabelWithImage) {
   		 playSound("crashcymbal.wav");
   	 }
   	 // 18. Add more images to make a drumkit. Remember to add a mouse listener to each one.
   	 if(drumClicked==snare_drum) {
   	playSound("snare.wav");
   	 }
    }

    private JLabel createLabelImage(String fileName)
			throws MalformedURLException
	{
		URL imageURL = getClass().getResource(fileName);
		if (imageURL == null)
		{
			System.err.println("Could not find image " + fileName);
			return new JLabel();
		}
		Icon icon = new ImageIcon(imageURL);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}


    private void playSound(String fileName) {
   	 AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
   	 sound.play();
    }

}



