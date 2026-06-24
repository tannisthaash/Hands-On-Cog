package CommandPatternExample;

public class CommandTest {
    public static void main(String[] args) {
        Light light = new Light();
        //commands
        Command lightOn = new LightOnCommand(light);
        Command lightOff = new LightOffCommand(light);
        // invoker
        RemoteControl remote = new RemoteControl();
        //Turn ON light
        remote.setCommand(lightOn);
        remote.pressButton();
        //Turn OFF light
        remote.setCommand(lightOff);
        remote.pressButton();
    }
}
