package mh.learningandroid;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class ListViewActivity extends AppCompatActivity {
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        final String[] names=new String []{"ahmad","asghar"};

        final ArrayList<StudentModel> students = new ArrayList<>();
        students.add(new StudentModel("Ahmad","Barzegar"));
        students.add(new StudentModel("Farhad","Shamsaee"));

        MyListAdapter adapter = new MyListAdapter(ListViewActivity.this,names);
        StudentListAdapter studentAdapter = new StudentListAdapter(ListViewActivity.this,students);

        listView = (ListView)findViewById(R.id.listView);

        //listView.setAdapter(adapter);

        listView.setAdapter(studentAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(ListViewActivity.this, names[position], Toast.LENGTH_SHORT).show();
            }
        });
    }
}
