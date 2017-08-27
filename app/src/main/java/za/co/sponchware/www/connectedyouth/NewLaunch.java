package za.co.sponchware.www.connectedyouth;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class NewLaunch extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_launch);
    }
    public void involvBtn(View view)
    {
        Intent start = new Intent(this, get_involved.class);
        startActivity(start);
    }
    public void socialBtn(View view)
    {
        Intent start = new Intent(this, MainActivity_Social.class);
        startActivity(start);
    }
    public void myProfbtn(View view)
    {
        Intent start = new Intent(this, my_profile.class);
        startActivity(start);
    }
}
