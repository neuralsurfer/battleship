import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
public class image
{
    public static void main( String[] args )
    {
        BufferedImage img = new BufferedImage( 1600, 1600, BufferedImage.TYPE_INT_ARGB );
        Graphics2D panel = img.createGraphics();
        panel.setColor( Color.black );
        panel.fillRect( 0, 0, 1600, 1600); 
    }
}