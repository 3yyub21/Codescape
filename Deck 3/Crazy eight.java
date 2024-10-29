import codescape.Dogbot;

public class MyDogbot extends Dogbot
{
  public void run()
  {
    for(int i = 1; i <= 31; i++)
    {
        if(i == 4 || i == 29)
        {
             turnLeft();
        }
            
        else if(i == 12 || i == 17 || i == 21)
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
