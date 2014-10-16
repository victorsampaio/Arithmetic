package android.com.arithmetic.operations.sum;

import android.app.Activity;
import android.content.Intent;
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

public class SumActivity extends Activity implements OnClickListener{
    private static final String CATEGORY = "operationSum";

    TextView view;
    Button btCalc, btExercise, btVideoClassAdd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sum);

        btCalc = (Button) findViewById(R.id.btnCalc);
        btCalc.setOnClickListener(this);

        btVideoClassAdd = (Button)findViewById(R.id.btnVideo);
        btVideoClassAdd.setOnClickListener(this);

        btExercise = (Button) findViewById(R.id.btnExercise);
        btExercise.setOnClickListener(this);
    }


    public void onClick(View v){
        try {
            if ( v == btCalc){
                Intent itCalc = new Intent(this , CalculateAddition.class);
                startActivity(itCalc);
            } else if (v == btExercise){
                Intent itExercise = new Intent(this , ExerciseAddition.class);
                startActivity(itExercise);
            } else if(v ==btVideoClassAdd ){
                Intent itVideoClassAdd = new Intent(this, VideoClassAddActivity.class);
                startActivity(itVideoClassAdd);
            }
        } catch (Exception e){
            e.getMessage();
        }
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
