package core.environment.vacuum;

import core.agent.Action;
import core.agent.impl.AbstractEnvironment;
import core.agent.impl.DynamicAction;

/**
 * Artificial Intelligence A Modern Approach (3rd Edition): pg 58.<br>
 * <br>
 * Let the world contain just two locations. Each location may or may not
 * contain dirt, and the agent may be in one location or the other. There are 8
 * possible world states, as shown in Figure 3.2. The agent has three possible
 * actions in this version of the vacuum world: <em>Left</em>, <em>Right</em>,
 * and <em>Suck</em>. Assume for the moment, that sucking is 100% effective. The
 * goal is to clean up all the dirt.
 *
 * @author Ravi Mohan
 * @author Ciaran O'Reilly
 * @author Mike Stampone
 */
public class VacuumEnvironment extends AbstractEnvironment{
    // Allowable Actions within the Vacuum Environment
    public static final Action ACTION_MOVE_LEFT = new DynamicAction("Left");
    public static final Action ACTION_MOVE_RIGHT = new DynamicAction("Right");
    public static final Action ACTION_SUCK = new DynamicAction("Suck");
    public static final String LOCATION_A = "A";
    public static final String LOCATION_B = "B";
}
