package cruz.views;

import cruz.models.Game;
import cruz.utils.Console;

public class MastermindView {
    private Game game;

    public MastermindView(Game game){
        this.game=game;
    }

    public void interact() {
        do {
            new GameView(game).interact();
    	}while(this.isResume());
    }

    private boolean isResume() {
        String answer;
        do
          answer = new Console().read(Message.RESUME.getMessage());
        while(!answer.equalsIgnoreCase("Y") && !answer.equalsIgnoreCase("N"));
        if (answer.equalsIgnoreCase("Y")){
            this.game.reset();
        }
        return answer.equalsIgnoreCase("Y");
    }
}
