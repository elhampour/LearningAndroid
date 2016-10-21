package mh.learningandroid;

import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MaterialDesignActivity extends AppCompatActivity {

    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_material_design);

        toolbar = (Toolbar) findViewById(R.id.toolbar);

        //if you want to use stand alone toolbar

        toolbar.setTitle("Welcome !");
        toolbar.setSubtitle("Folks !");
        toolbar.inflateMenu(R.menu.menu_main);
        toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {

                String msg = "";

                switch (item.getItemId()) {
                    case R.id.discard:
                        msg = "Delete";
                        break;

                    case R.id.search:
                        msg = "Search";
                        break;

                    case R.id.edit:
                        msg = "Edit";
                        break;

                    case R.id.settings:
                        msg = "Settings";
                        break;

                    case R.id.exit:
                        msg = "Exit";
                        break;
                }

                Toast.makeText(MaterialDesignActivity.this, msg + " clicked!", Toast.LENGTH_SHORT).show();

                return true;
            }
        });


        //******************************************************************************

        // if you want to use toolbar as action bar
        // setSupportActionBar(toolbar);
        // getSupportActionBar().setTitle("Welcome !");
        // toolbar.setSubtitle("Folks !");

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            //Call some material design apis
            toolbar.setElevation(10f);
        } else {
            //implement this feature without material design apis.
        }

        //toolbar.setLogo(R.drawable.good_day);
        //toolbar.setNavigationIcon(R.drawable.navigation_back);
    }

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        getMenuInflater().inflate(R.menu.menu_main, menu);
//        return true;
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        String msg="";
//
//        switch (item.getItemId()){
//            case R.id.discard:
//                msg="Delete";
//                break;
//
//            case R.id.search:
//                msg="Search";
//                break;
//
//            case R.id.edit:
//                msg="Edit";
//                break;
//
//            case R.id.settings:
//                msg="Settings";
//                break;
//
//            case R.id.exit:
//                msg="Exit";
//                break;
//        }
//
//        Toast.makeText(this,msg+" clicked!",Toast.LENGTH_SHORT).show();
//
//        return super.onOptionsItemSelected(item);
//    }
}
