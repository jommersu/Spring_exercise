package com.start.wenda;

import com.start.wenda.DAO.UserDAO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@Sql("/init-schema.sql")
public class testdatabase {
	@Autowired
	UserDAO userDAO;

	@Test
	public void testdatabase () {
	}

}
