package rocket;

public class ExpiredLaunchCodeStub extends ValidLaunchCodeStub {

    @Override
    public boolean isExpired() {
        return true;
    }
}
