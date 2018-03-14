package com.dome.testcontainers;

import org.junit.Test;
import org.testcontainers.containers.MySQLContainer;

public class MySQLTest {

    @Test
    public void testSelect() {
        MySQLContainer mysql = new MySQLContainer("mysql:5.5");

        mysql.start();
        mysql.stop();

    }

}
