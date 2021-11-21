

public class Game_Chair {

    public static void run()
    {
        Player computer = new Player("Computer", true);
        Player player2 = new Player("Player_2", false);

        computer.start();
        player2.start();
        System.out.println(BetMore_Game.findWinner(computer,player2)+" won.");
        System.out.println("Computer: "+ computer.getCard_number());
        System.out.println("Player_2: "+ player2.getCard_number());
    }
}
