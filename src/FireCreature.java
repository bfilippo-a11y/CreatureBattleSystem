public class FireCreature extends Creature{
    FireCreature(float health, String name){
        super(health, name);
    }

    @Override
    // Returns the damage done by the Creature
    public float attack(){
        return super.attack(30, 20, 40);
    }

    @Override
    public void defend(float incomingPower){
        super.defend(incomingPower, 8, 0.8f);
    }
}