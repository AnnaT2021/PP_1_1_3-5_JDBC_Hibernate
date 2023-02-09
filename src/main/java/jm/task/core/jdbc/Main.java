package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.util.Util;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        Util.getConnection();

        UserDao userDao = new UserDaoJDBCImpl();
        userDao.createUsersTable();
        userDao.saveUser("Ivan", "Petrov", (byte) 20);
        userDao.saveUser("Petr", "Ivanov", (byte) 25);
        userDao.saveUser("Semen", "Sidirov", (byte) 31);
        userDao.saveUser("Mariya", "Kuznetsova", (byte) 38);
        userDao.removeUserById(1);
        userDao.getAllUsers();
        userDao.cleanUsersTable();
        userDao.dropUsersTable();
        userDao.dropUsersTable();

    }
}
