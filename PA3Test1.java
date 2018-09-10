import meggy.Meggy;
class PA3Test1 {
	public static void main(String[] args) {
		Meggy.setPixel((byte)1,(byte)1, Meggy.Color.RED);
		Meggy.delay(500);
		Meggy.setPixel((byte)1,(byte)1, Meggy.Color.DARK);
		Meggy.setPixel((byte)1,(byte)2, Meggy.Color.ORANGE);
		Meggy.delay(500);
		Meggy.setPixel((byte)1,(byte)2, Meggy.Color.DARK);
		Meggy.setPixel((byte)1,(byte)3, Meggy.Color.YELLOW);
		Meggy.delay(500);
		Meggy.setPixel((byte)1,(byte)3, Meggy.Color.DARK);
		Meggy.setPixel((byte)1,(byte)4, Meggy.Color.GREEN);
		Meggy.delay(500);
		Meggy.setPixel((byte)1,(byte)4, Meggy.Color.DARK);
		Meggy.setPixel((byte)1,(byte)5, Meggy.Color.BLUE);
		Meggy.delay(500);
		Meggy.setPixel((byte)1,(byte)5, Meggy.Color.DARK);
		Meggy.setPixel((byte)1,(byte)6, Meggy.Color.VIOLET);
		Meggy.delay(500);
		Meggy.setPixel((byte)1,(byte)6, Meggy.Color.DARK);
	}
}