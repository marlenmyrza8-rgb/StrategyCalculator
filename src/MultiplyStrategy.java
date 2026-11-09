public class MultiplyStrategy implements OperationStrategy {
    @Override
    public int execute(int left, int right) {
        return left * right;
    }
}