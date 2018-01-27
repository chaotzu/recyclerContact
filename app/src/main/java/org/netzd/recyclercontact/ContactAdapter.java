package org.netzd.recyclercontact;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tazmadroid on 27/01/18.
 */

public class ContactAdapter extends RecyclerView.Adapter<ContactAdapter.ContactViewHolder> {

    private List<Contact> contacts=null;

    public ContactAdapter(List<Contact> contacts) {
        if(contacts==null){
            this.contacts=new ArrayList<>();
        }else {
            this.contacts = contacts;
        }
    }

    @Override
    public ContactViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View item= LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_contact,parent,false);
        return new ContactViewHolder(item);
    }

    @Override
    public void onBindViewHolder(ContactViewHolder holder, int position) {
        holder.nameTextView.setText(contacts.get(position).getName());
        holder.schoolTextView.setText(contacts.get(position).getSchool());
        holder.ageTextView.setText(Integer.toString(contacts.get(position).getAge()));
    }

    @Override
    public int getItemCount() {
        return contacts.size();
    }

    static class ContactViewHolder extends RecyclerView.ViewHolder{

        protected TextView nameTextView=null;
        protected TextView schoolTextView=null;
        protected TextView ageTextView=null;

        public ContactViewHolder(View itemView) {
            super(itemView);
            nameTextView=(TextView) itemView.findViewById(R.id.textView);
            schoolTextView=(TextView) itemView.findViewById(R.id.textView2);
            ageTextView=(TextView) itemView.findViewById(R.id.textView3);
        }
    }
}


