package co.udea.edu.api.servicio;

import co.udea.edu.api.DAO.UsuarioDAO;
import co.udea.edu.api.DTO.UsuarioDTO;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.test.context.junit4.SpringRunner;

import static org.mockito.Mockito.when;

@RunWith(SpringRunner.class)
public class TestUsuarioServicio {
    @Mock
    UsuarioDAO mockDAO;

    @Test
    public void debeRetornarUsuarioAutenticadoCuandoNoHayaError(){
        //Arrange
        //mockDAO = new UsuarioDAO();
        String obtenido="";
        String esperado="Usuario Autenticado";
        when(mockDAO.autenticar("usuario", "password")).thenReturn("OK");
        UsuarioDTO usuarioDTO = new UsuarioDTO();
        UsuarioServicio usuarioServicio = new UsuarioServicioImpl();
        //Act
        obtenido = usuarioServicio.autenticar("usuario","password");
        //Assert
        Assert.assertEquals(esperado,obtenido);
    }
}
