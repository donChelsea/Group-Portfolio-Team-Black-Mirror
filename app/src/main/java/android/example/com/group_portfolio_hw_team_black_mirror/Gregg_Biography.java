package android.example.com.group_portfolio_hw_team_black_mirror;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

public class Gregg_Biography extends AppCompatActivity {
    private Toolbar toolbar;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gregg_biography);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Home");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.gregg_menu, menu);
        return true;

    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.gregg_mad_libs:
                Uri uri = Uri.parse("https://github.com/GreggNicholas/Mad-Libs-App");
                Intent madLibsIntent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(madLibsIntent);
                break;
            case R.id.gregg_text_game:
                Uri uriTextGame = Uri.parse("https://github.com/GreggNicholas/Homework-01.02");
                Intent textGameIntent = new Intent(Intent.ACTION_VIEW, uriTextGame);
                startActivity(textGameIntent);
                break;
            case R.id.gregg_clickable:
                Uri uriClickable = Uri.parse("https://github.com/GreggNicholas/Button-and-Clickable-Images");
                Intent clickableIntent = new Intent(Intent.ACTION_VIEW, uriClickable);
                startActivity(clickableIntent);
                break;


        }


        return super.onOptionsItemSelected(item);
    }
}