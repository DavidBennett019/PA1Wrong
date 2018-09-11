import meggy.Meggy;

class PA5Test3 {
	public static void main(String[] args) {
		new TestClass1().testMethod1();
	}
}

class TestClass1 {
	public void testMethod1() {
		TestClass2 tc;
		tc = new TestClass2();
		tc.testMethod2();
	}
}

class TestClass2 {
	public void testMethod2() {
		Meggy.setPixel((byte)4, (byte)3, Meggy.Color.RED);
		Meggy.setPixel((byte)4, (byte)4, Meggy.Color.GREEN);
		Meggy.setPixel((byte)3, (byte)3, Meggy.Color.BLUE);
		Meggy.setPixel((byte)3, (byte)4, Meggy.Color.YELLOW);
	}
}