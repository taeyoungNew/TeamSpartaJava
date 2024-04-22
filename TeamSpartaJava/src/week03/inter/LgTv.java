package week03.inter;

public class LgTv extends Tv implements MultiRemoteController {

    public LgTv(String company) {
        super(company);
    }

    @Override
    public void turnOnOff() {
        setPower(!isPower ());
        displayPower(getCompany(), isPower());
    }

    @Override
    public void channelUp() {
    	 System.out.println("채널올리기");
        setChannel(getChannel() + 1);
        displayChannel(getChannel());
    }

    @Override
    public void channelDown() {
    	 System.out.println("채널내리기");
    	 setChannel(getChannel() - 1);
        displayChannel(getChannel());
    }

    @Override
    public void volumeUp() {
    	 System.out.println("볼륨올리기");
        setVolume(getVolume() + 1);
        displayVolume(getVolume());
    }

    @Override
    public void volumeDown() {
    	 System.out.println("볼륨내리기");
        setVolume(getVolume() - 1);
        displayVolume(getVolume());
    }
}