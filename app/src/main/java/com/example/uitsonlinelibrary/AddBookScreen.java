package com.example.uitsonlinelibrary;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class AddBookScreen extends AppCompatActivity {
    EditText bookname,writter,edition,location;
    Button addbooks;
    private FirebaseAuth mAuth;
    FirebaseDatabase rootNode;
    DatabaseReference reference;

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId()==android.R.id.home);
        finish();
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_book_screen);


        Toolbar toolbar=findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Add Book");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        bookname = findViewById(R.id.bookname);
        writter = findViewById(R.id.writtername);
        edition = findViewById(R.id.edition);
        location = findViewById(R.id.location);
        addbooks = findViewById(R.id.addbookbutton);



        addbooks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rootNode = FirebaseDatabase.getInstance();
                reference = rootNode.getReference("Books");

                String b = bookname.getText().toString().trim();
                String w = writter.getText().toString().trim();
                String e = edition.getText().toString().trim();
                String l = location.getText().toString().trim();

                book book = new book(b,w,e,l);
                reference.child(b).setValue(book);
                Toast.makeText(getApplicationContext(), "Book is Added", Toast.LENGTH_LONG).show();
            }
        });




    }
}