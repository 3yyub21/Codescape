import codescape.Dogbot;
import java.utils.Arrays;

public class MyDogbot extends Dogbot
{
   public void run() {
		// Vorgehen, um Array an Terminal übergeben:
		// deinString = Arrays.toString(deinArray); - konvertiert deinArray in den String deinString
		// write(deinString); - übergibt den Arraystring an ein Eingabeterminal

    	// Dein Code hier:
        
        String[] myarray = new String[6];
        int index = -1;
        
        for(int i = 0; i < 28; i++){
            if(i == 2 || i == 5 || i == 8 ){
                index++;
                turnLeft();
                myarray[index] = read();
                turnRight();
            }
            
            else if(i == 10 || i == 14){
                turnRight();
            }
            
            else if(i == 16 || i == 19 || i == 22) {
                index++;
                turnRight();
                myarray[index] = read();
                turnLeft();
            }
            
            else if(i == 24){
                turnRight();
                String password = Arrays.toString(myarray);
                write(password);
                turnLeft();
            }
            
            else{
                move();
            }
        }
    } 
}
