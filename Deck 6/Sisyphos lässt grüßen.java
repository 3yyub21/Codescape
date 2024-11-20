import codescape.Dogbot;

public class MyDogbot extends Dogbot{
    public void run() {
    	// Dein Code hier:
        
        String password = "";
        
        for(int i = 0; i < 75; i++){
            switch(i){
                case 3,8,10,15,20,25,27,47,49,63,65,73 -> turnRight();
                case 5,12,22,29,44,51,60,67 -> {
                    while(isMovePossible() == false){
                        rest();
                    }
                }
                case 9,26,48,64 -> password += read();
                case 38,42,54,58,70 -> turnLeft();
                case 72 -> write(password);
                default -> move();
            }
        }
    }
}
