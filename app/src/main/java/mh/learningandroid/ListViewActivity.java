package mh.learningandroid;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

public class ListViewActivity extends AppCompatActivity {
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        String[] names=new String []{"ahmad","asghar"};

        MyListAdapter adapter = new MyListAdapter(ListViewActivity.this,names);

        listView = (ListView)findViewById(R.id.listView);

        listView.setAdapter(adapter);
    }
}
