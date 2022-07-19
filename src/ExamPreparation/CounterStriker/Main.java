package ExamPreparation.CounterStriker;

import ExamPreparation.CounterStriker.core.EngineImpl;
import ExamPreparation.CounterStriker.core.Engine;

public class Main {
    public static void main(String[] args) {
        Engine engine = new EngineImpl();
        engine.run();
    }
}
