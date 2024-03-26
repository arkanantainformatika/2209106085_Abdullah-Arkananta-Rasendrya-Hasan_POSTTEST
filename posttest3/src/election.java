// gagal
import java.util.ArrayList;
import java.util.List;

public class election {
        private List<candidate> candidates;

    public election() {
        candidates = new ArrayList<>();
    }

    public void addCandidate(String candidateName) {
        candidate candidate = new candidate(candidateName);
        candidates.add(candidate);
    }

    public void vote(String candidateName) {
        for (candidate candidate : candidates) {
            if (candidate.getName().equals(candidateName)) {
                candidate.vote();
                System.out.println("Vote for " + candidateName + " recorded successfully.");
                return;
            }
        }
        System.out.println("Error: Candidate " + candidateName + " not found.");
    }

    public void displayResults() {
        System.out.println("Election Results:");
        for (candidate candidate : candidates) {
            System.out.println(candidate.getName() + ": " + candidate.getVotes() + " votes");
        }
    }
}
