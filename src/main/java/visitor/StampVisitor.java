package visitor;

import java.util.Map;

public class StampVisitor<T> implements Visitor<T>{

    @Override
    public Map<String, String> onSignature(Task<T> task) {
        return null;
    }

    @Override
    public Map<String, String> onGroupStart(Task<T> task) {
        return null;
    }

    @Override
    public Map<String, String> onGroupEnd(Task<T> task) {
        return null;
    }
}
