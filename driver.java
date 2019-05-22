
public class driver{
    
    public static void main(String args[]){
        
        board start = new board(10,9);
        int len = start.tLen();
        int cLen = start.t0Len(); // references to the board length
        
        for(int r = 0; r < len; r++){
            for(int c = 0; c < cLen; c++){
                
                
                start.setGame(r,c, new tile(false, r, c)); 
                
                
            }
            
            
        }//Populate the game tile array with default tile objects
        
        
        MouseEventTutorial gui = new MouseEventTutorial();
        gui.go();
        
        
        
    }//driver
    
    
    
    
    
    
    
}