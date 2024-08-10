package rocket;

public interface UsedLaunchCodes {
    boolean contains(LaunchCode launchCode);
    void push(LaunchCode launchCode);
}
