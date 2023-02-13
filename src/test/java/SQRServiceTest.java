import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.sqr.NumberOfSquares.services.SQRService;

public class SQRServiceTest {

    @Test

    public void calcNumberSquares() {
        SQRService service = new SQRService();

        int expected = 3;
        int actual = service.calcNumberSquares(300, 200);

        Assertions.assertEquals(expected, actual);


    }

    @Test

    public void calcNumberSquaresOne() {
        SQRService service = new SQRService();

        int expected = 2;
        int actual = service.calcNumberSquares(121, 8);

        Assertions.assertEquals(expected, actual);


    }

    @Test

    public void calcNumberSquaresTwo() {

        SQRService service = new SQRService();

        int expected = 8;
        int actual = service.calcNumberSquares(300, 100);

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void calcNumberSquaresThree() {
        SQRService service = new SQRService();

        int expected = 8;
        int actual = service.calcNumberSquares(300, 10);

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void calcNumberSquaresThreeBorder() {
        SQRService service = new SQRService();

        int expected = 17;
        int actual = service.calcNumberSquares(1000, 200);

        Assertions.assertEquals(expected, actual);
    }
}

