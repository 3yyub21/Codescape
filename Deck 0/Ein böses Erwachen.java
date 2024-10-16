import codescape.Dogbot;

public class MyDogbot extend Dogbot
{
   public void run() 
   {
		// move(), turnLeft() und turnRight() werden benötigt
		// Die Energiezelle ist ohne weitere Kenntnisse noch nicht erreichbar
		// Dein Code hier:
        
        for(int i = 0; i <= 16; i++)
        {
            if(i == 7)
            {
                pickUp();
                
                for(int j = 0; j < 2; j++)
                {
                    turnLeft();
                }
            }
            
            else if(i == 12)
            {
                turnRight();
            }
            
            else
            {
                move();
            }
        }
    }
}
