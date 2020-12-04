package com.webkodz.roomdb;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.io.Serializable;

@Entity
public class TaskDB implements Serializable {

    @PrimaryKey(autoGenerate = true)
    int id;

    @ColumnInfo(name = "task")
    String task;

    @ColumnInfo(name = "description")
    String description;

    @ColumnInfo(name = "finish_by")
    String finish_by;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getFinish_by() {
        return finish_by;
    }

    public void setFinish_by(String finish_by) {
        this.finish_by = finish_by;
    }
}
