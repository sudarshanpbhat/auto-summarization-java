import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;

public class FullScreen extends JFrame {
	private static final long serialVersionUID = 1L;

	FullScreen() {
        this.setLocation(0, 0);

        // Get screensize, set as window-size
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        this.setSize(screenSize);
        this.setVisible(true);
    }
}