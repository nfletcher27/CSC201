// program that detects when you press an arrow key and ups the count for it on a GUI

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ArrowKeys {
	
	public ArrowKeys() {
		JFrame frame = new JFrame();
		frame.setVisible(true);           // basic setup for our frame, setting it visible, setting its size, set its close operation, etc.
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 400);
		frame.setFocusable(true);
		
		JPanel panel = new JPanel();
		JLabel up = new JLabel();           // creating our panel and our labels to add to it
		JLabel down = new JLabel();
		JLabel left = new JLabel();
		JLabel right = new JLabel();
		
		panel.add(up);
		panel.add(down);        // adding our labels
		panel.add(left);
		panel.add(right);
		
		up.setText("Up: 0" );
		down.setText("Down: 0" );        // setting our default texts for our labels
		left.setText("Left: 0" );
		right.setText("Right: 0" );
		
		frame.addKeyListener(new KeyListener() {    // creating our KeyListener and importing the required methods
			
			int upCount = 0;
			int downCount = 0;       // our variables to keep track of counts for pressing keys
			int leftCount = 0;
			int rightCount = 0;

			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void keyPressed(KeyEvent e) {
				int keyCode = e.getKeyCode();     // a switch/case that will up our count for each variable if a certain key is pressed
				switch(keyCode) {
				case KeyEvent.VK_UP:
					up.setText("Up: " + Integer.toString(upCount++)); 
					break;
				case KeyEvent.VK_DOWN:
					down.setText("Down: " + Integer.toString(downCount++));
					break;
				case KeyEvent.VK_LEFT:
					left.setText("Left: " + Integer.toString(leftCount++));
					break;
				case KeyEvent.VK_RIGHT:
					right.setText("Right: " + Integer.toString(rightCount++));
					break;
				}
			}

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		}); 
		
		frame.add(panel);  // add our panel to our frame
	}
	
	public static void main(String[] args) {
	
		new ArrowKeys();
		
	}
}


