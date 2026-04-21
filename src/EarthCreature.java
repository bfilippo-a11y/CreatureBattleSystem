public class EarthCreature extends Creature{
    EarthCreature(float health, String name){
        super(health, name);
    }
    @Override
    // Returns the damage done by the Creature
    public float attack() {

        if (Rand.randomInt(0, 100)  < 10) {
            // 10% chance of missing
            action = name + " missed!";
            return 0;
        }

        // otherwise, do damage between 5-15
        float power = Rand.randomFloat(15, 25);
        action = name + " attacked with power " + power + "!";
        return power;
    }

    @Override
    public void defend(float incomingPower) {

        // 20 % chance of reducing damage taken
        if (Rand.randomInt(0, 100) < 20) {
            incomingPower = incomingPower * 0.6f;
            action = name + " defended and reduced damage taken to " + incomingPower;
        } else {
            action = name + " did not defend.";
        }

        health -= incomingPower;
    }
}
