import javax.swing.JFrame;

/*
 * A Block Breaker Game
 * Content created by Julian Wise following a course from Eduonix
 */
public class Main {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Block Breaker");
		
		BlockBreakerPanel panel = new BlockBreakerPanel();
		
		frame.getContentPane().add(panel);
		frame.setVisible(true);
		frame.setSize(490,600);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}
