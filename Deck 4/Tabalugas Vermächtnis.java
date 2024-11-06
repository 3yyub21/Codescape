import codescape.Dogbot;

public class MyDogbot extends Dogbot
{
  public void run() 
  {
	    // Einlesen des Strings und Bewegung des RB zum Beginn des Labyrinths
		move();
		turnLeft();
		/**
		 * gelesen wird ein Wort, das aus den Buchstaben "L", "M" und "R" besteht
		 * getrennt werden die Buchstaben durch ein Komma
		 * die Variable "weg" könnte so aussehen: "M,L,M,M,R,M"
		 */
		String weg = read();
		
		for(int i = 0; i < 2; i++)
		{
		    turnRight();
		}
	
		// Teile die Zeichenkette in ein Array mittels .split(",") auf
		// und programmiere das Ablaufen des korrekten Wegs!
	    // Dein Code hier:
	    
	    String[] myarray = new String[weg.length() -(weg.length() / 2)];
	    
	    for(int i = 0; i < myarray.length; i++)
	    {
	        myarray[i] = weg.split(",")[i];
	    }
	    
	    String word = "";
	    
	    for(int k = 0; k < myarray.length; k++)
	    {
	        word += myarray[k];
	    }
	    
	    char[] array = word.toCharArray();
	    
	    for(int j = 0; j < array.length; j++)
	    {
	        if(array[j] == 'L')
	        {
	            turnLeft();
	        }
	        
	        else if(array[j] == 'R')
	        {
	            turnRight();
	        }
	        
	        else
	        {
	            move();
	        }
	    }
	    
	    for(int i = 0; i < 3; i++)
	    {
	        if(i == 0 || i == 2)
	        {
	            move();
	        }
	        
	        else
	        {
	            turnLeft();
	        }
	    }
  }
}
