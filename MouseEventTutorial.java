import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MouseEventTutorial
{
  private JFrame frame;
  private int xMouse;
  private int yMouse;
  
  public MouseEventTutorial()
  {
      frame = new JFrame();
      frame.setSize( 1, 1000 );
      frame.setVisible(true);
      frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
      xMouse = 0;
      yMouse = 0;
      
    } //end zero-arg constructor
   
    public void go()
    {
        /** Create the frame (window) and adds all the "stuff" into it **/
        
        class MouseActionEvent implements MouseListener, MouseMotionListener
        {
            public MouseActionEvent()
            {
                /** MoustListener is for: Enter, Exited, Pressed, Released, and Clicked */
                frame.addMouseListener(this);
                /** MouseMotionListener is for: Moved and Dragged */
                frame.addMouseMotionListener(this);
            }//end zero-arg constructor
            
            public void mousePressed( MouseEvent e )
            {
             /** Whenever the mouse button is pressed down regardless
              * of it staying down or being released */
              /*# For an example uncomment the System.out.println() below */
                //System.out.println( "Pressed! at ( " + e.getX() + " , " + e.getY() + " )");
                
            } //end mousePressed() method
            
            
            public void mouseReleased( MouseEvent e )
            {
             /** Whenever the mouse button is released up */
              /*# For an example uncomment the System.out.println() below */
                //System.out.println( "Released! at ( " + e.getX() + " , " + e.getY() + " )");
                
            } //end mouseReleased() method

            public void mouseClicked( MouseEvent e )
            {
             /** Whenever the mouse button is both pressed and released */
              /*# For an example uncomment the System.out.println() below */
                //System.out.println( "Clicked at ( " + e.getX() + " , " + e.getY() + " )" );
                //frame.setSize( e.getX(), e.getY() );
            } //end  MouseClicked Method
            
            public void mouseEntered( MouseEvent e )
            {
             /** Whenever the mouse cursor has entered the frame (window) */
              /*# For an example uncomment the System.out.println() below */
                //System.out.println( "Entered! at ( " + e.getX() + " , " + e.getY() + " )" );
                
            } //end  MouseEntered Method
            
            public void mouseExited( MouseEvent e )
            {
             /** Whenever the mouse cursor has exited the frame (window) */
              /*# For an example uncomment the System.out.println() below */
                //System.out.println( "Exited! at ( " + e.getX() + " , " + e.getY() + " )" );
                
            } //end  MouseExited Method
            
            public void mouseMoved( MouseEvent e )
            {
             /** Whenever the mouse is moved (within the frame) */
              /*# For an example uncomment the System.out.println() below */
                //System.out.println( "Moved! at ( " + e.getX() + " , " + e.getY() + " )" );
                
            } //end  MouseMoved Method
            
            public void mouseDragged( MouseEvent e )
            {
             /** Whenever the mouse is held down and moved */
              /*# For an example uncomment the System.out.println() below */
               //System.out.println( "Dragged! at ( " + e.getX() + " , " + e.getY() + " )" );
                
            } //end  MouseDragged Method
        
        } //end inner class
         MouseActionEvent mouse = new MouseActionEvent();
    }  //end go() method
} //end class