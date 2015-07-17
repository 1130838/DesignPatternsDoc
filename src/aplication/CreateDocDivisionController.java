package aplication;

import model.DocDivision;

/**
 * Created by bruno.devesa on 17-07-2015.
 */
public class CreateDocDivisionController {

    DocDivision docDivision;

    public DocDivision getSingletonDocDivision(){
        return DocDivision.getInstance();
    }
}
