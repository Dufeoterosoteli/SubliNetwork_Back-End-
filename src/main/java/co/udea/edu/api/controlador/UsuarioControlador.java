package co.udea.edu.api.controlador;


import co.udea.edu.api.servicio.UsuarioServicio;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("api/usuarios")
public class UsuarioControlador {
    private UsuarioServicio usuarioServicio;

    public UsuarioControlador(UsuarioServicio usuarioServicio) {
        this.usuarioServicio = usuarioServicio;
    }

    @GetMapping()
    public String autenticar(@RequestParam String nombre, @RequestParam String pass){
        return usuarioServicio.autenticar(nombre,pass);
    }
}
