
package presentation;

import aplication.CreateDocDivisionController;
import model.*;

/**
 * Created by brunodevesa on 15/07/15.
 */
public class MainUI {

    public void run() {

        System.out.println("creating a singleton instance of DocDivision");
        CreateDocDivisionController createDocDivisionController = new CreateDocDivisionController();
        DocDivision docDivision = createDocDivisionController.getSingletonDocDivision();
        DocDivision docDivision2 = createDocDivisionController.getSingletonDocDivision();

        System.out.println("hello i'm DocDivision created by singleton and my name is " + docDivision.getName());
        System.out.println("hello i'm DocDivision created by singleton and my name is " + docDivision2.getName());

    }


}


