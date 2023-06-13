package in.pravakar.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "book_tbl")
@Data
public class Book {
	
	@Id
	private Integer bookId;
	private String bookName;
	private Double bookPrice;
	

}
