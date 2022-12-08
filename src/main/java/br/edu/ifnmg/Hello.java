package br.edu.ifnmg;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 * @author GahFerreira
 */

@WebService
public class Hello {
    
    @WebMethod
    public String bonjour(@WebParam String name)
    {
        return "Bonjour " + name;
    }
}
