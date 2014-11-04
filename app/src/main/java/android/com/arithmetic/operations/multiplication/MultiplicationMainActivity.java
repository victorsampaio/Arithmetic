package android.com.arithmetic.operations.multiplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.com.arithmetic.R;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MultiplicationMainActivity extends Activity implements OnClickListener{

    Button btCalculateMult, btVideoMulti, btExerciseMult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multiplication_main);

        btCalculateMult = (Button)findViewById(R.id.btnCalcAdd);
        btCalculateMult.setOnClickListener(this);

        btExerciseMult = (Button)findViewById(R.id.btnExerciseAdd);
        btExerciseMult.setOnClickListener(this);

        btVideoMulti = (Button)findViewById(R.id.btnVideoMult);
        btVideoMulti.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (v == btCalculateMult){
            Intent itCalcMult = new Intent(this, CalculateMultiplicationActivity.class);
            startActivity(itCalcMult);
        } else if (v == btExerciseMult){
            Intent itExercMult = new Intent(this, ExerciseMultiplicationActvity.class);
            startActivity(itExercMult);
        }else if (v == btVideoMulti){
            Intent itVideoMult = new Intent(this, VideoClassMultiplicationActivity.class);
            startActivity(itVideoMult);
        }


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.multiplication_main, menu);
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
