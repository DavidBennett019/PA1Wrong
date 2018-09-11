import meggy.Meggy;

class PA5Test2 {
	public static void main(String[] args) {
		new TestClass().testMethod(Meggy.Color.VIOLET);
	}
}

class TestClass {
	public void testMethod(Meggy.Color color) {
		Meggy.Color c;
		c = color;
		if(c == Meggy.Color.VIOLET) {
			Meggy.setPixel((byte)1, (byte)2, c);
		}
	}
}