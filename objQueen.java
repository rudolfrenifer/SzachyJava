public class objQueen extends objChessPieces
{
	
	public void objQueen ()
	{
	}
	
	public boolean legalMove (int startRow, int startColumn, int desRow, int desColumn, int[][] playerMatrix)
	{
		
		boolean axis = true;
		
		if (startRow == desRow ^ startColumn == desColumn) 
		{
			axis = true;
		}
		else if (startRow != desRow && startColumn != desColumn)
		{
			axis = false;
		}
		else
		{
			
			strErrorMsg = "Królowa może poruszać się w prostej linii w kazdym kierunku";
			return false;
			
		}
		
		return axisMove(startRow, startColumn, desRow, desColumn, playerMatrix, axis);
		
	}
	
}
