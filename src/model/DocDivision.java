package model;

import model.ProcessDocument.StrategyDocument;
import model.SendDocumet.StrategySend;

/**
 * Created by bruno.devesa on 17-07-2015.
 */
public class DocDivision {

    private String name;
    private StrategyDocument strategyDocument;
    private StrategySend strategySend;
    private static DocDivision instance;

    private DocDivision(){
    }

    public static synchronized DocDivision getInstance(){
        if (instance == null){
            instance = new DocDivision();
            instance.setName("DocDivision_Porto");

        }
        return instance;
    }

    public String getName() {
        return instance.getName();
    }


    public void setName(String name) {
        this.name = name;
    }


}
