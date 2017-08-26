package za.co.sponchware.www.connectedyouth;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import za.co.sponchware.www.connectedyouth.dummy.DatabaseHelper;

import static za.co.sponchware.www.connectedyouth.R.menu.*;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landing);

        DatabaseHelper myDb = new DatabaseHelper(this);
    }

    //Creating variables for the edit text


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //Inflate this menu, this adds items to the action bar if it is present
        getMenuInflater().inflator(menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        //Handle action bar clicks here
        //Action bar will automatically handle clicks on the home page
        //as you specify a parent activity in Android manifest

        int id = item.getItemId();

        //No inspection simple if statement
        if (id == R.id.action_setting) {

        }
    }

}
