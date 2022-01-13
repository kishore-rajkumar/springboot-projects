package com.kishore.springboot.projects;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BookRepositoryCommandLineRunner implements CommandLineRunner {

	private static final Logger logger = LoggerFactory.getLogger(BookRepositoryCommandLineRunner.class);

	private final BookRepository bookRepository;

	public BookRepositoryCommandLineRunner(BookRepository bookRepository) {
		super();
		this.bookRepository = bookRepository;
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info(".... Fetching books");
		logger.info("isbn-1234 -->" + bookRepository.getByIsbn("isbn-1234"));
		logger.info("isbn-4567 -->" + bookRepository.getByIsbn("isbn-4567"));
		logger.info("isbn-1234 -->" + bookRepository.getByIsbn("isbn-1234"));
		logger.info("isbn-4567 -->" + bookRepository.getByIsbn("isbn-4567"));
		logger.info("isbn-1234 -->" + bookRepository.getByIsbn("isbn-1234"));
		logger.info("isbn-1234 -->" + bookRepository.getByIsbn("isbn-1234"));
	}

}
