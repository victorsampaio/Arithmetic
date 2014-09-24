package android.com.arithmetic;

import android.app.Activity;
import android.app.ListActivity;
import android.com.arithmetic.operations.FourOperations;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class ArithmeticMainActivity extends ListActivity{
    private static final String CATEGORY = "arithmeticMenu";

    private static final String[] topic = new String[] {"1 - Operations(Add, Subt, Div, Mult) ", "2 - Geometry ", "3 - Trigonometry", "4 - Exit "};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_arithmetic_main);

        this.setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, topic));

    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id){
        switch (position){
            case 0:
                   startActivity(new Intent(this, FourOperations.class));
                break;
            case 1:
                startActivity(new Intent(this, FourOperations.class));
                break;
            case 2:
                startActivity(new Intent(this, FourOperations.class));
                break;
            case 3:
                startActivity(new Intent(this, FourOperations.class));
                break;
            default:
                finish();
        }
    };


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.arithmetic_main, menu);
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
