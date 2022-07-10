package L05_Polymorphism.exercise.P05Calculator.Operation;

public interface Operation {
    void addOperand(int operand);
    int getResult();
    boolean isCompleted();
}
