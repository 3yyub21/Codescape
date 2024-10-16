import codescape.Dogbot;

public class MyDogbot extends : Dogbot
{
    public void run()
    {
        for(int i = 0; i <= 7; i++)
        {
            if(i == 2)
            {
                turnRight();
                move();
            }
            
            else if(i == 4)
            {
                pickUp();
                turnLeft();
                turnLeft();
                move();
            }
            
            else if(i == 5)
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
