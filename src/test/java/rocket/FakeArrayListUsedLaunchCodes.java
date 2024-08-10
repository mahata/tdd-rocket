package rocket;

import java.util.ArrayList;

public class FakeArrayListUsedLaunchCodes implements UsedLaunchCodes {
    private ArrayList<LaunchCode> launchCodes = new ArrayList<>();

    @Override
    public boolean contains(LaunchCode launchCode) {
        return launchCodes.contains(launchCode);
    }

    @Override
    public void push(LaunchCode launchCode) {
        launchCodes.add(launchCode);
    }
}
