public class SubtractStrategy implements OperationStrategy {
    @Override
    public int execute(int left, int right) {
        return left - right;
    }
}