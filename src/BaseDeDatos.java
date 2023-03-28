public class BaseDeDatos {

    private String nombre = "";
    private String token = "";

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    /**
     La propia clase BaseDeDatos va a ser la que contenga su propia y única instancia.
     Para eso vamos a definir un atributo static que el tipo va a ser la propia clase:
     🠋🠋🠋
     */
    private static BaseDeDatos instance = null;
    private BaseDeDatos() {

    }

    /**el método getInstance() será static para poder acceder directamente desde la clase Singleton */
    public static BaseDeDatos getInstance() {
        if (instance == null) {
            /** desde aqui si que puedo acceder al constructor
             porque estoy en la misma clase */
            instance = new BaseDeDatos();
        }
        return instance;
    }


}
