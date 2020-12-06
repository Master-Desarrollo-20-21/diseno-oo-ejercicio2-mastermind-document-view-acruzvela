package cruz.views;

import cruz.utils.Console;

public enum Message {
    TITLE("----- MASTERMIND -----"),
    RESUME("¿Do you want to play another game y/n?"),
    ATTEMPTS("#attempts attemp(s):"),
    WINNER("You win :-)!!\n"),
    LOSER("You have exceeded the number of attempts :-(\nSecret combination: #secretcombination\n"),
    ALLOWED_COLORS("Allowed colors: #allowedcolors"),
    PROPOSED_COMBINATION("Propose a combination: "),
    SECRET_COMBINATION("XXXX");

    private String message="";
    private Console console=new Console();
	
	private Message(String message) {
		this.message = message;
    }
    
    public String getMessage(){
        return this.message;
    }

	public void write() {
		console.write(this.message);
	}

	public void write(int attempts) {
        assert this == Message.ATTEMPTS;
		console.write(this.message.replaceAll("#attempts", "" + attempts));
    }
    
    public void write(String key,String value) {
        assert this == Message.LOSER || this==Message.ALLOWED_COLORS;
		console.write(this.message.replaceAll(key, "" + value));
	}

}