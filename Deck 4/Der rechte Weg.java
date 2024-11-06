import codescape.Dogbot;

public class MyDogbot extends Dogbot
{
  public void run(int nr) 
    {
		// Dein Code hier:
        
        if(nr == 1)
        {
            for(int i = 0; i <= 16; i++)
            {
                if(i == 2 || i == 9)
                {
                    turnLeft();
                }
                
                else if(i == 6 || i == 12 || i == 13)
                {
                    turnRight();
                }
                
                else if(i == 15)
                {
                    pickUp();
                }
                
                else
                {
                    move();
                }
            }
        }
        
        else if(nr == 2)
        {
            for(int i = 0; i <= 14; i++)
            {
                if(i == 2)
                {
                    turnLeft();
                }
                
                else if(i == 6 || i == 9)
                {
                    turnRight();
                }
                
                else if(i == 13)
                {
                    pickUp();
                }
                
                else
                {
                    move();
                }
            }
        }
        
        else if(nr == 3)
        {
            for(int i = 0; i <= 16; i++)
            {
                if(i == 6 || i == 9)
                {
                    turnLeft();
                }
                
                else if(i == 2 || i == 12 || i == 13)
                {
                    turnRight();
                }
                
                else if(i == 15)
                {
                    pickUp();
                }
                
                else
                {
                    move();
                }
            }
        }
        
        else
        {
            for(int i = 0; i <= 14; i++)
            {
                if(i == 6)
                {
                    turnLeft();
                }
                
                else if(i == 2 || i == 9)
                {
                    turnRight();
                }
                
                else if(i == 13)
                {
                    pickUp();
                }
                
                else
                {
                    move();
                }
            }
        }
    }
}
