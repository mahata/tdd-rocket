package rocket;

import java.util.HashSet;
import java.util.Set;

public class FakeSetUsedLaunchCodes implements UsedLaunchCodes {
    private Set<LaunchCode> launchCodes = new HashSet<>();

    @Override
    public boolean contains(LaunchCode launchCode) {
        // check if there's a corresponding key in Redis
        return launchCodes.contains(launchCode);
    }

    @Override
    public void push(LaunchCode launchCode) {
        // put launchCode to Redis
        launchCodes.add(launchCode);
    }
}
