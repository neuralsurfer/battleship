public class board2
{
    ship2[][] game;
    
    public board2( int inputRow, int inputCol )
    {
        game = new ship2[inputRow][inputCol];        
    }
    
    public void setShip( int startRow, int startCol, int endRow, int endCol )
    {
        for( int i = startRow; i <= endRow; i++ )
        {
            for( int j = startCol; j <= endCol; j++ )
            {
                game[i][j] = new ship2();
            }
        }
    }
    
}