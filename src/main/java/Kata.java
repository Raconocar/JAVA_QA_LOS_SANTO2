public class Kata {

    public static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) {
        String winner = null;
        while (winner == null) {
            if (fighter1.name.equals(firstAttacker)) {
                //attack
                fighter2.health = fighter2.health - fighter1.damagePerAttack;//first kick
                if (fighter2.health <= 0) {
                    winner = fighter1.name;
                    break;
                } //check

                fighter1.health = fighter1.health - fighter2.damagePerAttack;//second kick
                if (fighter1.health <= 0) winner = fighter2.name;  //check

            } else {
                //attack
                fighter1.health = fighter1.health - fighter2.damagePerAttack;//first kick
                if (fighter1.health <= 0) {
                    winner = fighter2.name;
                    break;
                }  //check

                fighter2.health = fighter2.health - fighter1.damagePerAttack;//second kick
                if (fighter2.health <= 0) winner = fighter1.name;  //check
            }

        }
        return winner;// Your code goes here. Have fun!

    }

}
