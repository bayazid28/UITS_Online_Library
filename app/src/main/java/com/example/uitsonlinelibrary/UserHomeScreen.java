package com.example.uitsonlinelibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class UserHomeScreen extends AppCompatActivity {
    private Button usrbooklistbtn;
    private Button myborbtn;
    private Button userpdfbtn;
    private Button userqspbtn;
    private Button userbookmbtn;
    private Button discbtn;
    private  Button usercntbtn;
    private  Button usrntcbtn;
    private Button userlgtbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_home_screen);

        usrbooklistbtn = findViewById(R.id.userbooklistbtn);
        myborbtn = findViewById(R.id.myborrowbtn);
        userpdfbtn = findViewById(R.id.userpdfbookbtn);
        userqspbtn = findViewById(R.id.userqspaperbtn);
        userbookmbtn = findViewById(R.id.userbookmarkbtn);
        discbtn = findViewById(R.id.userdiscussionbtn);
        usercntbtn = findViewById(R.id.usercontactbtn);
        usrntcbtn = findViewById(R.id.usernoticebtn);
        userlgtbtn = findViewById(R.id.userlogoutbtn);

        usrbooklistbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UserHomeScreen.this, UserBookListScreen.class);
                startActivity(intent);
            }
        });
        myborbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UserHomeScreen.this, UserMyBorrowScreen.class);
                startActivity(intent);
            }
        });
        userpdfbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UserHomeScreen.this, UserpdfBook.class);
                startActivity(intent);
            }
        });
        userqspbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UserHomeScreen.this, UserqspaperScreen.class);
                startActivity(intent);
            }
        });
        userbookmbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UserHomeScreen.this, UserBookmarksScreen.class);
                startActivity(intent);
            }
        });
        discbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UserHomeScreen.this, Userdiscussion.class);
                startActivity(intent);
            }
        });
        usercntbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UserHomeScreen.this, UserContactScreen.class);
                startActivity(intent);
            }
        });
        usrntcbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UserHomeScreen.this, UsernotificationS.class);
                startActivity(intent);
            }
        });
        userlgtbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UserHomeScreen.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }
}