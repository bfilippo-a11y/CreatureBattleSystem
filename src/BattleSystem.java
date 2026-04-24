import java.util.ArrayList;

public class BattleSystem {

    private void randomPlayers(ArrayList <Creature> creatures){
        for (int i=0; i<1; i++){
            creatures.remove(Rand.randomInt(0, creatures.size()));
        }


    }

    private void battle(ArrayList <Creature> creatures) {
        Creature a = creatures.get(0);
        Creature b = creatures.get(1);
        while (a.getHealth() > 0 && b.getHealth() > 0) {
            float attackPower = a.attack();
            b.defend(attackPower);
            System.out.println(a.readAction());
            System.out.println(b.readAction());

            System.out.println(a);
            System.out.println(b);
            System.out.println();

            // swap turns
            Creature temp = a;
            a = b;
            b = temp;
        }
    }

    public void randomBattle(ArrayList <Creature> creatures) {
        randomPlayers(creatures);
        battle(creatures);
    }
}
