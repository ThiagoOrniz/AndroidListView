package adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.thiagoorniz.changeactivity.ContactDetails;
import com.example.thiagoorniz.changeactivity.R;

import java.util.List;

import models.Contact;

/**
 * Created by thiagoorniz on 16-02-06.
 */
public class ContactsListArrayAdapter extends ArrayAdapter<Contact>{
    Context mContext;
    int layoutResourceId;
    List<Contact> contactsList = null;
    int position = -1;

    public ContactsListArrayAdapter(Context context, int layoutResourceId, List<Contact> contactsList) {
        super(context, layoutResourceId, contactsList);
        this.layoutResourceId = layoutResourceId;
        this.mContext = context;
        this.contactsList = contactsList;

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row = convertView;
        ContactHolder holder = null;

        if (row == null) {
            LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            row = inflater.inflate(layoutResourceId, parent, false);

            holder = new ContactHolder();
            holder.lblLetter = (TextView) row.findViewById(R.id.txtLetter);
            holder.lblFullName = (TextView) row.findViewById(R.id.txtFullName);

            row.setTag(holder);
        } else {
            holder = (ContactHolder) row.getTag();

        }

        Contact contact = this.contactsList.get(position);
        holder.lblLetter.setText(contact.getName().charAt(0)+"");
        holder.lblFullName.setText(contact.getName()+" "+contact.getLastName());

        holder.contact = contact;

        contactListener(row, holder);


        return row;
    }

    private void contactListener( View row,  final ContactHolder holder) {

        row.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(mContext, ContactDetails.class);
                myIntent.putExtra("contact",holder.contact);

                mContext.startActivity(myIntent);
            }
        });

    }

    static class ContactHolder {
        Contact contact;
        TextView lblLetter;
        TextView lblFullName;
    }

}
