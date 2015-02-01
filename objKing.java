public class objKing extends objChessPieces
{
	
	public void objKing ()
	{
	}
	
	public boolean legalMove (int startRow, int startColumn, int desRow, int desColumn, int[][] playerMatrix)
	{
		
		finalDesRow = desRow;
		finalDesColumn = desColumn;
		
		if (desRow == (startRow + 1) && desColumn == startColumn) 
		{
			return true;
		}
		else if (desRow == (startRow + 1) && desColumn == (startColumn - 1)) 
		{
			return true;
		}
		else if (desRow == startRow && desColumn == startColumn - 1) 
		{
			return true;
		}
		else if (desRow == (startRow - 1) && desColumn == (startColumn - 1))
		{
			return true;
		}
		else if (desRow == (startRow - 1) && desColumn == startColumn)
		{
			return true;
		}
		else if (desRow == (startRow - 1) && desColumn == (startColumn + 1)) 
		{
			return true;
		}
		else if (desRow == startRow && desColumn == (startColumn + 1)) 
		{
			return true;
		}
		else if (desRow == (startRow + 1) && desColumn == (startColumn + 1)) 
		{
			return true;
		}
		else
		{
			
			strErrorMsg = "Krol moze poruszac sie o jedno pole w kazdym kierunku";
			return false;
			
		}
		
	}
	
}
