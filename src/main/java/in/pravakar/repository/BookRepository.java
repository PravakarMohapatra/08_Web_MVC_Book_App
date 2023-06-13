package in.pravakar.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import in.pravakar.entity.Book;

public interface BookRepository extends  JpaRepository<Book, Integer>{

}
