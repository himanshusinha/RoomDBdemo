package com.webkodz.roomdb;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

import static android.icu.text.MessagePattern.ArgType.SELECT;

@Dao
public interface TaskDAO {

    List<TaskDB> getAllTasks();

    @Query("SELECT * FROM TaskDB")
    @Insert
    void insert(TaskDB taskDB);

    @Update
    void update(TaskDB taskDB);

    @Delete
    void delete(TaskDB taskDB);




}
