//Currently learning how to do this. Will post finished file/files.
import javax.swing.*;
  
//This class has a ''main'' method to launch the frame
public class FirstFrameTest
{
  public static void main(String[] args)
  {
    //Creates a new FirstFrame object
    FirstFrame frame = new FirstFrame();
 
    //Defines what happens when the user closes the frame
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  
    //Displays the frame on the screen
    frame.setVisible(true);
  }
}
