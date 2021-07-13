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

public class NoticeScreen extends AppCompatActivity {
    EditText n;
    private Button addnotice;
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
        setContentView(R.layout.activity_notice_screen);

        Toolbar toolbar=findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Add Notice");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        n = findViewById(R.id.nText);
        addnotice = findViewById(R.id.naddBTN);

        addnotice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rootNode = FirebaseDatabase.getInstance();
                reference = rootNode.getReference("Notice");

                String notices = n.getText().toString().trim();
                Notice notice = new Notice(notices);
                reference.child(notices).setValue(notice);
                Toast.makeText(getApplicationContext(), "Notice is Added", Toast.LENGTH_LONG).show();
            }
        });




    }
}