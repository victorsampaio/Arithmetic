package android.com.arithmetic.operations.division;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.com.arithmetic.R;

public class VideoClassDivisionActivity extends Activity {

    private static final String CATEGORY = "videoDivisionActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_division);

        Log.i(CATEGORY, "Video sending");

        Uri uri = Uri.parse("https://www.youtube.com/watch?v=0uZiqk_ZdcA");
        Intent itVideo = new Intent(Intent.ACTION_VIEW,uri);
        Log.i(CATEGORY, "Starting Activity Video");
        startActivity(itVideo);
        Log.i(CATEGORY, "Started Video");

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.video_division, menu);
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
