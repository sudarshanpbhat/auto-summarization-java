import javax.swing.JWindow;
import javax.swing.ImageIcon;
import javax.swing.UnsupportedLookAndFeelException;
import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.Image;
import java.awt.Dimension;
import java.io.IOException;

public class Splash extends JWindow
{
private static final long serialVersionUID = -5102127788577685306L;
Image imageForSplashScreen;
ImageIcon ii;

public Splash()
{
	//C:\\Documents and Settings\\SRIKANTH KABADI\\workspace\\demo\\projectsplashscreen.png
 imageForSplashScreen=Toolkit.getDefaultToolkit().getImage("projectsplashscreen.png");

 //Create ImageIcon from Image
 ii=new ImageIcon(imageForSplashScreen);

 //Set JWindow size from image size
 setSize(ii.getIconWidth(),ii.getIconHeight());

 //Get current screen size
 Dimension screenSize=Toolkit.getDefaultToolkit().getScreenSize();

 //Get x coordinate on screen for make JWindow locate at center
 int x=(screenSize.width-getSize().width)/2;

 //Get y coordinate on screen for make JWindow locate at center
 int y=(screenSize.height-getSize().height)/2;

 //Set new location for JWindow
 setLocation(x,y);

 //Make JWindow visible.
 setVisible(true);
}

//Paint image onto JWindow
public void paint(Graphics g)
{
 super.paint(g);
 g.drawImage(imageForSplashScreen,0,0,this);
}

public static void main(String[]args) throws SAXException, IOException, ParserConfigurationException
{
 Splash sd=new Splash();

 try
 {
  Thread.sleep(500);
  sd.dispose();
  
 }
 catch(Exception exception)
 {
  exception.printStackTrace();
 }
 java.awt.EventQueue.invokeLater(new Runnable() {
     public void run() {
         try {
				new SampleUi(1);
			} catch (SAXException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} catch (ParserConfigurationException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InstantiationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (UnsupportedLookAndFeelException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
     }
 });
}
}
