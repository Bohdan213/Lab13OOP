package task2;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.SQLException;
import java.util.Scanner;

public class NHSReader {
    private String link;
    private DBConnection dbconnection;
    {
        try {
            dbconnection = DBConnection.getInstance();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public NHSReader(String link) {
        this.link = link;
    }

    public String getData() throws IOException, SQLException {

        String data = dbconnection.isExist(this.link);
        if (data.length() != 0) {
            return data;
        }
        URL url = new URL(link);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        connection.connect();
        data = new Scanner(connection.getInputStream()).useDelimiter("\\Z").next();
        dbconnection.saveData(link, data);
        return data;
    }
}
