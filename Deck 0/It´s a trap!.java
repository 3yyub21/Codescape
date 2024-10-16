import codescape.Dogbot;

public clacc MyDogbot extends Dogbot
{
    public void run() {
		// Die Energiezelle ist ohne weitere Kenntnisse noch nicht erreichbar
		// Dein Code hier:
        
        for(int i = 0; i <= 8; i++)
        {
            if(i == 3)
            {
                for(int k = 0; k < 2; k++)
                {
                    turnRight();
                }
                
                move();
                turnLeft();
                turnLeft();
                move();
            }
            
            else if(i == 7)
            {
                turnRight();
                move();
                pickUp();
                
                for(int j = 0; j < 2; j++)
                {
                    turnLeft();
                }
                    
                move();
            }
            
            else if(i == 8)
            {
                turnRight();
                move();
            }
            
            else
            {
                move();
            }
        }
    }
}
