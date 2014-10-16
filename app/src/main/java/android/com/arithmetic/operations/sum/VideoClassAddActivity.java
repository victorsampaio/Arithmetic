package android.com.arithmetic.operations.sum;

import android.app.Activity;
import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.com.arithmetic.R;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;
import android.view.SurfaceHolder.Callback;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnBufferingUpdateListener;
import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer.OnPreparedListener;

import java.io.File;
import java.io.IOException;

public class VideoClassAddActivity extends Activity {

    private static final String CATEGORY= "videoClassAdd";
    private MediaPlayer player;
    private SurfaceHolder holder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_class_add);

        //VideoView videoAdd;
        //videoAdd = (VideoView)findViewById(R.id.videoViewAdd);
        //  android.resource://
        //videoAdd.setVideoURI(Uri.parse("res.raw://" + getPackageName() + "/" + R.raw.math_add));


        //player = MediaPlayer.create(this,R.raw.math_add);
        //player.start();

        Uri uri = Uri.parse("https://www.youtube.com/watch?v=TwEUFTiJX80");
        Intent intent = new Intent(Intent.ACTION_VIEW,uri);
        startActivity(intent);

    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
       /*
        if (player != null) {
            player.stop();
            player.release();
        }
        */
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.video_class_add, menu);
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
