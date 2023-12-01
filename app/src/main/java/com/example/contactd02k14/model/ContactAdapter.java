package com.example.contactd02k14.model;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.contactd02k14.R;

import java.util.List;

public class ContactAdapter extends BaseAdapter {

    private Context context;
    private List<Contact> dataSource;
    private LayoutInflater layoutInflater;

    public ContactAdapter(Context context, List<Contact> dataSource) {
        this.context = context;
        this.dataSource = dataSource;
        this.layoutInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return dataSource.size();
    }

    @Override
    public Object getItem(int position) {
        return dataSource.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        @SuppressLint("ViewHolder")
        View viewHolder = layoutInflater.inflate(R.layout.contact_item, parent, false);
        // View va bind id
        ImageView imgContact = viewHolder.findViewById(R.id.imgContact);
        TextView tvName = viewHolder.findViewById(R.id.tvContactName);
        TextView tvPhone = viewHolder.findViewById(R.id.tvContactPhone);
        // Do du lieu vao view
        Contact contact = dataSource.get(position);
        tvName.setText(contact.getName());
        tvPhone.setText(contact.getPhone());
        // Chua xu ly image....
        if(contact.getImageUrl() != null ) {
            Glide.with(context).load(contact.getImageUrl()).into(imgContact);
        }

        return viewHolder;
    }
}
