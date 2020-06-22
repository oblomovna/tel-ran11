import java.util.Scanner;

public class Game {
    private int attempts;
    private int secret;

    private GameMessenger gameMessenger;
    private GameNumberReader gameNumberReader;

    public Game(int attempts, int secret, GameMessenger gameMessenger, GameNumberReader gameNumberReader) {
        this.attempts = attempts;
        this.secret = secret;
        this.gameMessenger = gameMessenger;
        this.gameNumberReader = gameNumberReader;
    }

    //static Scanner input = new Scanner(System.in);
    public void play(){
        doGreeting();
       boolean guess = guess();
        showGameOver(guess);
    }
    private void showGameOver(boolean guessedCorrectly){
        if(guessedCorrectly){
            doYouWin();
        }else{
            doYouLose();
        }
    }

    private boolean guess(){
       doGreeting();
        boolean guessedCorrectly = false;
        while(!guessedCorrectly && attempts>0){
            int guessNumber = gameNumberReader.getGuessNumber();
            if(guessNumber==secret){
                guessedCorrectly = true;
               // input.close();
            }else{
                doTryAgain();
                attempts--;
            }
        }
       // doYouLose();
       // input.close();
        return guessedCorrectly;
    }



    private void doGreeting(){
        gameMessenger.print("Welcome to the game! Enter your number");
    }
    private void doYouWin(){
        gameMessenger.print("You won!");
    }
    private void doYouLose(){
        gameMessenger.print("You lose");
    }
    private void doTryAgain(){
        gameMessenger.print("wrong number, try again");
    }

}

