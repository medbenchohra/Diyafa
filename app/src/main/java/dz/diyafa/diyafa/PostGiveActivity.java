package dz.diyafa.diyafa;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class PostGiveActivity extends AppCompatActivity {
    public static final String EXTRA_POST_ID="post_id";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post_give);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        int postId=(int)getIntent().getExtras().get(EXTRA_POST_ID);
        PostGive p=HomeActivity.arrayOfPostGives.get(postId);
        TextView foodName=findViewById(R.id.foodName2);
        TextView coutry=findViewById(R.id.country2);
        TextView time=findViewById(R.id.time2);
        TextView quantity=findViewById(R.id.quantity2);
        TextView position=findViewById(R.id.position2);
        TextView user=findViewById(R.id.user2);
        TextView email=findViewById(R.id.email2);
        TextView phone=findViewById(R.id.phone2);
        foodName.setText(p.getFoodName());
        coutry.setText(p.getCountry());
        time.setText(p.getMinutes());
        quantity.setText(p.getQuantity());
        position.setText("Red SEA hotel");
        user.setText("Mohamed");
        email.setText("mohamed@example.com");
        phone.setText("+21356489547");



    }
}
