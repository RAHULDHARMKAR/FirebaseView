package com.example.viewdata;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;


import java.util.List;

public class AdapterCls extends ArrayAdapter {


    Activity activity;
    List<Model> list;

    public AdapterCls(Activity activity, List<Model> list) {
        super(activity, R.layout.custom_layout, list);
        this.activity = activity;
        this.list = list;

    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater layoutInflater = activity.getLayoutInflater();

        convertView = layoutInflater.inflate(R.layout.custom_layout, null, true);

        TextView name = convertView.findViewById(R.id.txt_name);
        TextView email = convertView.findViewById(R.id.txt_email);
        TextView contact = convertView.findViewById(R.id.txt_contact);
        TextView username= convertView.findViewById(R.id.txt_username);
        TextView password= convertView.findViewById(R.id.txt_password);
        Model model = list.get(position);

        name.setText(model.getName());
        email.setText(model.getEmail());
        contact.setText(model.getContact());
        username.setText(model.getUsername());
        password.setText(model.getPassword());

        return convertView;
    }
}

