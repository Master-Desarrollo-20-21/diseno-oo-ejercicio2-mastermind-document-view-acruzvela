package cruz;

import cruz.views.MastermindView;

/**
 * Hello world!
 *
 */
public class Mastermind 
{

  private void play() {
		new MastermindView().interact();
	}
  
  public static void main(String[] args) {
      new Mastermind().play();
  }
}
