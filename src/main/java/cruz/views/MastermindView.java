package cruz.views;

import cruz.utils.Console;

public class MastermindView {

    public void interact() {
        do {
            new GameView().interact();
    	}while(this.isResume());
    }

    private boolean isResume() {
        String answer;
        do
          answer = new Console().read(Message.RESUME.getMessage());
        while(!answer.equalsIgnoreCase("Y") && !answer.equalsIgnoreCase("N"));
        return answer.equalsIgnoreCase("Y");
    }



    
}
