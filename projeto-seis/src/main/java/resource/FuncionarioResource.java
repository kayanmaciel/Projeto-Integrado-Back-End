// Mude "br.com.farmacia.resource" para o nome do seu pacote
package resource; 

// IMPORTS CORRIGIDOS PARA JAKARTA
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.util.List;

import entity.Funcionario;

@Path("/funcionarios")
@Produces(MediaType.APPLICATION_JSON)
public class FuncionarioResource {

    @GET
    public List<Funcionario> listarTodos() {
        // O Panache torna isso super simples!
        return Funcionario.listAll(); 
    }
}