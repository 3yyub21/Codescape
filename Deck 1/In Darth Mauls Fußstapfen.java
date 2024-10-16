import codescape.Dogbot;

public class MyDogbot extends Dogbeot
{
  public void run() 
  {
		// Hier sollte eine WHILE-Schleife verwendet werden
		// Die Karte ändert sich nur, wenn der Hund eine Aktion 
		// durchführt. isMovePossible() reicht nicht aus!
		// Dein Code hier:
        
        while(true)
        {
            rest();
            
            if(isMovePossible())
            {
                move();
            }
        }
    }
}
