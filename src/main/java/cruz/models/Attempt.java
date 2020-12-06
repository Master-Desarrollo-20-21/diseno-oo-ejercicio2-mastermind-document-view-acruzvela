package cruz.models;

public class Attempt {
    private ProposedCombination proposedCombination;
	private Result result;

	public Attempt(ProposedCombination proposedCombination, Result result) {
		this.proposedCombination = proposedCombination;
		this.result = result;
	}

	public boolean isWinner() {
		if (this.result.getBlacks() == 4) {
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return this.proposedCombination.toString()+" ---> "+ this.result.getBlacks()+" blacks - "+this.result.getWhites()+" whites.";
	}
}
