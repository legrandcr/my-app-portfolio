package cr.ole.hub;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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

    public void openApp(View view) {

        String message = "";
        switch (view.getId()){

            case R.id.libraryApp:{
                message = "Library app";
                break;
            }
            case R.id.buildApp:{
                message = "Build app ";
                break;
            }
            case R.id.capstone:{
                message = "Capstone app";
                break;
            }
            case R.id.scoresApp:{
                message = "Scores app ";
                break;
            }
            case R.id.spotify:{
                message = "Spotify app ";
                break;
            }
            case R.id.xyzReader:{
                message = "Xyz app ";
                break;
            }

        }


        Context context = getApplicationContext();
        CharSequence text = "This button will launch my " + message + "!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
}
