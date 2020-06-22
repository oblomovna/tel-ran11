import org.junit.Assert;
import org.junit.Test;

public class GameTest {

    @Test
    public void testGame1(){
        //1.specify test input
        CorrectNumberGameFinalMessenger gm = new CorrectNumberGameFinalMessenger();
        CorrectConsole gr = new CorrectConsole();//reader
        int attempts = 2;
        int secret =3;
        //2.run test method
        Game g = new Game(2,3,gm,gr);
        g.play();
        //3.check the output
        Assert.assertTrue(gm.isCorrect());
    }
    @Test
    public void testGame2() {
        //1.specify test input
        CorrectNumberGameFinalMessenger gm = new CorrectNumberGameFinalMessenger();
        CorrectConsole gr = new CorrectConsole();//reader
        int attempts = 2;
        int secret = 2;
        //2.run test method
        Game g = new Game(2, 3, gm, gr);
        g.play();
        //3.check the output
        Assert.assertFalse(gm.isCorrect());
    }
}
