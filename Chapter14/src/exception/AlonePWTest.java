package exception;

public class AlonePWTest {
	private String password;
	
	public String getPassword(){
		return password;
	}
	
	public void setPassword(String password) throws PasswordException{
		
		if(password == null){
			throw new PasswordException("비밀번호는 null일 수 없습니다.");
		}
		else if( password.length() < 5){
			throw new PasswordException("비밀번호는 5글자 이하일 수 없습니다.");
		}
		else if (password.matches("[a-zA-Z]+")){
			throw new PasswordException("비밀번호는 문자열로만 이루어 질 수 없습니다.");
		}
		
		this.password = password;
	}
	
	public static void main(String[] args) {

		AlonePWTest test = new AlonePWTest();
		String password = null;
		try {
			test.setPassword(password);
		} catch (PasswordException e) {
			System.out.println(password + " : " + e.getMessage());
		}
		
		password = "abcd";
		try {
			test.setPassword(password);
		} catch (PasswordException e) {
			System.out.println(password + " : " + e.getMessage());
		}
		
		password = "abcde";
		try {
			test.setPassword(password);
		} catch (PasswordException e) {
			System.out.println(password + " : " + e.getMessage());
		}
		
		password = "abcde1";
		try {
			test.setPassword(password);
		} catch (PasswordException e) {
			System.out.println(password + " : " + e.getMessage());
		}
	}
}

