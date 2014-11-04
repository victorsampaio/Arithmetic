package android.com.arithmetic.operations.division;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.com.arithmetic.R;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ExerciseDivisionActivity extends Activity implements OnClickListener{

    Button btResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise_division);

        btResult = (Button)findViewById(R.id.btnResultExerc);
        btResult.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        //Question 1
        try {
            EditText rs1 = (EditText)findViewById(R.id.r1);
            TextView result1 = (TextView)findViewById(R.id.resul1);
            int res1 = Integer.parseInt(rs1.getText().toString());
            if (res1 == 3){
                result1.setText("CORRECT");
            }else {
                result1.setText("ERROR. Result is 3");
            }

        }catch (Exception e){
            e.getMessage();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.exercise_division, menu);
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
