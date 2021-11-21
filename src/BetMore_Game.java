public class BetMore_Game {

    public int card_number;


    public static int play () {
        return Shuffle.pick_card();
    }

    public static String findWinner(Player player1, Player player2){
        if (player1.getCard_number()>player2.getCard_number()){
            return player1.getName();
        }else {
            return player2.getName();
        }
    }
}
