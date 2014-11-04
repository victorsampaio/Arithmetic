package android.com.arithmetic.operations.subtraction;

import android.app.Activity;
import android.com.arithmetic.operations.addition.VideoClassAdditionActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.com.arithmetic.R;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class SubtractionMainActivity extends Activity implements OnClickListener {

    Button buttonCalcSub, buttonVideoSub, buttonExercSub;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subtraction_main);

        //Calculate
        buttonCalcSub = (Button)findViewById(R.id.btnCalcAdd);
        buttonCalcSub.setOnClickListener(this);

        // Exercises of the Subtraction
       buttonExercSub = (Button)findViewById(R.id.btnExerciseAdd);
        buttonExercSub.setOnClickListener(this);

        // Video of the Subtraction
        buttonVideoSub = (Button)findViewById(R.id.btnVideoSub);
        buttonVideoSub.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        try {
            if ( v == buttonCalcSub){
                Intent itCalc = new Intent(this , SubtractionCalculateActivity.class);
                startActivity(itCalc);
            } else if (v == buttonExercSub){
                Intent itExercise = new Intent(this , ExerciseSubtractionMainActivity.class);
                startActivity(itExercise);
            } else if(v ==buttonVideoSub ){
                Intent itVideoClassAdd = new Intent(this, VideoClassAdditionActivity.class);
                startActivity(itVideoClassAdd);
            }
        } catch (Exception e){
            e.getMessage();
        }


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.subtraction_main, menu);
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
