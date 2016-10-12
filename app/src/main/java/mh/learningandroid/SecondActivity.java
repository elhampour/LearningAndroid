package mh.learningandroid;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private static final String TAG = SecondActivity.class.getSimpleName();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView textView = (TextView) findViewById(R.id.textView);

        StringBuilder msg = new StringBuilder("Welcome \n");

        Intent intent = getIntent();
        Bundle b = intent.getExtras();

        if(b.containsKey(Constants.KEY_NAME)){
            String name= b.getString(Constants.KEY_NAME,"My default name.");
            Log.i(TAG,"name :"+name);
            msg.append(name);
        }

        if(b.containsKey(Constants.KEY_AGE)){
            int age = b.getInt(Constants.KEY_AGE,30);
            Log.i(TAG,"Age : "+age);
            msg.append("\n").append(age).append(" years old");
        }

        textView.setText(msg);
    }

}
