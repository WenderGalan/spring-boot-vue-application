package io.github.wendergalan.SpringBootVueApplication.repositories;

import io.github.wendergalan.SpringBootVueApplication.models.entities.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends JpaRepository<Todo, Long> {
}
