package pe.edu.utp.jsfhellodevs.model;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 * Created by PT116-ORACLE on 18/03/2016.
 */
@ManagedBean(name = "helloBean", eager = true)
@SessionScoped
public class HelloEntity {
    private String message = "Welcome Developers!";

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
