import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // set up the creatures
        FireCreature fireCreature = new FireCreature(150, "Fire Creature");
        WaterCreature waterCreature = new WaterCreature(200, "Water Creature");
        EarthCreature earthCreature = new EarthCreature(175, "Earth Creature");

        ArrayList<Creature> creatures = new ArrayList<>();
        creatures.add(fireCreature);
        creatures.add(waterCreature);
        creatures.add(earthCreature);


        // set up the battle
        BattleSystem battleOne = new BattleSystem();

        // run the battle
        battleOne.randomBattle(creatures);
    }
}
