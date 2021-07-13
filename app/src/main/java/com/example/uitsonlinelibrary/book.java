package com.example.uitsonlinelibrary;

import android.widget.EditText;

public class book {
    String bookname,writter,edition,location;

    public book() {

    }

    public book(String bookname, String writter, String edition, String location) {
        this.bookname = bookname;
        this.writter = writter;
        this.edition = edition;
        this.location = location;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public String getWritter() {
        return writter;
    }

    public void setWritter(String writter) {
        this.writter = writter;
    }

    public String getEdition() {
        return edition;
    }

    public void setEdition(String edition) {
        this.edition = edition;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
