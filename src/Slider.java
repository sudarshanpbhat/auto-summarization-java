import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;

public class Slider{
  JSlider slider;
  JLabel label;
  public Slider(){
    JFrame frame = new JFrame("Slider Frame");
    slider = new JSlider();
    slider.setValue(50);
    slider.addChangeListener(new MyChangeAction());
    label = new JLabel("50%");
    JPanel panel = new JPanel();
    panel.add(slider);
    panel.add(label);
    frame.add(panel, BorderLayout.CENTER);
    frame.setSize(400, 400);
    frame.setVisible(true);
    //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setAlwaysOnTop(true);
    frame.setFocusable(true);
  }

  public class MyChangeAction implements ChangeListener{
    public void stateChanged(ChangeEvent ce){
      int value = slider.getValue();
      String str = Integer.toString(value);
      label.setText(str+"%");
    }
  }
}