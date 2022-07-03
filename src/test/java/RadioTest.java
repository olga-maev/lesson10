import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class RadioTest {
    @Test
    public void shouldSetStation(){
        Radio radio = new Radio();
        radio.setNumberStation(5);

        int expected = 5;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void shouldSetVolume(){
        Radio radio = new Radio();
        radio.increaseVolume(8);

        int expected =8;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected,actual);
    }
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/stationdata.csv")
    public void shouldnextStation(int currentStation, int expected){
        Radio radio=new Radio();
        radio.setNumberStation(currentStation);
        radio.nextStation();

        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected,actual);
    }
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/volumedataup.csv")
    public void shouldnextVolume(int currentVolume, int expected){
        Radio radio=new Radio();
        radio.increaseVolume(currentVolume);
        radio.nextVolume();

        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected,actual);
    }
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/stationdatadown.csv")
    public void shouldprevStation(int currentStation, int expected){
        Radio radio=new Radio();
        radio.setNumberStation(currentStation);
        radio.prevStation();

        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected,actual);
    }
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/volumedatadown.csv")
    public void shouldprevVolume(int currentVolume, int expected){
        Radio radio=new Radio();
        radio.increaseVolume(currentVolume);
        radio.prevVolume();

        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected,actual);
    }

}
