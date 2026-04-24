public class Creature {
    private float health;
    private String name;
    private String action;

    Creature(float health, String name){
        this.health = health;
        this.name = name;
    }

    // Returns the damage done by the Creature
    public float attack() {

        // 20% chance of missing
        if (Rand.randomInt(0, 10) < 2) {
            missedAttac();
            return 0;
        }

        // otherwise, do damage between 10-20
        float power = Rand.randomFloat(10, 20);
        effectiveAttac(power);
        return power;
    }

    public float attack(int chanceMissedAttac,int minDamage, int maxDamage) {

        if (Rand.randomInt(0, 100)  < chanceMissedAttac) {
            // 30% chance of missing
            missedAttac();
            return 0;
        }

        // otherwise, do damage between minDamage and maxDamage
        float power = Rand.randomFloat(minDamage, maxDamage);
        effectiveAttac(power);
        return power;
    }

    public void defend(float incomingPower) {

        // 10 % chance of reducing damage taken
        if (Rand.randomInt(0, 10) < 1) {
            incomingPower = incomingPower * 0.8f;
            effectiveDefence(incomingPower);
        }
        else
        {
            missedDefence();
        }

        lessPV(incomingPower);
    }

    public void defend(float incomingPower, int chanceReduceDamage, float damageReduced) {
        // 8 % chance of reducing damage taken
        if (Rand.randomInt(0, 100) < chanceReduceDamage) {
            incomingPower = incomingPower * damageReduced;
            effectiveDefence(incomingPower);
        } else {
            missedDefence();
        }

        lessPV(incomingPower);
    }

    public String readAction() {
        return action;
    }

    public void missedAttac(){
        action = name + " missed!";
    }

    public void missedDefence(){
        action = name + " did not defend.";
    }

    public void effectiveDefence(float incomingPower){
        action = name + " defended and reduced damage taken to " + incomingPower;
    }

    public void effectiveAttac(float power){
        action = name + " attacked with power " + power + "!";
    }

    public void lessPV(float pv){
        health -= pv;
    }

    public float getHealth(){
        return health;
    }

    @Override
    public String toString() {
        return getClass() + "{name: " + name + ", health: " + health + "}";
    }
}
