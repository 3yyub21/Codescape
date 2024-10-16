import codescape.Dogbot:

public class MyDogbot extends Dogbot
{
   public void run() 
  {
		// Erstellen eines Strings mit dem Passwort mittels:
		// String password = read();
		// Eingabe des Passworts mittels:
		// write(password);

		// Dein Code hier:	
        
        String passwort = "";
        
        for(int i = 0; i < 7; i++)
        {
            if(i == 2)
            {
                turnLeft();
                passwort = read();
                turnRight();
            }
            
            else if(i == 4)
            {
                turnLeft();
                write(passwort);
                turnRight();
            }
            
            else
            {
                move();
            }
        }
    }
}
