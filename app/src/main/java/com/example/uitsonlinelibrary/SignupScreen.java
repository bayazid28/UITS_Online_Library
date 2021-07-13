package com.example.uitsonlinelibrary;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class SignupScreen extends AppCompatActivity {
    EditText editTextEmail,editTextPassword,edtTextName,editTextId,editTextMobile;
    Button btnCreateAccount;

    private FirebaseAuth mAuth;
    FirebaseDatabase rootNode;
    DatabaseReference reference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup_screen);

        //databaseReference = FirebaseDatabase.getInstance().getReference("students");

        editTextEmail = findViewById(R.id.editTextTextEmailAddress);
        editTextPassword =  findViewById(R.id.editTextTextPassword2);
        edtTextName = findViewById(R.id.editTextTextPersonName);
        editTextId = findViewById(R.id.editTextNumber);
        editTextMobile = findViewById(R.id.editTextPhone);
        btnCreateAccount = findViewById(R.id.button);
        mAuth = FirebaseAuth.getInstance();

        btnCreateAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //savedata();
                rootNode = FirebaseDatabase.getInstance();
                reference = rootNode.getReference("students");

                String email = editTextEmail.getText().toString().trim();
                String password = editTextPassword.getText().toString();
                String name = edtTextName.getText().toString().trim();
                String id = editTextId.getText().toString().trim();
                String mobile = editTextMobile.getText().toString().trim();

                Student student = new Student(email,password,name,id,mobile);
                reference.child(mobile).setValue(student);




                mAuth.createUserWithEmailAndPassword(email,password)
                        .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(Task<AuthResult> task) {

                                if(task.isSuccessful()) {
                                    Toast.makeText(getApplicationContext(), "Account is created", Toast.LENGTH_LONG).show();

                                    startActivity(new Intent(getApplicationContext(), UserHomeScreen.class));

                                }else {
                                    Toast.makeText(getApplicationContext(),task.getException().getMessage(),Toast.LENGTH_LONG).show();
                                }
                            }
                        });
            }

           /* private void savedata() {
                String name = edtTextName.getText().toString().trim();
                String id = editTextId.getText().toString().trim();
                String mobile = editTextMobile.getText().toString().trim();

                String key = databaseReference.push().getKey();
                Student student = new Student(name,id);

                databaseReference.child(key).setValue(student);

            }*/
        });

    }

}