package jp.gr.conf_java.oleeapps.listview04;

import android.app.ListActivity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by orisa on 2018/01/26.
 */

public class MyListActivity extends ListActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // prepare data
        String dates[] = {"2018/01/26", "2018/01/24", "2018/01/22", "2018/01/21", "2018/01/19"};

        // array -> ArrayList
        ArrayList<String> data = new ArrayList<>();
        for (int i = 0; i < dates.length; i++) {
            data.add(dates[i]);
        }

        // create adapter
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.list_item, R.id.date, data);

        /** NOT WORKING: layout not used
        // array -> ArrayList<ListItem>
        ArrayList<ListItem> data = new ArrayList<>();
        for (int i = 0; i < dates.length; i++) {
            // create ListItem
            ListItem item = new ListItem();
            item.setDate(dates[i]);
            item.setId();
            // add ListItem to ArrayList
            data.add(item);
        }

        // create adapter
        MyListAdapter adapter = new MyListAdapter(this, data, R.layout.list_item);
         **/

        // set adapter
        this.setListAdapter(adapter);
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        Toast.makeText(this, String.valueOf(id), Toast.LENGTH_SHORT).show();
    }
}
