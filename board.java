
public class board{
    
    tile[][] game;
    
    
    public board( int rL, int cL){
        
        game = new tile[rL][cL];
        
        
    }
    public int tLen(){
        return game.length;
        
    }
    public int t0Len(){
        
        return game[0].length;
    }
    public void setGame(int r, int c, tile t){
        
        
        game[r][c] = t;
        
    }
    public boolean exists(int r, int c){
        
        return r < game.length && r > -1 && c < game[0].length && c > -1;
        
        
    } // Checks to see if the given row and collum are within bounds
    public boolean isValid(int tR, int tC, int bR, int bC, int l){
        int count = 0;
        boolean run = false;
        for(int r = bR; r < tR +1; r++){
            for(int c = bC; c < tC +1;c++){
                run = true;
                if(!exists(r,c))return false;
                
                if(game[r][c].isShip()) return false;
                
                count++;
                
            }
            
            
            
            
        }
        
        return run && (tR - bR == 1 || tC-bC == 1) && count <= l;
    }// Checks to see if the inputed ship object is a valid ship object
    
    
    
    
    
    
}
    