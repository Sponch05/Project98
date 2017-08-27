package za.co.sponchware.www.connectedyouth;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import static za.co.sponchware.www.connectedyouth.R.id.parent;
import static za.co.sponchware.www.connectedyouth.R.id.spinner;

public class ReportCrimeActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    private Spinner crimeSpin;
    private String item;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_report_crime);
        addItemsOnSpin();
    }

    public void onItemSelected(AdapterView parent, View view, int pos, long id)
    {
       item = parent.getItemAtPosition(pos).toString();
    }
    public  void onNothingSelected (AdapterView parent)
    {

    }
    public void addItemsOnSpin()
    {
        crimeSpin = (Spinner)findViewById(R.id.spinner);

        List<String> categories = new ArrayList<String>();

        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item);

        // attaching data adapter to spinner
        crimeSpin.setAdapter(dataAdapter);


    }

    public void report (View view)
    {
        Toast.makeText(this, "Crime of " + item, Toast.LENGTH_LONG).show();
    }

}
