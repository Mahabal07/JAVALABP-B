import java.awt.*;
import java.awt.event.*;

public class message extends Frame 
{
 Label l1=new Label("hiiiii hello welcome ");

 message()
 {
  add(l1);
  setSize(300,300);
  setVisible(true);
 
 }
 
 public static void main(String ar[])
 {
  new message();
 }
}
