package android.com.arithmetic.operations.addition;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.com.arithmetic.R;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CalculateAdditionActivity extends Activity implements OnClickListener{

    private static final String CATEGORY = "operationAddition";
    TextView view;
    Button btnDiv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculate_addition);

            btnDiv = (Button)findViewById(R.id.btnAddition);
            btnDiv.setOnClickListener(this);
            Log.i(CATEGORY, "OnClickListener ok ");
        }

    @Override
    public void onClick(View v) {
        addOperation();
    }
        // Operation
    private void addOperation() {
        EditText etNum1 = (EditText)findViewById(R.id.firstNumAdd);
        Log.i(CATEGORY, "EditText 1 ok ");
        EditText etNum2 = (EditText)findViewById(R.id.secondNumAdd);
        Log.i(CATEGORY, "EditText 2 ok ");
        int n1 = Integer.parseInt(etNum1.getText().toString());
        Log.i(CATEGORY, "int n1 ok ");
        int n2 = Integer.parseInt(etNum2.getText().toString());
        Log.i(CATEGORY, "int n2 ok ");
        int result = n1 + n2;
        Log.i(CATEGORY, "result ok " + result);
        TextView msg = (TextView)findViewById(R.id.result);
        msg.setText("Result: " + result );
        Log.i(CATEGORY, "Message Result ok ");
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.calculate_addition, menu);
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
