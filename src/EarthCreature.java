public class EarthCreature extends Creature{
    EarthCreature(float health, String name){
        super(health, name);
    }
    
    @Override
    // Returns the damage done by the Creature
    public float attack(){
        return super.attack(10, 15, 25);
    }

    @Override
    public void defend(float incomingPower){
        super.defend(incomingPower, 20, 0.6f);
    }
}
