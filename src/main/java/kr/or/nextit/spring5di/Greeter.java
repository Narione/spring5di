package kr.or.nextit.spring5di;

public class Greeter {
	// 인사 형식 저장할 필드: "%s님 안녕하세요?"
	private String format;
	
	public void setFormat(String format) {
		this.format = format;
	}
	
	public String greet(String guest) {
		return String.format(format, guest);
	}
}
