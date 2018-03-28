package lyhoangvinh.com.mymvp.ui.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

import lyhoangvinh.com.mymvp.R;

/**
 * Created by LyHoangVinh on 16/03/2018.
 */

public class MainListAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>{

    private List<String> list;

    public MainListAdapter(List<String> list) {
        this.list = list;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.customs_view, parent, false);
        return new MainListItem(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        MainListItem mainListItem = (MainListItem) holder;
        mainListItem.mealTV.setText(list.get(position));
        mainListItem.infoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(), "INFO CLICKED", Toast.LENGTH_SHORT).show();
            }
        });
        mainListItem.editButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(), "EDIT CLICKED", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class MainListItem extends RecyclerView.ViewHolder{

        protected TextView mealTV;
        protected ImageButton infoButton;
        protected ImageButton editButton;

        public MainListItem(View itemView) {
            super(itemView);
            mealTV = itemView.findViewById(R.id.meal_tv);
            infoButton = itemView.findViewById(R.id.info_button);
            editButton= itemView.findViewById(R.id.edit_button);
        }
    }
}
