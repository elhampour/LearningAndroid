package mh.learningandroid;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SaveStateActivity extends AppCompatActivity {

    private final String TAG = SaveStateActivity.class.getSimpleName();

    private Button btnSubmit;
    private EditText editName;
    private TextView txtMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_savestate);
        Log.i(TAG,"onCreate");

        btnSubmit = (Button)findViewById(R.id.btnSubmit);
        editName =(EditText)findViewById(R.id.etName);
        txtMessage = (TextView)findViewById(R.id.txtMessage);

        btnSubmit.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                txtMessage.setText("Welcome "+editName.getText().toString());
                btnSubmit.setText("Logout");
            }
        });
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.i(TAG,"onRestoreInstanceState");
        if(savedInstanceState!=null){
            btnSubmit.setText(savedInstanceState.getString("btn"));
            txtMessage.setText(savedInstanceState.getString("message"));
        }
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.i(TAG,"onSaveInstanceState");

        outState.putString("message",txtMessage.getText().toString());
        outState.putString("btn",btnSubmit.getText().toString());
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG,"onRestart");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG,"onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG,"onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG,"onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG,"onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG,"onDestroy");
    }
}
