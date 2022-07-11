package main.java.one.digitalinnovation.jdbc;

import main.java.one.digitalinnovation.jdbc.configuration.DB;
import main.java.one.digitalinnovation.jdbc.dao.ClienteDAO;
import one.digitalinnovation.jdbc.entity.Cliente;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class BucarTodosClientesExecute {
    public static void main(String[] args) throws SQLException {
        try(Connection connection = DB.getConnection()) {
            ClienteDAO clienteDAO = new ClienteDAO(connection);
            List<Cliente> clientes = clienteDAO.buscarTodosOsClientes();
            System.out.println(clientes);
        }
    }
}
