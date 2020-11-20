package co.udea.edu.api.modelo;

import javax.persistence.*;


   // @Entity
   // @Table(name="usuarios")
    public class Usuario {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name="nombre")
        private int nombre;

        @Column(name="contrasena")
        private String contrasena;

        public int getNombre() {
            return nombre;
        }

        public String getContrasena() {
            return contrasena;
        }

        public void setContrasena(String contrasena) {
            this.contrasena = contrasena;
        }

        public void setNombre(int nombre) {
            this.nombre = nombre;
        }
    }





