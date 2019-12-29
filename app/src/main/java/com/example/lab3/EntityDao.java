package com.example.lab3;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface EntityDao {
    @Query("SELECT * FROM EntityData")
    List<EntityData> getAll();

    @Query("SELECT * FROM EntityData WHERE id = :id")
    EntityData getById(long id);

    @Insert
    void insert(EntityData entity);

    @Update
    void update(EntityData entity);

    @Delete
    void delete(EntityData entity);
}
