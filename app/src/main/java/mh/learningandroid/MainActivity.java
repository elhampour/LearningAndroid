package mh.learningandroid;

import android.content.Intent;
import android.os.Build;
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
    private Button formBtn;
    private Button materialDesignBtn;
    private Button drawerLayoutBtn;
    private Button listViewBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //for developing apps below api lollipop we can do two things.
        //one is like values-v21 or layout-v21 folders and another one is
        //through java code like below.

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            //Call some material design apis
        } else {
            //implement this feature without material design apis.
        }

        submitBtn = (Button) findViewById(R.id.submitBtn);
        nameEditText = (EditText) findViewById(R.id.nameEditText);
        saveStateButton = (Button) findViewById(R.id.saveStateBtn);
        configBtn = (Button) findViewById(R.id.configBtn);
        formBtn = (Button) findViewById(R.id.formBtn);
        materialDesignBtn = (Button) findViewById(R.id.materialDesignBtn);
        drawerLayoutBtn = (Button) findViewById(R.id.drawerLayoutBtn);
        listViewBtn = (Button) findViewById(R.id.listViewBtn);

        submitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveToSecondActivity_SecondWay();
            }
        });

        saveStateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveToSaveStateActivity();
            }
        });

        configBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveToConfigActivity();
            }
        });

        formBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveToFormActivity();
            }
        });

        materialDesignBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveToMaterialDesignActivity();
            }
        });

        listViewBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveToListViewActivity();
            }
        });

        drawerLayoutBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveToDrawerActivity();
            }
        });
    }

    private void moveToListViewActivity() {
        Intent intent = new Intent(MainActivity.this, ListViewActivity.class);
        startActivity(intent);
    }

    private void moveToDrawerActivity() {
        Intent intent = new Intent(MainActivity.this, DrawerLayoutActivity.class);
        startActivity(intent);
    }

    private void moveToMaterialDesignActivity() {
        Intent intent = new Intent(MainActivity.this, MaterialDesignActivity.class);
        startActivity(intent);
    }

    private void moveToFormActivity() {
        Intent intent = new Intent(MainActivity.this, FormActivity.class);
        intent.putExtra("message", "hi there");
        startActivity(intent);
    }

    private void moveToConfigActivity() {
        Intent intent = new Intent(MainActivity.this, ConfigActivity.class);
        startActivity(intent);
    }

    private void moveToSaveStateActivity() {
        Intent intent = new Intent(MainActivity.this, SaveStateActivity.class);
        startActivity(intent);
    }

    private void moveToSecondActivity_FirstWay() {
        Intent intent = new Intent(MainActivity.this, SecondActivity.class);

        Bundle b = new Bundle();
        b.putString(Constants.KEY_NAME, nameEditText.getText().toString());
        b.putInt(Constants.KEY_AGE, 23);

        intent.putExtras(b);
        startActivity(intent);
    }

    private void moveToSecondActivity_SecondWay() {
        Intent intent = new Intent(MainActivity.this, SecondActivity.class);

        intent.putExtra(Constants.KEY_NAME, nameEditText.getText().toString());
        intent.putExtra(Constants.KEY_AGE, 23);

        startActivity(intent);
    }
}
