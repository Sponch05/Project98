package za.co.sponchware.www.connectedyouth;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class get_involved extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_involved);
    }

    public void crimePBtn(View view)
    {
        Intent intent = new Intent(this, ReportCrimeActivity.class);
        startActivity(intent);
    }

    public void sFunding(View view)
    {
        Intent intent = new Intent(this, CrowdFundingActivity.class);
        startActivity(intent);
    }

}
