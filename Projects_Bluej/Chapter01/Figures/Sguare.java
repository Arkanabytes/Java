import java.awt.*;

/**
 * A square that can be manipulated and that draws itself on a canvas.
 * 
 * @author  Alejandra Pinto
 * @author  Arkanabytes
 * @version 2016.02.29
 */

public class Square
{
    private int size;
    private int xPosition;
    private int yPosition;
    private String color;
    private boolean isVisible;
    
    /**
     * Create a new square at default position with default color.
     */
    public Square()
    {
        size = 60;
        xPosition = 310;
        yPosition = 120;
        color = "red";
        isVisible = false;
    }

    /*Make this square visible. If it was already visible, do nothing.*/
    public void makeVisible()
    {
        isVisible = true;
        draw();
    }
    
