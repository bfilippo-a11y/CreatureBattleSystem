public class WaterCreature extends Creature{
    WaterCreature(float health, String name){
        super(health, name);
    }

    @Override
    // Returns the damage done by the Creature
    public float attack() {

        if (Rand.randomInt(0, 100)  < 5) {
            // 5% chance of missing
            action = name + " missed!";
            return 0;
        }

        // otherwise, do damage between 5-15
        float power = Rand.randomFloat(5, 15);
        action = name + " attacked with power " + power + "!";
        return power;
    }

    @Override
    public void defend(float incomingPower) {

        // 80 % chance of reducing damage taken
        if (Rand.randomInt(0, 100) < 80) {
            incomingPower = incomingPower * 0.4f;
            action = name + " defended and reduced damage taken to " + incomingPower;
        } else {
            action = name + " did not defend.";
        }

        health -= incomingPower;
    }
}
