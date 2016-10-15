package mh.learningandroid;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FormActivity extends AppCompatActivity {

    private EditText nameEditText;
    private EditText familyEditText;
    private EditText mobileEditText;
    private EditText passEditText;
    private Button signUpBtn;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);

        Intent intent = getIntent();
        Bundle b = intent.getExtras();
        String message = b.getString("message");
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();

        nameEditText = (EditText) findViewById(R.id.nameEditText);
        familyEditText = (EditText) findViewById(R.id.familyEditText);
        mobileEditText = (EditText) findViewById(R.id.mobileEditText);
        passEditText = (EditText) findViewById(R.id.passEditText);

        signUpBtn = (Button) findViewById(R.id.sign_up_btn);

        signUpBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = "Name: " + nameEditText.getText().toString() + " ";
                text = text + "Family : " + familyEditText.getText().toString() + " ";
                text = text + "Pass : " + passEditText.getText().toString() + " ";
                text = text + "Mobile : " + mobileEditText.getText().toString() + " ";

                Toast.makeText(getApplicationContext(), text, Toast.LENGTH_SHORT).show();
            }
        });

    }
}
