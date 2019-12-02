import java.util.ArrayList;

public class VoteProcessor {
	String calculateElectionWinner(ArrayList<String> votes) {
		int votesFrancis = 0;
		int votesSnowden = 0;
		for (int i = 0; i < votes.size(); i++) {
			votes.set(i, votes.get(i).toLowerCase());
		}
		for (int i = 0; i < votes.size(); i++) {
			if (votes.get(i).equals("pope francis")) {
				votesFrancis++;
			} else if (votes.get(i).equals("edward snowden")) {
				votesSnowden++;
			}
		}
		if (votesFrancis < votesSnowden) {
			return "edward snowden";
		} else if (votesFrancis > votesSnowden) {
			return "pope francis";
		} else {
			return "TIE";
		}
	}
}
