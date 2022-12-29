import java.awt.Color;
import java.awt.Graphics;
// Labels
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.JLabel;


public class DrawSmiley2 extends JPanel
{
    private JLabel label1;

    public void paintComponent (Graphics g)
    {

        super.paintComponent(g);

        g.setColor(Color.YELLOW);
        g.fillOval(10,10,200,200);
        // Eye
        g.setColor(Color.BLACK); 
        g.fillOval(55, 65, 30, 30); 
        g.fillOval(135, 65, 30, 30);

        // Mouth
        g.fillOval(50, 110, 120, 60);



        g.setColor(Color.YELLOW); 
        g.fillRect(50, 110, 120, 30);
        g.fillOval(50, 120, 120, 40);
        // nose
        //g.setColor(Color.BLACK); 
        //g.fillRect(100, 110, 10, 10);
        //g.fillOval(100, 110, 15, 15);
    }

    public DrawSmiley2()
    {
        
        label1 = new JLabel( "This is a Smiley" );
        label1.setToolTipText( "This is label1" );
        label1.setHorizontalTextPosition( SwingConstants.CENTER );
        label1.setVerticalTextPosition( SwingConstants.BOTTOM );
        add( label1 );
    }

}
    




    

