public class Reciever extends Player {
    public int Receptions, ReceptionYards, Rushes, RushingYards, Touchdowns,
               Interceptions, Fumbles, Sacks;

    public Reciever(String name, String position, float weight, int age, int receptions,
                    int receptionYards, int rushes, int rushingYards, int touchdowns, int fumbles) {
        super(name, position, weight, age);
        this.Receptions = receptions;
        this.ReceptionYards = receptionYards;
        this.Rushes = rushes;
        this.RushingYards = rushingYards;
        this.Touchdowns = touchdowns;

        this.Fumbles = fumbles;

    }

    public int getReceptions() {
        return Receptions;
    }

    public void setReceptions(int receptions) {
        Receptions = receptions;
    }

    public int getReceptionYards() {
        return ReceptionYards;
    }

    public void setReceptionYards(int receptionYards) {
        ReceptionYards = receptionYards;
    }

    public int getRushes() {
        return Rushes;
    }

    public void setRushes(int rushes) {
        Rushes = rushes;
    }

    public int getRushingYards() {
        return RushingYards;
    }

    public void setRushingYards(int rushingYards) {
        RushingYards = rushingYards;
    }

    public int getTouchdowns() {
        return Touchdowns;
    }

    public void setTouchdowns(int touchdowns) {
        Touchdowns = touchdowns;
    }

    public int getInterceptions() {
        return Interceptions;
    }

    public void setInterceptions(int interceptions) {
        Interceptions = interceptions;
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
