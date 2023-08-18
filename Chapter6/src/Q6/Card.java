package Q6;

public class Card {

	private int cardNumber;
	private static int serialNum = 202308070;
	
	Card(){
		serialNum++;
		cardNumber = serialNum;
	}

	public int getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(int cardNumber) {
		this.cardNumber = cardNumber;
	}

}
