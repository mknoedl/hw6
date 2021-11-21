import java.util.Scanner;

public class Player {
    public String getName() {
        return name;
    }

    private String name;

    public int getCard_number() {
        return card_number;
    }

    private int card_number;
    private boolean user_selected;
    private boolean is_computer;

    public Player(String name, boolean is_computer) {
        this.name = name;
        this.is_computer = is_computer;

    }
    public void start(){
        int round = 1;
        if (is_computer==false){
            while (user_selected==false && round <=5){
                card_number = BetMore_Game.play();
                if(!pick_again()){
                    break;
                };
                round++;
            }

        }else {
            card_number = BetMore_Game.play();
        }
    }

    private boolean pick_again() {
        System.out.println("Number: " +card_number+"\n"+"Pick again? (Yes/No)");
        Scanner scanner = new Scanner(System.in);
        String readString = scanner.nextLine();
        if (readString.equals("Yes")||readString.equals("yes")){
            return true;
        }else {
            return false;
        }
    }

}

