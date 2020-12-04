package com.webkodz.roomdb;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {TaskDB.class},version = 1)
public abstract class AppDataBase extends RoomDatabase {
    public  TaskDAO taskDAO;


}
