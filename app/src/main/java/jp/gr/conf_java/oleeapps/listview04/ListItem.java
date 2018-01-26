package jp.gr.conf_java.oleeapps.listview04;

import android.util.Log;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by orisa on 2018/01/26.
 */

public class ListItem {
    private String date = null;
    private long id = 0;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public long getId() {
        return id;
    }

    public void setId() {
        if (this.date != null) {
            this.id = stringToMs(this.date);
        }
    }

    private long stringToMs(String string){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        Date date = null;
        try {
            date = sdf.parse(string);
        } catch (ParseException e) {
            Log.d("myLog", "ParseException thrown", e);
        }
        return date.getTime();
    }
}
