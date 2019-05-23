


public class ship {
    
    
    int topRow;
    int topCol;
    int bottomCol;
    int bottomRow;
    int len;
    boolean hit = false;
    
    public ship(int r, int c, int bC, int bR, int l){
        topRow = r;
       
        topCol = c;
        
        bottomCol = bC;
        
        bottomRow = bR;
        
        len = l;
        
        
    }
    
    public void isHit()
    {
        hit = true;
    }
    
    
}