package mh.learningandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button submitBtn;
    private EditText nameEditText;
    private Button saveStateButton;
    private Button configBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        submitBtn =(Button) findViewById(R.id.submitBtn);
        nameEditText =(EditText) findViewById(R.id.nameEditText);
        saveStateButton = (Button) findViewById(R.id.saveStateBtn);
        configBtn = (Button) findViewById(R.id.configBtn);

        submitBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                moveToSecondActivity_SecondWay();
            }
        });

        saveStateButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                moveToSaveStateActivity();
            }
        });

        configBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                moveToConfigActivity();
            }
        });
    }

    private void moveToConfigActivity(){
        Intent intent = new Intent(MainActivity.this,ConfigActivity.class);
        startActivity(intent);
    }

    private void moveToSaveStateActivity(){
        Intent intent = new Intent(MainActivity.this,SaveStateActivity.class);
        startActivity(intent);
    }

    private void moveToSecondActivity_FirstWay(){
        Intent intent = new Intent(MainActivity.this,SecondActivity.class);

        Bundle b = new Bundle();
        b.putString(Constants.KEY_NAME,nameEditText.getText().toString());
        b.putInt(Constants.KEY_AGE,23);

        intent.putExtras(b);
        startActivity(intent);
    }

    private void moveToSecondActivity_SecondWay(){
        Intent intent = new Intent(MainActivity.this,SecondActivity.class);

        intent.putExtra(Constants.KEY_NAME,nameEditText.getText().toString());
        intent.putExtra(Constants.KEY_AGE,23);

        startActivity(intent);
    }
}
