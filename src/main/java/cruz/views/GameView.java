package cruz.views;

import cruz.models.Attempt;
import cruz.models.Game;
import cruz.utils.Console;

public class GameView {
    private Game game;
    private AttemptView attemptView;

    public GameView(){
        this.game=new Game();
        attemptView=new AttemptView(game);
    }

    public void interact() {
        printTitle();
        do {
            printAttempts1();
            this.attemptView.interact();
            printAttempts2();
        }while(haveMoreAttempts());
        finish();
    }
    
    private void printTitle(){
      Message.TITLE.write();
    }

    private void printAttempts1(){
      Message.ATTEMPTS.write(this.game.getAttempts().size());
      Message.SECRET_COMBINATION.write();
    }

    private void printAttempts2() {
        Console console=new Console();
        for(Attempt attempt: this.game.getAttempts()) {
          console.write(attempt.toString());
        }
        console.write("\n");
      }


    public boolean haveMoreAttempts() {
        return !game.lastAttempt().isWinner() && this.game.getAttempts().size() < Game.ATTEMPTS_NUMBER;
    }
  

    private void finish(){
        if(game.lastAttempt().isWinner()) {
          Message.WINNER.write();
        }else {
          Message.LOSER.write("#secretcombination",this.game.getSecretCombination().toString());
        }
    }

}