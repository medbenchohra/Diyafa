package dz.diyafa.diyafa;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class HomeActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    public static ArrayList<PostGive> arrayOfPostGives = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);



        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(HomeActivity.this,CreatePostActivity.class);
                startActivity(intent);
            }
        });

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);


        PostGive p=new PostGive("Chorba", "Algeria","Algiers", "15 min", "3 people");
        arrayOfPostGives.add(p);
        p=new PostGive("Egyptian food", "Egypt","Cairo", "15 min", "2 people");
        arrayOfPostGives.add(p);
        p=new PostGive("REPAT", "Morocco","Casablanca", "50 min", "3 people");
        arrayOfPostGives.add(p);
        p=new PostGive("Chorba", "Algeria","Algiers", "30 min", "1 person");
        arrayOfPostGives.add(p);
        p=new PostGive("Chorba", "Algeria","Algiers", "15 min", "3 people");
        arrayOfPostGives.add(p);
        p=new PostGive("Chorba", "Algeria","Algiers", "15 min", "3 people");
        arrayOfPostGives.add(p);
        p=new PostGive("Chorba", "Algeria","Algiers", "15 min", "3 people");
        arrayOfPostGives.add(p);
        p=new PostGive("Chorba", "Algeria","Algiers", "15 min", "3 people");
        arrayOfPostGives.add(p);
        // Create the adapter to convert the array to views
        PostGiveAdapter adapter = new PostGiveAdapter(this, arrayOfPostGives);
        // Attach the adapter to a ListView
        ListView listView = findViewById(R.id.timeline);
        listView.setAdapter(adapter);

        //Create the listener
        AdapterView.OnItemClickListener itemClickListener =new AdapterView.OnItemClickListener(){

            @Override
            public void onItemClick(AdapterView<?> listDrinks,
                                    View itemView,
                                    int position,
                                    long id) {

                Intent intent = new Intent(HomeActivity.this, PostGiveActivity.class);
                intent.putExtra(PostGiveActivity.EXTRA_POST_ID, (int) id);

                startActivity(intent);
            }

        };

        listView.setOnItemClickListener(itemClickListener);

        ((TextView)findViewById(R.id.username)).setText(LoginActivity.userName);

    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.home, menu);
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

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_settings) {
            // Handle the camera action
        } else if (id == R.id.nav_preferences) {

        } else if (id == R.id.nav_profile) {

        } else if (id == R.id.nav_signout) {
            LoginActivity.loggedIn = false;
            Intent intent = new Intent(this,LoginActivity.class);
            finish();
            startActivity(intent);
        }

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    /*public void onCreatePost(View view) {
        Intent intent =new Intent(HomeActivity.this,CreatePostActivity.class);
        startActivity(intent);
    }*/
}
