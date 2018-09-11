import meggy.Meggy;

class PA5Test1 {
	public static void main(String[] args) {
		new TestClass().testMethod();
	}
}

class TestClass {
	public void testMethod(){
		int i;
		int j;
		if(i == j) {
			Meggy.setPixel((byte)0, (byte)0, Meggy.Color.RED);
		}
		else {
			Meggy.setPixel((byte)0, (byte)0, Meggy.Color.BLUE);
		}
	}
}