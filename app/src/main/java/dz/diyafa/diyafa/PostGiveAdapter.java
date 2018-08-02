package dz.diyafa.diyafa;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class PostGiveAdapter extends ArrayAdapter<PostGive> {

    public PostGiveAdapter(Context context, ArrayList<PostGive> PostGives) {
        super(context, 0, PostGives);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Get the data item for this position
        PostGive PostGive = getItem(position);
        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_post_give, parent, false);
        }
        // Lookup view for data population
        TextView foodName = convertView.findViewById(R.id.food_name);
        TextView country = convertView.findViewById(R.id.country2);
        TextView region=convertView.findViewById(R.id.region);
        TextView time = convertView.findViewById(R.id.time2);
        TextView quantity= convertView.findViewById(R.id.quantity2);

        // Populate the data into the template view using the data object
        foodName.setText(PostGive.getFoodName());
        country.setText(PostGive.getCountry());
        time.setText(PostGive.getMinutes());
        region.setText("("+PostGive.getRegion()+")");
        quantity.setText(PostGive.getQuantity());
        // Return the completed view to render on screen
        return convertView;
    }



}
