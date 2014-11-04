package android.com.arithmetic.operations.addition;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.com.arithmetic.R;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class AdditionMainActivity extends Activity implements OnClickListener{

    Button btCalcAdd, btExercAdd, btVideoAdd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addition_main);

        btCalcAdd = (Button)findViewById(R.id.btnCalcAdd);
        btCalcAdd.setOnClickListener(this);

        btExercAdd =(Button)findViewById(R.id.btnExerciseAdd);
        btExercAdd.setOnClickListener(this);

        btVideoAdd = (Button)findViewById(R.id.btnVideoAdd);
        btVideoAdd.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (v == btCalcAdd){
            Intent itCalcAdd = new Intent(this, CalculateAdditionActivity.class);
            startActivity(itCalcAdd);
        }else if (v == btExercAdd){
            Intent itExercAdd = new Intent(this, ExerciseAdditionActivity.class);
            startActivity(itExercAdd);
        }else if (v == btVideoAdd){
            Intent itVideoAdd = new Intent(this, VideoClassAdditionActivity.class);
            startActivity(itVideoAdd);
        }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.addition_main, menu);
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
