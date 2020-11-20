package co.udea.edu.api.servicio;

import co.udea.edu.api.DAO.UsuarioDAO;
import co.udea.edu.api.modelo.Usuario;
import org.springframework.stereotype.Service;

@Service
class UsuarioServicioImpl implements UsuarioServicio{
private UsuarioDAO usuarioDAO;

    @Override
    public String autenticar(String nombre, String pass) {
        Usuario usuario = new Usuario();
        usuarioDAO = new UsuarioDAO();
        String mensaje="";
        try{
            mensaje = usuarioDAO.autenticar(nombre, pass);
            if (mensaje != null){
                mensaje = "Usuario Autenticado";
            }
        }catch (Exception e){
            mensaje="Usuario no Autenticado";
        }
        return mensaje;
    }
}
