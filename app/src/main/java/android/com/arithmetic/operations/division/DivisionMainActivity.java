package android.com.arithmetic.operations.division;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.com.arithmetic.R;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class DivisionMainActivity extends Activity implements OnClickListener{

    Button btCalcDivision , btExerciseDivision, btVideoDivision;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_division_main);

        btCalcDivision = (Button)findViewById(R.id.btnCalcAdd);
        btCalcDivision.setOnClickListener(this);

        btExerciseDivision = (Button)findViewById(R.id.btnExerciseAdd);
        btExerciseDivision.setOnClickListener(this);

        btVideoDivision = (Button)findViewById(R.id.btnVideoDiv);
        btVideoDivision.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (v == btCalcDivision){
            Intent calcIntent = new Intent(this, CalculateDivisionActivity.class);
            startActivity(calcIntent);
        } else if (v == btExerciseDivision){
            Intent exerctIntent = new Intent(this, ExerciseDivisionActivity.class);
            startActivity(exerctIntent);
        } else if ( v == btVideoDivision){
            Intent videoIntent = new Intent(this, VideoClassDivisionActivity.class);
            startActivity(videoIntent);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.division_main, menu);
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
