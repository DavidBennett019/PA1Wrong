import meggy.Meggy;

class PA4Test3 {
	public static void main(String[] args) {
		if(new BooleanReturner().returnBool(true)) {
			Meggy.setPixel((byte)0, (byte)0, Meggy.Color.RED);
		}
	}
}

class BooleanReturner {
	public boolean returnBool(boolean input) {
		return input;
	}
}