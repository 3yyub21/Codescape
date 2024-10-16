import codescape.Dogbot;

public class MyDogbot extends Dogbot
{
  public void run() 
    {
		// Die Energiezellen sind nur mit sehr effizientem Programmieren sammelbar
		// Dein Code hier:
        
        for(int i = 0; i <= 11; i++)
        {
            
            if(i == 6)
            {
                pickUp();
                turnLeft();
            }
            
            else if(i == 8)
            {
                pickUp();
                
                for(int h = 0; h < 2; h++)
                {
                    turnLeft();
                }
            }
            
            else if(i == 10)
            {
                turnLeft();
            }
            
            else
            {
                move();
            }
        }
    }
}
