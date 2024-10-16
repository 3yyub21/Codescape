import codescape.Dogbot;

public class MyDogbot extends Dogbot
{
   public void run() 
    {
		// move(), turnLeft() und turnRight() werden benötigt
		// Die Energiezellen sind ohne weitere Kenntnisse noch nicht erreichbar
		// Dein Code hier:
        
        for(int i = 0; i <= 20; i++)
        {
            if(i == 1)
            {
                turnLeft();
                move();
                pickUp();
                
                for(int h = 0; h < 2; h++)
                {
                    turnLeft();
                }
            }
            
            else if(i == 4 || i == 7)
            {
                turnLeft();
            }
            
            else if(i == 10 || i == 13 || i == 18)
            {
                turnRight();
            }
            
            else if(i == 16)
            {
                pickUp();
                
                for(int k = 0; k < 2; k++)
                {
                    turnLeft();
                }
            }
            
            else
            {
                move();
            }
        }
    }
}
