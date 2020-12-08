package cruz;

import cruz.models.Game;
import cruz.views.MastermindView;

/**
 * Hello world!
 *
 */
public class Mastermind 
{
  private void play() {
		new MastermindView(new Game()).interact();
	}
  
  public static void main(String[] args) {
      new Mastermind().play();
  }
}
