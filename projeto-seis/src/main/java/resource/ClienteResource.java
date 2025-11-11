// Mude "br.com.farmacia.resource" para o nome do seu pacote
package resource; 

// IMPORTS CORRIGIDOS PARA JAKARTA
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.util.List;

import entity.Cliente;

@Path("/clientes")
@Produces(MediaType.APPLICATION_JSON)
public class ClienteResource {

    @GET
    public List<Cliente> listarTodos() {
        // O Panache torna isso super simples!
        return Cliente.listAll(); 
    }
}