package exday4;

public class SampleEx401 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		CellPhone cp = new CellPhone("hoge@email.com", "090-1234-5678");
		cp.call("011-123-456");
		cp.sendMail("fuga@email.com");
		IPhone phone = (IPhone)cp;
		phone.call("011-987-6543");
		IEmail mail = (IEmail)cp;
		mail.sendMail("bar@email.com");
	}

}
