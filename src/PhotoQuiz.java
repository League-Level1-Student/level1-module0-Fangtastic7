/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 1
 */


import java.awt.Component;
import java.awt.Frame;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz 
implements MouseMotionListener
{
	
	public static void main(String[] args) throws Exception {
		Frame quizWindow = new Frame();
		quizWindow.setVisible(true);
			int score = 0;
			
		// 1. find an image on the internet, and put its URL in a String variable (from your browser, right click on the image, and select “Copy Image URL”)
			String doggo = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSf-8InGizc0Sddp460QQ7gisQTeGD867UGa5DaaWoMkk67hEYN";
		// 2. create a variable of type "Component" that will hold your image
			
			
			Component image1;
		// 3. use the "createImage()" method below to initialize your Component
			image1 = createImage(doggo);
			AtMouseComponent(image1);
		// 4. add the image to the quiz window
			quizWindow.add(image1);
		// 5. call the pack() method on the quiz window
			quizWindow.pack();
		// 6. ask a question that relates to the image
			String question = JOptionPane.showInputDialog("What type of dog is this?");
		// 7. print "CORRECT" if the user gave the right answer
			if(question.equalsIgnoreCase("doge")) {
				score = score +1;
				JOptionPane.showMessageDialog(null, "CORRECT! Score: " + score );
				
				
			}
		// 8. print "INCORRECT" if the answer is wrong
			else {
				JOptionPane.showMessageDialog(null, "INCORRECT Score: " + score);
			}
		// 9. remove the component from the quiz window (you may not see the effect of this until step 12)
			quizWindow.remove(image1);
		// 10. find another image and create it (might take more than one line of code)
			String kermit = "https://i.pinimg.com/originals/ba/e8/23/bae82312ee7e96e22987459541037281.png";
			Component image2; 
			image2 = createImage(kermit);
			AtMouseComponent(image2);
		// 11. add the second image to the quiz window
			quizWindow.add(image2);
		// 12. pack the quiz window
			quizWindow.pack();
		// 13. ask another question
			String question2 = JOptionPane.showInputDialog("What type of animal is this?")
;		// 14+ check answer, say if correct or incorrect, etc.
			if(question2.equalsIgnoreCase("frog")) {
				score = score +1;
				JOptionPane.showMessageDialog(null, "CORRECT! Score: " + score);
			}
			else {
				
				JOptionPane.showMessageDialog(null, "INCORRECT Score: " + score);
			}
			JOptionPane.showMessageDialog(null, "Total Score: " + score );
			
				
	}
	
	private static Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		
		
			
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	
	// *15. make something happen when mouse enters image (imageComponent.addMouseMotionListener()) 
	 public static void AtMouseComponent(Component imageComponent) {
		 System.out.println("Hello!");
	 }

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}




