public class Quarterback extends Player {
    public int PassAttempt, PassComplete,PassYards, RushAttempt, RushYards, Touchdowns,
                Intercepts, Fumbles, Sacks;
    public Quarterback(String name, String position, float weight, int age,
                       int PassAttempt, int PassComplete, int PassYards,
                       int RushAttempt, int RushYards, int Touchdowns, int Intercepts,
                       int Fumbles, int Sacks) {
        super(name, position, weight, age);
        this.PassAttempt = PassAttempt;
        this.PassComplete = PassComplete;
        this.PassYards = PassYards;
        this.RushAttempt = RushAttempt;
        this.RushYards = RushYards;
        this.Touchdowns = Touchdowns;
        this.Intercepts = Intercepts;
        this.Fumbles = Fumbles;
        this.Sacks = Sacks;
    }

    public int getPassAttempt() {
        return PassAttempt;
    }

    public void setPassAttempt(int passAttempt) {
        PassAttempt = passAttempt;
    }

    public int getPassComplete() {
        return PassComplete;
    }

    public void setPassComplete(int passComplete) {
        PassComplete = passComplete;
    }

    public int getPassYards() {
        return PassYards;
    }

    public void setPassYards(int passYards) {
        PassYards = passYards;
    }

    public int getRushAttempt() {
        return RushAttempt;
    }

    public void setRushAttempt(int rushAttempt) {
        RushAttempt = rushAttempt;
    }

    public int getRushYards() {
        return RushYards;
    }

    public void setRushYards(int rushYards) {
        RushYards = rushYards;
    }

    public int getTouchdowns() {
        return Touchdowns;
    }

    public void setTouchdowns(int touchdowns) {
        Touchdowns = touchdowns;
    }

    public int getIntercepts() {
        return Intercepts;
    }

    public void setIntercepts(int intercepts) {
        Intercepts = intercepts;
    }

    public int getFumbles() {
        return Fumbles;
    }

    public void setFumbles(int fumbles) {
        Fumbles = fumbles;
    }

    public int getSacks() {
        return Sacks;
    }

    public void setSacks(int sacks) {
        Sacks = sacks;
    }
}
