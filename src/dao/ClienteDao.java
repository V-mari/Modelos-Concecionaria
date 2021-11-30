package dao;

import com.ruth.model.Clientes;
import util.ConectorBD;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ClienteDao {
    private Connection connection;
    public ClienteDao(){
         connection= ConectorBD.getConnection();
    }
    public void addClientes(Clientes clientes){
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(
                    "INSERT INTO Clientes (nif, nombre, ciudad, direccion, telefono) VALUES (?, ?, ?, ?, ?)");
            preparedStatement.setString (1, clientes.getNif());
            preparedStatement.setString(2, clientes.getNombre());
            preparedStatement.setString(3, clientes.getCiudad());
            preparedStatement.setString(4, clientes.getDireccion());
            preparedStatement.setInt(5, clientes.getTelefono());
            preparedStatement.executeUpdate();
            System.out.println(clientes + "creado");

        } catch (SQLException e){
            System.out.println("Error al crear el cliente: " + e.getMessage());
        }
    }

    public  void updateClientes(Clientes clientes){


        try {
            PreparedStatement preparedStatement = connection.prepareStatement(
                    "UPDATE clientes SET nif=?, nombre=?, ciudad=?, direccion=? telefono=? WHERE nif=?"
            );
            preparedStatement.setString (1, clientes.getNif());
            preparedStatement.setString(2, clientes.getNombre());
            preparedStatement.setString(3, clientes.getCiudad());
            preparedStatement.setString(4, clientes.getDireccion());
            preparedStatement.setInt(5, clientes.getTelefono());
            preparedStatement.setString(6, clientes.getNif());
            preparedStatement.executeUpdate();
            System.out.println(clientes + "editado");

        } catch (SQLException e){
            System.out.println("Error al crear el cliente: " + e.getMessage());
        }
    }

    public  void deleteClientes(String nif){


        try {
            PreparedStatement preparedStatement = connection.prepareStatement(
                    "DELETE FROM clientes WHERE nif=?"
            );
            preparedStatement.setString (1, nif);
            preparedStatement.executeUpdate();
            System.out.println(nif + "eliminado");

        } catch (SQLException e){
            System.out.println("Error al crear el cliente: " + e.getMessage());
        }
    }

    public List<Clientes> getALLClientes(){
        List<Clientes> Clientes  = new ArrayList<>();
        try{
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM clientes");
            while (resultSet.next()) {
              Clientes clientes = new Clientes("1458", "Carlos Peres", "Cochabamba", "Av. Ayacucho s/n", "A");
              clientes.setNif(resultSet.getString("nif"));
                clientes.setNombre(resultSet.getString("nombre"));
                clientes.setCiudad(resultSet.getString("ciudad"));
                clientes.setDireccion(resultSet.getString("direccion"));
                clientes.setTelefono(resultSet.getInt("telefono"));

                clientes.add(clientes);

            }

        } catch (SQLException e){
            System.out.println("Error al listar los clientes" + e.getMessage());

        }

        return Clientes;
    }

}
