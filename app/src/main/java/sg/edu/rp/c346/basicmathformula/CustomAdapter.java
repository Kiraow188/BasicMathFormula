package sg.edu.rp.c346.basicmathformula;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import sg.edu.rp.c346.basicmathformula.MathsFormula;
import sg.edu.rp.c346.basicmathformula.R;


public class CustomAdapter extends ArrayAdapter {

    Context parent_context;
    int layout_id;
    ArrayList<MathsFormula> formulaList;

    public CustomAdapter(@NonNull Context context, int resource, @NonNull ArrayList<MathsFormula> objects){
        super(context, resource, objects);
        parent_context= context;
        layout_id= resource;
        formulaList = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

            LayoutInflater inflater = (LayoutInflater) parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View rowView = inflater.inflate(layout_id, parent, false);


            TextView tvDesc = rowView.findViewById(R.id.tvDesc);
            TextView tvForm = rowView.findViewById(R.id.tvForm);
            TextView tvType = rowView.findViewById(R.id.tvType);
            MathsFormula currentItem = formulaList.get(position);
            tvDesc.setText(currentItem.getName());
            tvForm.setText(currentItem.getFormula());
            tvType.setText("Formula type is: " + currentItem.getType());

        return rowView;
    }
}
