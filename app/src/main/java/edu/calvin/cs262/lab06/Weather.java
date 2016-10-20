package edu.calvin.cs262.lab06;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

import static android.R.attr.max;

/**
 * Monoploty Player object (POJO),
 * Based on Deitel's WeatherViewer app (chapter 17).
 *
 * @author deitel
 * @author kvlinden
 * @author Peter Oostema
 * @version October 20, 2016
 */
public class Weather {

    private int id;
    private String emailaddress, name;

    public Weather(int id, String emailaddress, String name) {
        this.id = id;
        this.emailaddress = emailaddress;
        this.name =  name;
    }

    public int getID() {
        return id;
    }
    public String getEmailAddress() {
        return emailaddress;
    }
    public String getName() {
        return name;
    }
}
