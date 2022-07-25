package fairyShop;

import fairyShop.core.engines.Engine;
import fairyShop.core.engines.EngineImpl;

public class Main {
    public static void main(String[] args) {
        Engine engine = new EngineImpl();
        engine.run();
    }
}
