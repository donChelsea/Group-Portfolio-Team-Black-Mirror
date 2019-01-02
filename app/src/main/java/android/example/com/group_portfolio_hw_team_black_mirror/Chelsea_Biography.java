package android.example.com.group_portfolio_hw_team_black_mirror;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.text.method.ScrollingMovementMethod;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Class Name should be clearer and should be the same format as the other classes
 */

public class Chelsea_Biography extends AppCompatActivity {
    private Toolbar toolbar;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chelsea_biography);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        /**
         * Account for this possible nullpointer exception
         */
        getSupportActionBar().setTitle("Home");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        textView = findViewById(R.id.bio_textview);
        textView.setMovementMethod(new ScrollingMovementMethod());
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.chelsea_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Intent firstProject = new Intent(Intent.ACTION_VIEW);
        firstProject.setData(Uri.parse("https://github.com/donChelsea/MadLibs-Story-App"));
        Intent secondProject = new Intent(Intent.ACTION_VIEW);
        secondProject.setData(Uri.parse("https://github.com/donChelsea/Bank-Teller-App"));
        Intent thirdProject = new Intent(Intent.ACTION_VIEW);
        thirdProject.setData(Uri.parse("https://github.com/donChelsea/Paradiso-the-Game"));
        switch (item.getItemId()) {
            /**
             * each case here should return true to make sure it won't fall through to other item click functions
             * only the Paradiso game opens here
             */
            case R.id.project1:
                if (firstProject.resolveActivity(getPackageManager()) != null) {
                    startActivity(firstProject);
                } else {
                    /**
                     * You can extract the toast text into the string.xml file
                     */
                    Toast.makeText(this, "Page not found", Toast.LENGTH_SHORT).show();
                }
            case R.id.project2:
                if (secondProject.resolveActivity(getPackageManager()) != null) {
                    startActivity(secondProject);
                } else {
                    Toast.makeText(this, "Page not found", Toast.LENGTH_SHORT).show();
                }
            case R.id.project3:
                if (thirdProject.resolveActivity(getPackageManager()) != null) {
                    startActivity(thirdProject);
                } else {

                    Toast.makeText(this, "Page not found", Toast.LENGTH_SHORT).show();
                }
            default:
                return false;
        }

    }
}
