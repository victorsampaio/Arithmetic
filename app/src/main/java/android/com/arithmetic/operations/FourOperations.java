package android.com.arithmetic.operations;

import android.app.ListActivity;
import android.com.arithmetic.operations.division.DivisionActivity;
import android.com.arithmetic.operations.multiplication.MultiplicationActivity;
import android.com.arithmetic.operations.subtraction.SubtractionActivity;
import android.com.arithmetic.operations.sum.SumActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.com.arithmetic.R;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class FourOperations extends ListActivity {
    private static final String CATEGORY = "operations";

    private static final String[] operations = new String[]{"1 - Sum(Add) ","2 - Subtraction","3 - Division ","4 - Multiplication"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_four_operations);

        this.setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,operations));

    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        // super.onListItemClick(l, v, position, id);
        switch (position){
            case 0:
                startActivity(new Intent(this, SumActivity.class));
                break;
            case 1:
                startActivity(new Intent(this, SubtractionActivity.class));
                break;
            case 2:
                startActivity(new Intent(this, DivisionActivity.class));
                break;
            case 3:
                startActivity(new Intent(this, MultiplicationActivity.class));
                break;
            default:
                finish();

        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.four_operations, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
