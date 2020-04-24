package polymorphism;

public class SamsungTV implements TV {
	private Speaker speaker;
	private int price;

	public SamsungTV() {
		System.out.println("===> SamsungTV(1) 객체 생성");
	}
	public void setSpeaker(Speaker speaker) {
		System.out.println("===> setSpeaker() 호출");
		this.speaker = speaker;
	}
	public void setPrice(int price) {
		System.out.println("===> setPrice() 호출");
		this.price = price;
	}
	public SamsungTV(SonySpeaker speaker) {
		System.out.println("===> SamsungTV(2) 객체 생성");
	}
	@Override
	public void powerOn() {
		System.out.println("SamsungTV--------  전원을 켠다. (가격 : " + price + ")");
	}
	@Override
	public void powerOff() {
		System.out.println("SamsungTV--------  전원을 끈다");
	}

	@Override
	public void volumeUp() {
		speaker.volumeUp();
		System.out.println("SamsungTV--------  소리를 올린다.");
	}

	@Override
	public void volumeDown() {
		speaker.volumeDown();
		System.out.println("SamsungTV--------  소리를 내린다.");
	}
}
