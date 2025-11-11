package recursos;

import entidades.Plano;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import java.util.List;

@Path("planos") // endpoint para acessar planos
public class PlanoRecurso {

    @GET
    public List<Plano> listarPlanos() {
        return Plano.listAll(); // retorna todos os planos do banco
    }
}
