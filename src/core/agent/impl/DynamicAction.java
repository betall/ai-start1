package core.agent.impl;

import core.agent.Action;

/**
 * @author Ciaran O'Reilly
 * @author Mike Stampone
 */
public class DynamicAction extends ObjectWithDynamicAttributes implements Action{

    public static final String ATTRIBUTE_NAME = "name";

    public DynamicAction(String name){
        this.setAttribute(ATTRIBUTE_NAME, name);
    }

    //
    // START-Action
    public boolean isNoOp(){return false;}
}
