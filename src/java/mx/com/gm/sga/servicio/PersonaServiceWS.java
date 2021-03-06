package mx.com.gm.sga.servicio;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebService;
import mx.com.gm.sga.domain.Persona;

@WebService
public interface PersonaServiceWS {
    
    @WebMethod
    public List<Persona> listarPersonas();
    
    @WebMethod
    public Persona encontrarPersonaPorId(Persona persona);

    @WebMethod
    public Persona encontrarPersonaPorEmail(Persona persona);
    
    @WebMethod
    public void registrarPersona(Persona persona);
    
    @WebMethod
    public void modificarPersona(Persona persona);
    
    @WebMethod
    public void eliminarPersona(Persona persona);
}
