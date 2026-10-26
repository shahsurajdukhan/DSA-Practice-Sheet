interface Calling {
    void makeCall();
}

interface Camera {
    void takePhoto();
}

class Smartphone implements Calling, Camera {

    @Override
    public void makeCall() {
        System.out.println("Making a call");
    }

    @Override
    public void takePhoto() {
        System.out.println("Taking a Photo");
    }
}


public class constructorexample {
    static void main() {
        Smartphone phone = new Smartphone();

        phone.makeCall();
        phone.takePhoto();
    }
}
