import codescape.Dogbot;

public class MyDogbot extends Dogbot
{
  public void run()
  {
    for(int i = 0; i <= 65; i++)
        {
            if(i == 2 || i == 15 || i == 18 || i == 33 || i == 36 || i == 53 || i == 56)
            {
                turnRight();
            }
            
            else if(i == 7 || i == 24 || i == 43 || i == 64)
            {
                pickUp();
            }
            
            else if(i == 9 || i == 26 || i == 45)
            {
                for(int j = 0; j < 2; j++)
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
