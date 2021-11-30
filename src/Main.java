import com.ruth.model.Clientes;
import dao.ClienteDao;
import util.ConectorBD;

import java.sql.Connection;
import java.util.List;

public class Main {
    private static Object Clientes;

    public static  void main(String[] args){
        //Clientes laura = new Clientes("1458", "laura pozo", "Cochabamba", "Av. Ayacucho s/n", "4687678"  );
        //Clientes jose = new Clientes("1459", "jose marca", "Beni", "Av. Beni s/n", "4576899"  );
        //Clientes mario = new Clientes("1460", "mario campos", "Pando", "Av. Pando s/n", "4768798"  );
        //Clientes mariana = new Clientes("1461", "mariana soiga", "La Paz", "Av. La Paz s/n", "4779999"  );
        //Clientes soledad = new Clientes("1462", "soledad castro", "Chuquisaca", "Av. Chuquisaca s/n", "4325465"  );
        //Clientes ayumi = new Clientes("1463", "ayumi kiro", "Santa Cruz", "Av. Santa Cruz s/n", "4676887"  );
        //Clientes neidy = new Clientes("1464", "neidy lopez", "Potosi", "Av. Potosi s/n", "4787988"  );

        // CRUD TABLA CLIENTES
        ClienteDao clienteDao = new ClienteDao();
       // clienteDao.addClientes(laura);
        //clienteDao.addClientes(jose);
        //clienteDao.addClientes(mario);
        //clienteDao.addClientes(mariana);
        //clienteDao.addClientes(soledad);
        //clienteDao.addClientes(ayumi);
        //clienteDao.addClientes(neidy);
        // READ
       /*
        List<Clientes> clientes = clienteDao.getALLClientes();
        for (int i = 0; i< clientes.size(); i++){
            Clientes cliente = clientes.get((Integer) Clientes);
            System.out.println(cliente);
        }
        */

        //UPDATE
        //Clientes clientes = new Clientes("1458", "Fernando Torrico", "Oruro", "Av. 6 de Agosto s/n", "44444444");
        //clienteDao.updateClientes(clientes);
    //DELETE
        clienteDao.deleteClientes("1458");
        clienteDao.deleteClientes("1456-1B");

    }
}
