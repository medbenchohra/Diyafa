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
        TextView foodName = convertView.findViewById(R.id.food_name_item);
        TextView country = convertView.findViewById(R.id.country_item);
        TextView user=convertView.findViewById(R.id.user_item);
        TextView time = convertView.findViewById(R.id.time_item);
        TextView quantity= convertView.findViewById(R.id.quantity_item);
        TextView posision=convertView.findViewById(R.id.position_item);

        // Populate the data into the template view using the data object
        foodName.setText(PostGive.getFoodName());
        country.setText(PostGive.getCountry()+"("+PostGive.getRegion()+")");
        time.setText(PostGive.getMinutes());
        user.setText("Mohamed");
        quantity.setText(PostGive.getQuantity());
        posision.setText("Red sea Hotel");
        // Return the completed view to render on screen
        return convertView;
    }



}
