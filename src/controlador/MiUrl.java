
package controlador;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import vista.Inicio;


/**
 *
 * @author Mitchel
 */
public class MiUrl {


public void MiDireccion(String direccion){
     try {
            URL url = new URL(direccion);
            URI uri = url.toURI();
            Desktop.getDesktop().browse(uri);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (URISyntaxException ex) {
            Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
        }
}
    
}
