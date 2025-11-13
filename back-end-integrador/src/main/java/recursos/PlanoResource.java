// Use o nome do seu pacote
package recursos;

import entidades.Plano;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import java.util.List;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import java.net.URI;

@Path("/planos") // <-- Caminho base para a classe inteira
@Produces(MediaType.APPLICATION_JSON) // <-- Resposta padrão para a classe inteira
@Consumes(MediaType.APPLICATION_JSON) // <-- Entrada padrão para a classe inteira
public class PlanoResource {

    @GET // Este método responde a: GET /planos
    public List<Plano> listarTodos() {
        return Plano.listAll(); 
    }


    @POST // Este método responde a: POST /planos
    @Transactional
    public Response criarPlano(Plano plano) {
        
        plano.persist();

        URI createdUri = URI.create("/planos/" + plano.id);
        
        return Response.created(createdUri).entity(plano).build();
    }    
}