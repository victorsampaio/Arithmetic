package android.com.arithmetic.operations.sum;

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

public class SumActivity extends Activity {
    private static final String CATEGORY = "operationSum";

    TextView view;
    Button btnSum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sum);

        btnSum = (Button)findViewById(R.id.btSum);
        btnSum.setOnClickListener(btnListener);
        Log.i(CATEGORY, "OnClickListener ok ");
    }
    private OnClickListener btnListener = new OnClickListener() {
        @Override
        public void onClick(View v) {
            sumOperation();
        }
    };

    // Operation
    private void sumOperation() {
        EditText etNum1 = (EditText)findViewById(R.id.firstNumber);
        Log.i(CATEGORY, "EditText 1 ok ");
        EditText etNum2 = (EditText)findViewById(R.id.secondNumber);
        Log.i(CATEGORY, "EditText 2 ok ");
        int n1 = Integer.parseInt(etNum1.getText().toString());
        Log.i(CATEGORY, "int n1 ok ");
        int n2 = Integer.parseInt(etNum2.getText().toString());
        Log.i(CATEGORY, "int n2 ok ");
        int result = n1 + n2;
        Log.i(CATEGORY, "result ok " + result);
        TextView msg = (TextView)findViewById(R.id.view);
        msg.setText("Result: " + result );
        Log.i(CATEGORY, "Message Result ok ");
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.sum, menu);
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
