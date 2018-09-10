import meggy.Meggy;

class PA4Test2 {
	public static void main(String[] args) {
		Meggy.setPixel((byte)0, (byte)0, new Test().returnBlue());
		Meggy.setPixel((byte)0, (byte)1, new Test().returnGreen());
	}
}

class Test {
	public Meggy.Color returnBlue() { 
		return Meggy.Color.BLUE;
	}

	public Meggy.Color returnGreen() {
		return Meggy.Color.GREEN;
	}
}