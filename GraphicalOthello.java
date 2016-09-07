

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JLabel;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GraphicalOthello extends Othello {
	
	private JFrame gameFrame;
    private JButton[][] buttons;
    private JPanel gridPanel;
    
    

    /**
     * Constructor for objects of class GraphicalOthello
     */
    public GraphicalOthello()
    {
    	gameFrame = new JFrame("Othello");
    	gameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	gameFrame.setSize(800, 800);
    	
    	gridPanel = new JPanel();
    	gridPanel.setLayout(new GridLayout(SIZE,SIZE));
    	
    	buttons = new JButton[SIZE][SIZE];
    	
    	for(int i=0; i<SIZE;i++)
    	{
    		for(int j=0; j<SIZE;j++)
    		{
    			buttons[i][j]= new JButton();
    			buttons[i][j].addActionListener(new ButtonClicked());
    			gridPanel.add(buttons[i][j]);
    		}
    		
    	}
    	
    	gameFrame.setSize(800, 800);
    	gameFrame.add(gridPanel);
    	gameFrame.setVisible(true);
    }
    
    public void print()
    {
    	gameFrame.
    }
    
    public static void main (String [] args)
    {
        new GraphicalOthello().print();
    }

}
