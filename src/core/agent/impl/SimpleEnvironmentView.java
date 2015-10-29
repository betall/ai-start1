package core.agent.impl;

import core.agent.Action;
import core.agent.Agent;
import core.agent.EnvironmentState;
import core.agent.EnvironmentView;

/**
 * Created by 001vk on 28.10.2015.
 */
public class SimpleEnvironmentView implements EnvironmentView{
    @Override
    public void agentActed(Agent agent, Action action,
                           EnvironmentState resultingState){
        System.out.println("Agent acted: "+action.toString());
    }

    @Override
    public void agentAdded(Agent agent, EnvironmentState resultingState){ System.out.println("Agent added.");}

    @Override
    public void notify(String msg) { System.out.println("Message: "+msg);}
}
