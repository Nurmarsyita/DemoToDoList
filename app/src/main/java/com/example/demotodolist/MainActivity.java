package com.example.demotodolist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.demotodolist.CustomAdapter;
import com.example.demotodolist.R;
import com.example.demotodolist.ToDoItem;

import java.util.ArrayList;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    ListView lvTodoList;
    ArrayList<ToDoItem> alToDoList;
    CustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvTodoList = findViewById(R.id.listViewList);
        alToDoList = new ArrayList<>();

        Calendar date1 = Calendar.getInstance();
        date1.set(2020,8,1);
        Calendar date2 = Calendar.getInstance();
        date2.set(2020,8,2);

        ToDoItem item1 = new ToDoItem("Go for movie", date1);
        ToDoItem item2 = new ToDoItem("Go for haircut",date2);

        alToDoList.add(item1);
        alToDoList.add(item2);

        adapter = new CustomAdapter(this, R.layout.row, alToDoList);

        lvTodoList.setAdapter(adapter);
    }
}