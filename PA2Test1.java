import meggy.Meggy;

class PA2Test1 {
	public static void main(String[] args) {
		Meggy.setPixel((byte)1, (byte)0, Meggy.Color.RED);
		Meggy.setPixel((byte)1, (byte)1, Meggy.Color.ORANGE);
		Meggy.setPixel((byte)1, (byte)2, Meggy.Color.YELLOW);
		Meggy.setPixel((byte)1, (byte)3, Meggy.Color.GREEN);
		Meggy.setPixel((byte)1, (byte)4, Meggy.Color.BLUE);
		Meggy.setPixel((byte)1, (byte)5, Meggy.Color.VIOLET);
	}
}