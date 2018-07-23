package sg.edu.rp.c346.contactlistapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvContact;

    ArrayList<ContactItem> alContactItem;
    CustomAdapter caContact;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvContact = findViewById(R.id.contactListView);
        alContactItem = new ArrayList<>();
        ContactItem con1 = new ContactItem("Mary", 65, 65442334);
        ContactItem con2 = new ContactItem("Ken", 65,97442437);

        alContactItem.add(con1);
        alContactItem.add(con2);

        caContact = new CustomAdapter(this,R.layout.contacts_item,alContactItem );

        lvContact.setAdapter(caContact);
    }
}
