import codescape.Dogbot;

public class MyDogbot extends Dogbot
{
  public void run() 
    {
		/** 
		* Nutze die Funktion einString.toCharArray() um aus der Zeichenkette(String) einString ein Array von Zeichen(Chars) zu erstellen
		*
		* String string = new String(charArray) 
		* macht aus dem Array aus Chars wieder einen String
		*/ 
		//Dein Code hier:
        
        String passwort1 = "";
        
        for(int i = 0; i < 8; i++)
        {
            if(i == 1 || i == 6)
            {
                turnLeft();
            }
            
            else if(i == 3)
            {
                turnRight();
            }
            
            else if(i == 7)
            {
                passwort1 = read();
            }
            
            else
            {
                move();
            }
        }
        
        String passwort2 = "";
        
        for(int k = passwort1.length() - 1; k >= 0; k--)
        {
            passwort2 += passwort1.charAt(k);
        }
        
        for(int j = 0; j < 15; j++)
        {
            if(j == 0 || j == 11)
            {
                if(j == 0)
                {
                    for(int h = 0; h < 2; h++)
                    {
                        turnRight();
                    }
                }
                
                else
                {
                    turnRight();
                }
            }
            
            else if(j == 3 || j == 6 || j == 9)
            {
                turnLeft();
            }
            
            else if(j == 7)
            {
                write(passwort2);
                turnRight();
            }
            
            else
            {
                move();
            }
        }
    }
}
