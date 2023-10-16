package com.example.myapplication.interfaces.bdd;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import com.example.myapplication.models.User;
import androidx.room.Query;
import java.util.List;
@Dao
public interface UserDao {
    @Insert
    void insertUser(User user);
    @Query("SELECT * FROM users")
    List<User> getAllUsers();

    @Delete
    void deleteUser(User user);
    
}
