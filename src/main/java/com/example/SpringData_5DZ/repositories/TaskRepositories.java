package com.example.SpringData_5DZ.repositories;
import com.example.SpringData_5DZ.model.Task;
import com.example.SpringData_5DZ.model.Status;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface TaskRepositories extends JpaRepository<Task, Long> {

    List<Task> findByStatus(Status status);
}
