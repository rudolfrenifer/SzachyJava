
public class objBishop extends objChessPieces
{
	
	public void objBishop ()
	{
	}
	
	public boolean legalMove (int startRow, int startColumn, int desRow, int desColumn, int[][] playerMatrix)
	{
		
		if (startRow == desRow || startColumn == desColumn) 
		{
			
			strErrorMsg = "Goniec może poruszać się jedynie na skos";
			return false;
			
		}
		
		return axisMove(startRow, startColumn, desRow, desColumn, playerMatrix, false);
		
	}
	
}
