package rocket;

public class ValidLaunchCodeStub implements LaunchCode{
    @Override
    public boolean isExpired() {
        return false;
    }

    @Override
    public boolean isSigned() {
        return true;
    }
}
