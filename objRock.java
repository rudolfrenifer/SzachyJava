public class objRock extends objChessPieces
{
	
	public void objRock ()
	{
	}
	
	public boolean legalMove (int startRow, int startColumn, int desRow, int desColumn, int[][] playerMatrix)
	{
		
		if (startRow != desRow && startColumn != desColumn) 
		{
			
			strErrorMsg = "Wieza moze poruszac sie tylko pionowo albo poziomo";
			return false;
			
		}

		return axisMove(startRow, startColumn, desRow, desColumn, playerMatrix, true);
		
	}
	
}
