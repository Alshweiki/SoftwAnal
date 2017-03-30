package hes_so.softwanal;

import android.app.Activity;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.ImageButton;
import android.widget.TextView;

import org.json.JSONObject;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class MainActivity extends Activity {


    View activeButtonView;
    ExpandableListView projectList;
    TextView state;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        state = (TextView) findViewById(R.id.tvState);
        projectList = (ExpandableListView) findViewById(R.id.elvProjectList);

    }

    public void addNewProjectClicked(View view)
    {
        //dialog popup
    }

    public void deleteProjectClicked(View view)
    {
        //dialog popup
    }

    public void stateClicked(View view)
    {
        if(activeButtonView != null)
        {
            activeButtonView.setActivated(false);
        }
        activeButtonView = view;
        activeButtonView.setActivated(true);
        state.setText(activeButtonView.getContentDescription());

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
}