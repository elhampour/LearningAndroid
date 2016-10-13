package mh.learningandroid;

import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class ConfigActivity extends AppCompatActivity {

    private static final String TAG = SecondActivity.class.getSimpleName();

    private Button btnSubmit;
    private EditText editName;
    private TextView txtMessage;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_config);

        btnSubmit = (Button)findViewById(R.id.btnSubmit);
        editName =(EditText)findViewById(R.id.etName);
        txtMessage = (TextView)findViewById(R.id.txtMessage);
        imageView = (ImageView)findViewById(R.id.imageView);

        btnSubmit.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                txtMessage.setText("Welcome "+editName.getText().toString());
                btnSubmit.setText("Logout");
            }
        });
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        Log.i(TAG,"onConfigurationChanged");

        if(newConfig.orientation == Configuration.ORIENTATION_PORTRAIT){
            Toast.makeText(getApplicationContext(),"portrait",Toast.LENGTH_SHORT).show();
            imageView.setImageResource(R.drawable.portrait);
        }else if(newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE){
            Toast.makeText(getApplicationContext(),"landscape",Toast.LENGTH_SHORT).show();
            imageView.setImageResource(R.drawable.landscape);
        }
    }
}
