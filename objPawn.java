public class objPawn extends objChessPieces
{
	
	public void objPawn ()
	{
	}
	
	public boolean legalMove (int startRow, int startColumn, int desRow, int desColumn, int[][] playerMatrix, int currentPlayer)
	{
		
		boolean legalMove = true;
		int[] playerPawnStart = {6,1};
		
		if ((currentPlayer == 1 && desRow >= startRow) || (currentPlayer == 2 && desRow <= startRow)) //If moving in wrong direction
		{
			
			strErrorMsg = "Nie można ruszyć się w tym kierunku";
			legalMove = false;
			
		}
		else if (desColumn != startColumn) //If moving sideways
		{
			
			if ((desColumn > startColumn && desColumn == (startColumn + 1)) || (desColumn < startColumn && desColumn == (startColumn - 1))) //If only moving one place side ways
			{
				
				if ((desRow == (startRow + 1) && currentPlayer == 2) || (desRow == (startRow - 1) && currentPlayer == 1))
				{					
				
					if (playerMatrix[desRow][desColumn] == 0) 
					{
						
						strErrorMsg = "Jeśli pionek zbija przeciwnika, może poruszać się tylko na skos";
						legalMove = false;
						
					}
					
				}
				else
				{
					
					strErrorMsg = "Nie można poruszayć się tak daleko";
					legalMove = false;
					
				}
				
			}
			else
			{
				
				strErrorMsg = "Nie można poruszayć się tak daleko";
				legalMove = false;
				
			}
			
		}
		else if ((currentPlayer == 1 && desRow < (startRow - 1)) || (currentPlayer == 2 && desRow > (startRow + 1))) //If moved two or more places
		{
			
			if ((currentPlayer == 1 && desRow == (startRow - 2)) || (currentPlayer == 2 && desRow == (startRow + 2))) 
			{
				
				if (playerPawnStart[currentPlayer - 1] != startRow)
				{
			
				strErrorMsg = "Nie można poruszayć się tak daleko";
				legalMove = false;
			
				}
				
			}
			else
			{
				
				strErrorMsg = "Nie można poruszayć się tak daleko";				
				legalMove = false;
				
			}
			
		}		
		
		if (legalMove)
		{

			finalDesRow = desRow;
			finalDesColumn = desColumn;
			
		}
		
		return legalMove;
		
	}
	
}
