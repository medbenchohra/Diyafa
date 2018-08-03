package dz.diyafa.diyafa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class LoginActivity extends AppCompatActivity {

    public static boolean loggedIn = false;
    static String userName;
    static String password;

    /*
    private DatabaseReference mDatabase = FirebaseDatabase.getInstance().getReference();
    private final FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference ref = database.getReference("users");
    */

    HashMap<String, String> registeredUsers = new HashMap<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        getSupportActionBar().hide();

        registeredUsers.put("medbenchohra","123");
        registeredUsers.put("mohamed","moh");

/*
        for (String id : registeredUsers.keySet()) {
            if(userName.equals(id))
                if(password.equals(ref.getKey()));
        }
*/
    }

    public void onLogIn(View v) {
        if(loggedIn) {
            Intent intent = new Intent(this,HomeActivity.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            finish();
            startActivity(intent);
        }

        userName = findViewById(R.id.usernameET).toString();
        password = findViewById(R.id.passwordET).toString();

        String compPass = registeredUsers.get(userName);

        if (compPass == null) {

            loggedIn = true;
            Intent intent = new Intent(this,HomeActivity.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            finish();
            startActivity(intent);
        } else {
            Toast.makeText(getApplicationContext(), "Wrong password!",
                    Toast.LENGTH_SHORT).show();
        }
    }
}
