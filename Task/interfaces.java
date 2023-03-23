package Task;
class Phone {
    public void call(String number) {
        System.out.println("Calling " + number + "...");
    }
    
    public void sms(String number, String message) {
        System.out.println("Sending a text message to " + number + ": " + message);
    }
}


interface Camera {
    public void click();
    public void record();
}


 interface MusicPlayer {
    public void play();
    public void stop();
}


 class SmartPhone extends Phone implements Camera, MusicPlayer {
    public void click() {
        System.out.println("Taking a photo...");
    }
    
    public void record() {
        System.out.println("Recording a video...");
    }
    
    public void play() {
        System.out.println("Playing music...");
    }
    
    public void stop() {
        System.out.println("Stopping music...");
    }
}

// Test the SmartPhone class
public class interfaces {
    public static void main(String[] args) {
        SmartPhone myPhone = new SmartPhone();
        myPhone.call("8440923923");
        myPhone.sms("8440923923", "Hello!");
        myPhone.click();
        myPhone.record();
        myPhone.play();
        myPhone.stop();
    }
}