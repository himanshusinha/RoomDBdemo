package com.webkodz.roomdb;

import android.content.Context;

import androidx.room.Room;
import androidx.room.RoomDatabase;

public class DataBaseClient {
    private Context context;
    private DataBaseClient dataBaseClient;
    private AppDataBase appDataBase;

    private DataBaseClient(Context context) {
        this.context = context;
        appDataBase = Room.databaseBuilder(context, AppDataBase.class, "MyToDo").build();
    }




    public AppDataBase getAppDataBase() {
        return appDataBase;
    }
}
