package com.example.uitsonlinelibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AdminHomeScreen extends AppCompatActivity {
    private Button MemberList;
    private Button BookList;
    private Button addbook;
    private Button req;
    private Button notice;
    private Button logoutadmin;
    private Button addpdfbtn;
    private Button qsp;
    private Button pdfb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_home_screen);

        MemberList = findViewById(R.id.member_list);
        BookList = findViewById(R.id.book_list);
        addbook = findViewById(R.id.addbookbuttons);
        req = findViewById(R.id.brequest);
        notice = findViewById(R.id.noticebtn);
        logoutadmin = findViewById(R.id.logoutAdmin);
        addpdfbtn = findViewById(R.id.addpdfbtn);
        qsp = findViewById(R.id.qspaperbtn);
        pdfb = findViewById(R.id.pdfbook);

        MemberList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminHomeScreen.this, MemberListScreen.class);
                startActivity(intent);
            }
        });
        BookList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminHomeScreen.this, BookListScreen.class);
                startActivity(intent);
            }
        });
        addbook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminHomeScreen.this, AddBookScreen.class);
                startActivity(intent);
            }
        });
        req.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminHomeScreen.this, BorrowRequestScreen.class);
                startActivity(intent);
            }
        });
        notice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminHomeScreen.this, NoticeScreen.class);
                startActivity(intent);
            }
        });
        logoutadmin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminHomeScreen.this, MainActivity.class);
                startActivity(intent);
            }
        });
        addpdfbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminHomeScreen.this, AddPdfScreen.class);
                startActivity(intent);
            }
        });
        qsp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminHomeScreen.this, QsPaperScreen.class);
                startActivity(intent);
            }
        });
        pdfb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminHomeScreen.this, PdfBookScreen.class);
                startActivity(intent);
            }
        });
    }
}