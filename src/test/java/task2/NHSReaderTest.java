package task2;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;


class NHSReaderTest {

    @Test
    public void testNHSReader() throws SQLException, IOException {
        String link = "http://www.gimnasia.kiev.ua/";
        NHSReader read = new NHSReader(link);
        assertNotEquals(0, read.getData().length());
    }
}