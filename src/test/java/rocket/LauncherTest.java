package rocket;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LauncherTest {
    @Test
    void sample() {
        assertEquals(1, 1);
    }

    @Test
    void givenExpiredLaunchCodes_RocketIsNotLaunched() {
        ExpiredLaunchCodeStub launchCode = new ExpiredLaunchCodeStub();
        RocketMock rocket = new RocketMock();

        Launcher.launchRocket(rocket, launchCode);

        rocket.verifyRocketNotLaunched();
    }


    @Test
    void givenUnsignedLaunchCodes_RocketIsNotLaunched() {
        UnsignedLaunchCodeStub launchCode = new UnsignedLaunchCodeStub();
        RocketMock rocket = new RocketMock();

        Launcher.launchRocket(rocket, launchCode);

        rocket.verifyRocketNotLaunched();
    }
}
