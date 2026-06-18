/**
 * This is the program comment section, it houses all 
 * information related to the software below. 
 * This program simply displays "hello worldz" to the 
 * screen.
 */

import acm.program.*;
import acm.graphics.*;
import java.awt.Color;

public class CS106A_HelloProgram extends GraphicsProgram
{
	public void run()
	{
		GLabel label = new GLabel("hello, worldz", 100, 75);
		label.setFont("SansSerif-36");
		label.setColor(Color.RED);
		add( label );
	}
}