package org.netzd.recyclercontact;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView contactRecyclerView=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar=(Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        contactRecyclerView =(RecyclerView) findViewById(R.id.contactRecyclerView);
        LinearLayoutManager manager=new LinearLayoutManager(MainActivity.this);
        contactRecyclerView.setHasFixedSize(true);
        contactRecyclerView.setLayoutManager(manager);
        ContactAdapter contactAdapter = new ContactAdapter(getContacts());
        contactRecyclerView.setAdapter(contactAdapter);
    }

    /* OTRos metodos para mostrar verticalmente o como mosaicos comentados con //
   @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    Toolbar toolbar=(Toolbar) findViewById(R.id.toolbar);
    setSupportActionBar(toolbar);
    contactRecyclerView =(RecyclerView) findViewById(R.id.contactRecyclerView);
    //LinearLayoutManager manager=new LinearLayoutManager(this);
    //GridLayoutManager manager=new GridLayoutManager(this,2);
    StaggeredGridLayoutManager manager = new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL);
    contactRecyclerView.setHasFixedSize(true);
    contactRecyclerView.setLayoutManager(manager);
    ContactAdapter contactAdapter = new ContactAdapter(getContacts());
    contactRecyclerView.setAdapter(contactAdapter);
  }

    * */



    public List<Contact> getContacts(){
        List<Contact> contacts = new ArrayList<>();
        contacts.add(new Contact(1, "Pepe", "abc"));
        contacts.add(new Contact(2, "Pepa", "def"));
        contacts.add(new Contact(3, "Pepi", "ghi"));
        contacts.add(new Contact(4, "Pepo", "jkl"));
        contacts.add(new Contact(5, "Pepu", "mno"));
        return  contacts;
    }


}
