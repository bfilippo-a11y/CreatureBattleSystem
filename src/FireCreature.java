public class FireCreature extends Creature{
    FireCreature(float health, String name){
        super(health, name);
    }

    @Override
    // Returns the damage done by the Creature
    public float attack() {

        if (Rand.randomInt(0, 100)  < 30) {
            // 30% chance of missing
            action = name + " missed!";
            return 0;
        }

        // otherwise, do damage between 20-30
        float power = Rand.randomFloat(20, 40);
        action = name + " attacked with power " + power + "!";
        return power;
    }

    @Override
    public void defend(float incomingPower) {

        // 8 % chance of reducing damage taken
        if (Rand.randomInt(0, 100) < 8) {
            incomingPower = incomingPower * 0.8f;
            action = name + " defended and reduced damage taken to " + incomingPower;
        } else {
            action = name + " did not defend.";
        }

        health -= incomingPower;
    }
}
