package com.main.sbp.entity.book;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="BOOK_TBL")
public class Book {
	
	@Id
	private int id;
	private String bookName;

}
