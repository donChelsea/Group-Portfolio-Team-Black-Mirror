package android.example.com.group_portfolio_hw_team_black_mirror;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

public class Khaing_Biography extends AppCompatActivity {
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_khaing_bio);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Home");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.khaing_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.game:
                Uri uri = Uri.parse("https://github.com/KhaiSoe/CYOA_Pursuit_HW_SOE_KHAING");
                Intent gameIntent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(gameIntent);
                break;
            case R.id.story:
                Uri uri2 = Uri.parse("https://github.com/KhaiSoe/Mad_Libs_Story_App_HW_SOE_KHAING/tree/master/app");
                Intent storyIntent = new Intent(Intent.ACTION_VIEW, uri2);
                startActivity(storyIntent);
                break;
            case R.id.exercise_recyclerview:
                Uri uri3 = Uri.parse("https://github.com/KhaiSoe/RecyclerViewExercise");
                Intent exerciseIntent = new Intent(Intent.ACTION_VIEW, uri3);
                startActivity(exerciseIntent);
                break;
        }
        return super.onOptionsItemSelected(item);
    }

}
