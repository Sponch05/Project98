package za.co.sponchware.www.connectedyouth;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class CrowdFundingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crowd_funding);
    }
    public void getFundS(View view)
    {
        Intent intent = new Intent(this, GetFundingActivity.class);
        startActivity(intent);
    }

    public void givFund(View view) {
        Intent intent = new Intent(this, ProvideFundingActivity.class);
        startActivity(intent);
    }

    public void showC(View view)
    {
        Intent intent = new Intent(this, ProojectShowcase.class);
        startActivity(intent);
    }

}

