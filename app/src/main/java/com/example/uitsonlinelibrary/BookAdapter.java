package com.example.uitsonlinelibrary;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class BookAdapter extends RecyclerView.Adapter<BookAdapter.MyViewHolder> {

    Context contextb;
    ArrayList<book> list;
    public BookAdapter(Context context1, ArrayList<book> list) {
        this.contextb = context1;
        this.list = list;
    }
    @NonNull
    @Override
    public BookAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(contextb).inflate(R.layout.bookmodel,parent,false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        book book = list.get(position);
        holder.bookname.setText(book.getBookname());
        holder.writter.setText(book.getWritter());
        holder.edition.setText(book.getEdition());
        holder.location.setText(book.getLocation());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        TextView bookname,writter,edition,location;


        public MyViewHolder(@NonNull  View itemView) {
            super(itemView);

            bookname = itemView.findViewById(R.id.bookname);
            writter = itemView.findViewById(R.id.writtername);
            edition = itemView.findViewById(R.id.edition);
            location=itemView.findViewById(R.id.location);
        }
    }

}



