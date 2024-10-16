import codescape.Dogbot;

public class MyDogbot extends Dogbot
{
  public void run() 
    {
		// Stringausgabe: System.out.println(String);
		// Stringvergleich: String1.equals(String2);
		// Die Ausgabe von read() in diesem Raum ist entweder "L" oder "R"

		// Dein Code hier:
		move();
		turnLeft();
		String consoleOutput = read();
		System.out.println("Output: "+consoleOutput);
		turnRight();
        
        if(consoleOutput.equals("L") == true)
        {
            for(int i = 0; i <= 2; i++)
            {
                if(i == 1)
                {
                    turnLeft();
                }
                
                else
                {
                    move();
                }
            }
        }
        
        else
        {
            for(int j = 0; j <= 2; j++)
            {
                if(j == 1)
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
}
