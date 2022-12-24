package task2;

import java.io.IOException;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws IOException, SQLException {
        String link = "https://www.eolymp.com/uk/problems";
        NHSReader read = new NHSReader(link);
        System.out.println(read.getData());
    }
}
