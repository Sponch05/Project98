package za.co.sponchware.www.connectedyouth;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import static za.co.sponchware.www.connectedyouth.R.layout.activity_main__social;

/**
 * Created by Mothupii_ on 2017-08-26.
 */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landing);
    }

    public void getInvolvedBtn(View view) {

        Intent intent = new Intent(this, get_involved.class);
        startActivity(intent);
    }

    public void learnBtnS(View view) {
        // Intent intent = new Intent(this, )
    }

    public void socialBtn(View view)
    {
        Intent intent = new Intent(this, MainActivity_Social.class);
        startActivity(intent);

    }


}
