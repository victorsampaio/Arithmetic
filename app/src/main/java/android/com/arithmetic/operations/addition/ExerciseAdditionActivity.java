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

public class ExerciseAdditionActivity extends Activity implements OnClickListener{

    private static final String CATEGORY = "exerciseAdditionActivity";
    Button btResult;
    EditText resu1, resu2, resu3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise_addition);


        btResult = (Button)findViewById(R.id.btnResultExerc);
        btResult.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        // Question 1
        try {
            EditText r1 = (EditText)findViewById(R.id.r1);
            TextView result1 = (TextView)findViewById(R.id.resul1);
            int rs1 = Integer.parseInt(r1.getText().toString());
            int res1 = 12;
            if (rs1 == 12){
                result1.setText("CORRECT");
            } else {
                result1.setText("Result is " + res1);
            }

        }catch (Exception e){
            e.getMessage();
        }

        // Question 2
        try {
            EditText r2 = (EditText)findViewById(R.id.r2);
            TextView result2 = (TextView)findViewById(R.id.resul2);
            int rs2 = Integer.parseInt(r2.getText().toString());
            if (rs2 == 6){
                result2.setText("CORRECT");
            }else {
                result2.setText("Result is 6");
            }

        }catch (Exception e){
            e.getMessage();
        }

        // Question 3
        try {
            EditText r3 = (EditText)findViewById(R.id.r3);
            TextView result3 = (TextView)findViewById(R.id.resul3);
            int rs3 = Integer.parseInt(r3.getText().toString());
            if (rs3 == 10){
                result3.setText("CORRECT");
            }else {
                result3.setText("Result is 10");
            }

        }catch (Exception e){
            e.getMessage();
        }

    }






    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.exercise_addition, menu);
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

