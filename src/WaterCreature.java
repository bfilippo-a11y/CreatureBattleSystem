public class WaterCreature extends Creature{
    WaterCreature(float health, String name){
        super(health, name);
    }

    @Override
    // Returns the damage done by the Creature
    public float attack(){
        return super.attack(5, 5, 15);
    }

    @Override
    public void defend(float incomingPower){
        super.defend(incomingPower, 80, 0.4f);
    }
}
