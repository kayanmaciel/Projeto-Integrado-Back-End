// Mude "br.com.farmacia.resource" para o nome do seu pacote
package resource; 

// IMPORTS CORRIGIDOS PARA JAKARTA
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.util.List;

import entity.Medicamento;

@Path("/medicamentos")
@Produces(MediaType.APPLICATION_JSON)
public class MedicamentoResource {

    @GET
    public List<Medicamento> listarTodos() {
        // O Panache torna isso super simples!
        return Medicamento.listAll(); 
    }
}