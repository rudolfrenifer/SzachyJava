import java.awt.*;
import java.util.Vector;

public class objChessBoard extends Canvas
{
	
	protected objPaintInstruction currentInstruction = null;
	protected Vector vecPaintInstructions = new Vector();
	
	public void chessBoard ()
	{
	}
	
	public void update (Graphics g)
	{
		paint(g);
	}
	
	public void paint (Graphics g)
	{
		
		if (vecPaintInstructions.size() == 0)
		{
			
			g.setColor(new Color(75,141,221)); 
			g.fillRect(0,0,500,50); 
			g.fillRect(0,0,50,500); 
			g.fillRect(0,450,500,50);
			g.fillRect(450,0,50,500); 

			currentInstruction = new objPaintInstruction(0,0,8);
			vecPaintInstructions.addElement(currentInstruction);
			
		}
		
		g.setColor(new Color(75,141,221));
		g.fillRect(50,450,450,50); 
		
		for (int i = 0; i < vecPaintInstructions.size(); i++)
		{
			
			currentInstruction = (objPaintInstruction)vecPaintInstructions.elementAt(i);
			int startRow = currentInstruction.getStartRow();
			int startColumn = currentInstruction.getStartColumn();
			int rowCells = currentInstruction.getRowCells();
			int columnCells = currentInstruction.getColumnCells();
			
			for (int row = startRow; row < (startRow + rowCells); row++)
			{
				
				for (int column = startColumn; column < (startColumn + columnCells); column++)
				{
					drawTile(row, column, g);
				}
				
			}
			
		}
		
		drawExtra(g);
		
	}
	
	private void drawTile (int row, int column, Graphics g)
	{
		
		if ((row + 1) % 2 == 0)
		{
			
			if ((column + 1) % 2 == 0)
			{
				g.setColor(new Color(255,255,255)); 
			}
			else
			{
				g.setColor(new Color(0,0,0)); 
			}
			
		}
		else
		{
			
			if ((column + 1) % 2 == 0)
			{
				g.setColor(new Color(0,0,0));
			}
			else
			{
				g.setColor(new Color(255,255,255));
			}
			
		}
		
		g.fillRect((50 + (column * 50)), (50 + (row * 50)), 50, 50);
		
	}	
	protected void drawExtra (Graphics g)
	{
	}
	
	protected int findWhichTileSelected (int coor) 
	{
		
		for (int i = 0; i < 8; i++)
		{
			
			if ((coor >= (50 + (i * 50))) && (coor <= (100 + (i * 50))))
			{
				return i;
			}
			
		}
		
		return -1;
		
	}
	
}
