import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.FilmsManager;

public class FilmsManagerTests {
    @Test
    public void testIfMany() {
        FilmsManager manager = new FilmsManager();

        manager.addFilms("Бладшот");
        manager.addFilms("Вперёд");
        manager.addFilms("Отель Белград");
        manager.addFilms("Джентльмены");
        manager.addFilms("Человек-невидимка");
        manager.addFilms("Тролли.Мировой тур");
        manager.addFilms("Номер один");

        String[] expected = {"Бладшот", "Вперёд", "Отель Белград", "Джентльмены", "Человек-невидимка", "Тролли.Мировой тур", "Номер один"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testIfOne() {
        FilmsManager manager = new FilmsManager();

        manager.addFilms("Бладшот");

        String[] expected = {"Бладшот"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testIfZero() {
        FilmsManager manager = new FilmsManager();

        String[] expected = {};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testIfLimitByDefaultFilmsTen() {
        FilmsManager manager = new FilmsManager();

        manager.addFilms("Бладшот");
        manager.addFilms("Вперёд");
        manager.addFilms("Отель Белград");
        manager.addFilms("Джентльмены");
        manager.addFilms("Человек-невидимка");
        manager.addFilms("Тролли.Мировой тур");
        manager.addFilms("Номер один");
        manager.addFilms("Матрица");
        manager.addFilms("Дорога");
        manager.addFilms("Пыль");

        String[] expected = {"Пыль", "Дорога", "Матрица", "Номер один", "Тролли.Мировой тур", "Человек-невидимка", "Джентльмены", "Отель Белград", "Вперёд", "Бладшот"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testIfLimitByDefaultFilmsEleven() {
        FilmsManager manager = new FilmsManager();

        manager.addFilms("Бладшот");
        manager.addFilms("Вперёд");
        manager.addFilms("Отель Белград");
        manager.addFilms("Джентльмены");
        manager.addFilms("Человек-невидимка");
        manager.addFilms("Тролли.Мировой тур");
        manager.addFilms("Номер один");
        manager.addFilms("Матрица");
        manager.addFilms("Дорога");
        manager.addFilms("Пыль");
        manager.addFilms("Ракета");

        String[] expected = {"Ракета", "Пыль", "Дорога", "Матрица", "Номер один", "Тролли.Мировой тур", "Человек-невидимка", "Джентльмены", "Отель Белград", "Вперёд"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testIfLimitByDefaultFilmsNine() {
        FilmsManager manager = new FilmsManager();

        manager.addFilms("Бладшот");
        manager.addFilms("Вперёд");
        manager.addFilms("Отель Белград");
        manager.addFilms("Джентльмены");
        manager.addFilms("Человек-невидимка");
        manager.addFilms("Тролли.Мировой тур");
        manager.addFilms("Номер один");
        manager.addFilms("Матрица");
        manager.addFilms("Дорога");

        String[] expected = {"Дорога", "Матрица", "Номер один", "Тролли.Мировой тур", "Человек-невидимка", "Джентльмены", "Отель Белград", "Вперёд", "Бладшот"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testIfLimitByDefaultFilmsTwo() {
        FilmsManager manager = new FilmsManager();

        manager.addFilms("Бладшот");
        manager.addFilms("Вперёд");


        String[] expected = {"Вперёд", "Бладшот"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testIfLimitByDefaultFilmsOne() {
        FilmsManager manager = new FilmsManager();

        manager.addFilms("Бладшот");


        String[] expected = {"Бладшот"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testIfLimitByDefaultFilmsZero() {
        FilmsManager manager = new FilmsManager();


        String[] expected = {};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testIfLimitElevenFilmsEleven() {
        FilmsManager manager = new FilmsManager(11);

        manager.addFilms("Бладшот");
        manager.addFilms("Вперёд");
        manager.addFilms("Отель Белград");
        manager.addFilms("Джентльмены");
        manager.addFilms("Человек-невидимка");
        manager.addFilms("Тролли.Мировой тур");
        manager.addFilms("Номер один");
        manager.addFilms("Матрица");
        manager.addFilms("Дорога");
        manager.addFilms("Пыль");
        manager.addFilms("Ракета");

        String[] expected = {"Ракета", "Пыль", "Дорога", "Матрица", "Номер один", "Тролли.Мировой тур", "Человек-невидимка", "Джентльмены", "Отель Белград", "Вперёд", "Бладшот"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testIfLimitElevenFilmsTen() {
        FilmsManager manager = new FilmsManager(11);

        manager.addFilms("Бладшот");
        manager.addFilms("Вперёд");
        manager.addFilms("Отель Белград");
        manager.addFilms("Джентльмены");
        manager.addFilms("Человек-невидимка");
        manager.addFilms("Тролли.Мировой тур");
        manager.addFilms("Номер один");
        manager.addFilms("Матрица");
        manager.addFilms("Дорога");
        manager.addFilms("Пыль");

        String[] expected = {"Пыль", "Дорога", "Матрица", "Номер один", "Тролли.Мировой тур", "Человек-невидимка", "Джентльмены", "Отель Белград", "Вперёд", "Бладшот"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testIfLimitElevenFilmsTwelve() {
        FilmsManager manager = new FilmsManager(11);

        manager.addFilms("Бладшот");
        manager.addFilms("Вперёд");
        manager.addFilms("Отель Белград");
        manager.addFilms("Джентльмены");
        manager.addFilms("Человек-невидимка");
        manager.addFilms("Тролли.Мировой тур");
        manager.addFilms("Номер один");
        manager.addFilms("Матрица");
        manager.addFilms("Дорога");
        manager.addFilms("Пыль");
        manager.addFilms("Ракета");
        manager.addFilms("Оно");


        String[] expected = {"Оно", "Ракета", "Пыль", "Дорога", "Матрица", "Номер один", "Тролли.Мировой тур", "Человек-невидимка", "Джентльмены", "Отель Белград", "Вперёд"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testIfLimitElevenFilmsOne() {
        FilmsManager manager = new FilmsManager(11);

        manager.addFilms("Бладшот");

        String[] expected = {"Бладшот"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testIfLimitElevenFilmsZero() {
        FilmsManager manager = new FilmsManager(11);

        String[] expected = {};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}
