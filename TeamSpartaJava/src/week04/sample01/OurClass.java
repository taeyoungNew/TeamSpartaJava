package week04.sample01;

public class OurClass {
	private final boolean just = true;
	
	// throws : 던지다( = 예외를 던지다 or 발생시키다)
	// throws를 통해 에러플래그를 달아준다.
	public void thisMethodIsDangerous() throws OurBadException {
		if(just) {
			throw new OurBadException();
		}
	}
}
