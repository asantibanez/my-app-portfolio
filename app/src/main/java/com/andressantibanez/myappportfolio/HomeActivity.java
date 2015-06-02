package com.andressantibanez.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_home, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void showToastWithThisButtonWillLaunchMyAppMessage(String message) {
        String completeMessage = getString(R.string.this_button_will_launch_my) + ' ' + message + '!';
        Toast.makeText(this, completeMessage, Toast.LENGTH_SHORT).show();
    }

    //Buttons methods
    public void launchSpotifyStreamer(View view) {
        showToastWithThisButtonWillLaunchMyAppMessage(getString(R.string.spotify_streamer) + ' ' + getString(R.string.app));
    }

    public void launchScoresApp(View view) {
        showToastWithThisButtonWillLaunchMyAppMessage(getString(R.string.scores_app));
    }

    public void launchLibraryApp(View view) {
        showToastWithThisButtonWillLaunchMyAppMessage(getString(R.string.library_app));
    }

    public void launchBuildItBiggerApp(View view) {
        showToastWithThisButtonWillLaunchMyAppMessage(getString(R.string.build_it_bigger_app) + ' ' + getString(R.string.app));
    }

    public void launchXYZReaderApp(View view) {
        showToastWithThisButtonWillLaunchMyAppMessage(getString(R.string.xyz_reader_app) + ' ' + getString(R.string.app));
    }

    public void launchCapstoneApp(View view) {
        showToastWithThisButtonWillLaunchMyAppMessage(getString(R.string.capstone_app));
    }
}
