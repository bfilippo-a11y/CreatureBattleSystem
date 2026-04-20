public class Main {
    public static void main(String[] args) {

        // set up the creatures
        FireCreature fireCreature = new FireCreature(150, "Fire Creature");
        WaterCreature waterCreature = new WaterCreature(200, "Water Creature");
        EarthCreature earthCreature = new EarthCreature(100, "Earth Creature");

        // set up the battle
        BattleSystem battleSystem = new BattleSystem();

        // run the battle
        battleSystem.battle(fireCreature, waterCreature);
    }
}
