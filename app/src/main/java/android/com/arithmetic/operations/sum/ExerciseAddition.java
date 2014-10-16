package android.com.arithmetic.operations.sum;

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

public class ExerciseAddition extends Activity implements OnClickListener{

    Button btExerc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise_addition);


        btExerc = (Button)findViewById(R.id.btnResultExerc);
        btExerc.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        try {
            EditText r1 = (EditText)findViewById(R.id.r1);
            TextView result1 = (TextView)findViewById(R.id.txtR1);
            int rs1 = Integer.parseInt(r1.getText().toString());
            int res1 = 4;
            if (rs1 == 4){

                result1.setText("CORRECT");
            } else {
                result1.setText("Result is: " + res1);
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
