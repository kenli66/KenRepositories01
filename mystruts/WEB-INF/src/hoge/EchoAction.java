package hoge;

public class EchoAction {
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	//2nd test for git checkout and reset.
	// 3rd test for git checkout and reset.
	//4th test for git checkout and reset.
	//5th test for git checkout and reset.
	public String execute() {
		System.out.println("call execute. " + "message=" + message);
		return "ok";
	}
}
