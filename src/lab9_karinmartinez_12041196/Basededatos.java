
package lab9_karinmartinez_12041196;

import java.util.ArrayList;

public class Basededatos {
    public ArrayList <Usuarios> usuarios = new ArrayList();
    public String Ingresado;

    public Basededatos() {
        String nombre= "Karin", usuario="admin", contraseña="1234", tipo="Administrador";
        int edad= 18;
        Usuarios admin= new Usuarios(usuario, contraseña, nombre, tipo, edad);
        addUsuario(admin);
    }
    
    
    public ArrayList<Usuarios> getUsuario() {
        return usuarios;
    }

    public void setUsuario(ArrayList<Usuarios> usuarios) {
        this.usuarios = usuarios;
    }

    public ArrayList<Usuarios> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(ArrayList<Usuarios> usuarios) {
        this.usuarios = usuarios;
    }

    public String getIngresado() {
        return Ingresado;
    }

    public void setIngresado(String Ingresado) {
        this.Ingresado = Ingresado;
    }
    
    public void addUsuario (Usuarios usuario){
        usuarios.add(usuario);
    }
    
}
