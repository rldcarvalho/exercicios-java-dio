package main.java.one.digitalinnovation.jdbc;

import one.digitalinnovation.jdbc.configuration.DB;
import one.digitalinnovation.jdbc.dao.ClienteDAO;

import main.java.java.sql.Connection;
import main.java.java.sql.SQLException;

public class IserirUmNovoClienteExecute {
    public static void main(String[] args) throws SQLException {
        try(Connection connection = DB.getConnection()) {
            ClienteDAO clienteDAO = new ClienteDAO(connection);
            clienteDAO.inserirNovoCliente("Joao");
        }
    }
}
