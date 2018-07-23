package sg.edu.rp.c346.contactlistapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by 16019865 on 23/7/2018.
 */

public class CustomAdapter extends ArrayAdapter {

    Context parent_context;
    int layout_id;
    ArrayList<ContactItem> Contact;


    public CustomAdapter(@NonNull Context context, int resource, @NonNull ArrayList<ContactItem> objects) {
        super(context, resource, objects);
        parent_context = context;
        layout_id = resource;
        Contact = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View rowview;

        if(convertView == null) {
            LayoutInflater inflater = (LayoutInflater) parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            rowview = inflater.inflate(layout_id, parent, false);
        }
        else {
            rowview = convertView;
        }




        TextView tvName = rowview.findViewById(R.id.textViewName);
        TextView tvTitle = rowview.findViewById(R.id.textViewCountryCode);
        TextView tvSalary = rowview.findViewById(R.id.textViewPhoneNum);

        ContactItem currentItem = Contact.get(position);
        String name = currentItem.getName();
        int code = currentItem.getCountryCode();
        int num = currentItem.getNumber();
        tvName.setText(name);
        tvTitle.setText("+"+code);
        tvSalary.setText(num +"");

        return rowview;
    }

}