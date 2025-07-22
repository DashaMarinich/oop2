import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldSetWave() {
        Radio radio = new Radio();

        radio.setCurrentWave(9);

        int expected = 9;
        int actual = radio.getCurrentWave();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetWave2() {
        Radio radio = new Radio();

        radio.setCurrentWave(0);

        int expected = 0;
        int actual = radio.getCurrentWave();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldNotSetMinWave() {
        Radio radio = new Radio();

        radio.setCurrentWave(-1);

        int expected = 0;
        int actual = radio.getCurrentWave();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetMaxWave() {
        Radio radio = new Radio();

        radio.setCurrentWave(11);

        int expected = 0;
        int actual = radio.getCurrentWave();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextSetWave() {
        Radio radio = new Radio();

        radio.setCurrentWave(5);

        radio.next();

        int expected = 6;
        int actual = radio.getCurrentWave();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextWave() {
        Radio radio = new Radio();
        radio.setCurrentWave(8);

        radio.next();

        int expected = 9;
        int actual = radio.getCurrentWave();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void nextWave1() {
        Radio radio = new Radio();
        radio.setCurrentWave(0);

        radio.next();

        int expected = 1;
        int actual = radio.getCurrentWave();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextWave2() {
        Radio radio = new Radio();
        radio.setCurrentWave(9);

        radio.next();

        int expected = 0;
        int actual = radio.getCurrentWave();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevWave() {
        Radio radio = new Radio();
        radio.setCurrentWave(0);

        radio.prev();

        int expected = 9;
        int actual = radio.getCurrentWave();
        Assertions.assertEquals(expected, actual);


    }

    @Test
    public void prevWave2() {
        Radio radio = new Radio();
        radio.setCurrentWave(1);

        radio.prev();

        int expected = 0;
        int actual = radio.getCurrentWave();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevWave3() {
        Radio radio = new Radio();
        radio.setCurrentWave(9);

        radio.prev();

        int expected = 8;
        int actual = radio.getCurrentWave();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevWave4() {
        Radio radio = new Radio();
        radio.setCurrentWave(5);

        radio.prev();

        int expected = 4;
        int actual = radio.getCurrentWave();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(20);

        int expected = 20;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetVolume2() {
        Radio radio = new Radio();

        radio.setCurrentVolume(1);

        int expected = 1;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetVolume3() {
        Radio radio = new Radio();

        radio.setCurrentVolume(100);

        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldNotSetVolumeMin() {
        Radio radio = new Radio();

        radio.setCurrentVolume(-1);

        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldNotSetVolumeMax() {
        Radio radio = new Radio();

        radio.setCurrentVolume(101);

        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void increaseVolume1() {
        Radio radio = new Radio();

        radio.setCurrentVolume(20);

        radio.increaseVolume();

        int expected = 21;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void increaseVolume2() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);

        radio.increaseVolume();

        int expected = 1;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void increaseVolume3() {
        Radio radio = new Radio();

        radio.setCurrentVolume(1);

        radio.increaseVolume();

        int expected = 2;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void increaseVolume4() {
        Radio radio = new Radio();

        radio.setCurrentVolume(-1);

        radio.increaseVolume();

        int expected = 1;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void increaseVolume5() {
        Radio radio = new Radio();

        radio.setCurrentVolume(100);

        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void decreaseVolume1() {
        Radio radio = new Radio();

        radio.setCurrentVolume(15);

        radio.decreaseVolume();

        int expected = 14;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void decreaseVolume2() {
        Radio radio = new Radio();

        radio.setCurrentVolume(100);

        radio.decreaseVolume();

        int expected = 99;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void decreaseVolume3() {
        Radio radio = new Radio();

        radio.setCurrentVolume(99);

        radio.decreaseVolume();

        int expected = 98;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void decreaseVolume4() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);

        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

}







