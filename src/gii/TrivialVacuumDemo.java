package gii;

import core.agent.Environment;
import core.agent.EnvironmentView;
import core.agent.impl.SimpleEnvironmentView;
import core.environment.vacuum.VacuumEnvironment;

/**
 * Created by 001vk on 28.10.2015.
 */
public class TrivialVacuumDemo {
    public static void main(String[] args){
        //create environment with random state of cleaning
        Environment env = new VacuumEnvironment();
        EnvironmentView view = new SimpleEnvironmentView();
    }
}
