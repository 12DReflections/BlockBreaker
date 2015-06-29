import javax.swing.JFrame;

/*
 * A Block Breaker Game
 * Content created by Julian Wise following a course from Eduonix
 */
public class Main {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Block Breaker");
		
		BlockBreakerPanel panel = new BlockBreakerPanel();
		
		//Put the display panel into the content pane
		//Set it to visible and fixed size.
		//Set to exi
		
		frame.getContentPane().add(panel);
		frame.setVisible(true);
		frame.setSize(490,600);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}


/*
 * Why do I need frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); ?
You need the line 
frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
Because the default behaviour for the JFrame when you press the X button is the equivalent to

frame.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
So almost all the times you'll need to add that line manually when creating your JFrame

 *-stackoverflor
 */