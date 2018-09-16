/*
Written by Christopher Pucko
EECS LDS Project 0

This is the Defense Class. It extends the player class to include defense-specific stats.
 */

public class Defense extends Player{
    public int Tackles, Intercepts;
    public float Sacks;

    public Defense(String name, String position, float weight, int age, float Sacks,
                   int Tackles, int Intercepts) {
        super(name, position, weight, age);
        this.Tackles = Tackles;
        this.Intercepts = Intercepts;
        this.Sacks = Sacks;

    }

    public int getTackles() {
        return Tackles;
    }

    public void setTackles(int tackles) {
        Tackles = tackles;
    }

    public int getIntercepts() {
        return Intercepts;
    }

    public void setIntercepts(int intercepts) {
        Intercepts = intercepts;
    }

    public float getSacks() {
        return Sacks;
    }

    public void setSacks(float sacks) {
        Sacks = sacks;
    }
}
