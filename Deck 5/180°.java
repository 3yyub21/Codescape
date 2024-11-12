import codescape.Dogbot;

public class MyDogbot extends Dogbot
{
   public void run()
  {
      move();
      for(int i = 0; i < 3; i++)
      {
          turnleft();
          move();
          pickUp();
          turnOver();
          move();
      }
      turnLeft();
      for(int i = 0; i < 2; i++)
      {
          move();
      }
  } 

  public void turnOver()
  {
        for(int i = 0; i < 2; i++)
        {
            turnLeft();
        }
  }
}
