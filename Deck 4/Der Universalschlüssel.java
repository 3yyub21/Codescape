import codescape.Dogbot;

public class MyDogbot extends Dogbot
{
   public void run(String[] keys) 
    {
		// Dein Code hier:
        
        for(int i = 0; i < 23; i++)
        {
            if(i == 3)
            {
                turnLeft();
                write(keys[0]);
                turnRight();
            }
            
            else if(i == 6)
            {
                turnLeft();
                write(keys[1]);
                turnRight();
            }
            
            else if(i == 9)
            {
                turnRight();
            }
            
            else if(i == 13)
            {
                turnRight();
            }
            
            else if(i == 15)
            {
                turnRight();
                write(keys[2]);
                turnLeft();
            }
            
            else if(i == 18)
            {
                turnRight();
                write(keys[3]);
                turnLeft();
            }
            
            else
            {
                move();
            }
        }
    }
}
