import meggy.Meggy;

class PA3Test2 {
	public static void main(String[] args) {
		while(!true == false) { //demonstrates while loops and boolean expressions
			Meggy.setPixel((byte)4, (byte)4, Meggy.Color.VIOLET);
			Meggy.setPixel((byte)4, (byte)5, Meggy.Color.VIOLET);
			Meggy.setPixel((byte)5, (byte)4, Meggy.Color.VIOLET);
			Meggy.setPixel((byte)5, (byte)5, Meggy.Color.VIOLET);
			Meggy.delay(200);
			Meggy.setPixel((byte)4, (byte)4, Meggy.Color.DARK);
			Meggy.setPixel((byte)4, (byte)5, Meggy.Color.DARK);
			Meggy.setPixel((byte)5, (byte)4, Meggy.Color.DARK);
			Meggy.setPixel((byte)5, (byte)5, Meggy.Color.DARK);
			Meggy.delay(200);
		}
	}
}