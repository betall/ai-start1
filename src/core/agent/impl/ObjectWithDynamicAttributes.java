package core.agent.impl;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author Ravi Mohan
 * @author Ciaran O'Reilly
 * @author Mike Stampone
 */
public class ObjectWithDynamicAttributes {
    private Map<Object, Object> attributes = new LinkedHashMap<Object, Object>();
    //
    // PUBLIC METHODS
    //

    /**
     * By default, returns the simple name of the underlying class as given in
     * the source code.
     *
     * @return the simple name of the underlying class
     */
    public String describeAttributes(){
        StringBuilder sb = new StringBuilder();

        sb.append("[");
        boolean first = true;
        for(Object key : attributes.keySet()){
            if(first){
                first = false;
            }else{
                sb.append(", ");
            }

            sb.append(key);
            sb.append("==");
            sb.append(attributes.get(key));
        }
        sb.append("]");

        return sb.toString();
    }

    /**
     * Returns an unmodifiable view of the object's key set
     *
     * @return an unmodifiable view of the object's key set
     */
    public Set<Object> getKeySet(){ return Collections.unmodifiableSet(attributes.keySet());}

    /**
     * Associates the specified value with the specified attribute key. If the
     * ObjectWithDynamicAttributes previously contained a mapping for the
     * attribute key, the old value is replaced.
     *
     * @param key
     *            the attribute key
     * @param value
     *            the attribute value
     */
    public void setAttribute(Object key, Object value) {
        attributes.put(key, value);
    }
}
