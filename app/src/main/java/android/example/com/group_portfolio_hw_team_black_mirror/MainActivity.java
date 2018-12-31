package android.example.com.group_portfolio_hw_team_black_mirror;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private DrawerLayout drawerLayout;
    private Toolbar toolbar;
    private ActionBar actionBar;
    private NavigationView navigationView;

    /**
     * Condense your drawable directory unused resources make applications larger and slow down builds.
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setHomeAsUpIndicator(R.drawable.ic_menu_black_24dp);

        drawerLayout = findViewById(R.id.drawer_layout);
        navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()) {
                    case R.id.chelsea:
                        menuItem.setChecked(true);
                        Intent chelseaIntent = new Intent(MainActivity.this, Biography.class);
                        startActivity(chelseaIntent);
                        drawerLayout.closeDrawers();
                        break;
                    case R.id.marly:
                        menuItem.setChecked(true);
                        Intent marlyIntent = new Intent(MainActivity.this, Marly_Biography.class);
                        startActivity(marlyIntent);
                        drawerLayout.closeDrawers();
                        break;
                    case R.id.khaing:
                        menuItem.setChecked(true);
                        Intent khaingIntent = new Intent(MainActivity.this, Khaing_Biography.class);
                        startActivity(khaingIntent);
                        drawerLayout.closeDrawers();
                        break;
                    case R.id.gregg:
                        menuItem.setChecked(true);
                        Intent greggIntent = new Intent(MainActivity.this, Gregg_Biography.class);
                        startActivity(greggIntent);
                        drawerLayout.closeDrawers();
                        break;
                    default:
                }
                return true;
            }
        });

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                drawerLayout.openDrawer(GravityCompat.START);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }


}
