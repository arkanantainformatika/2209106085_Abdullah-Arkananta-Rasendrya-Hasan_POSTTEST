// gagal
public class candidate {
    private String name;
    private int votes;

    public candidate(String name) {
        this.name = name;
        this.votes = 0;
    }

    public String getName() {
        return name;
    }

    public void vote() {
        votes++;
    }

    public int getVotes() {
        return votes;
    }
}

