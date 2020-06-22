public class CorrectNumberGameFinalMessenger implements GameMessenger {
    private boolean isCorrect;


    @Override
    public void print(String s) {
        System.out.println(s);
        isCorrect = s.equals("You won!");
    }
    public boolean isCorrect(){
        return isCorrect;
    }
}
