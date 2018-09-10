import meggy.Meggy;

class PA3Test3 {
	public static void main(String[] args) {
		while(true) {
			if(Meggy.checkButton(Meggy.Button.B)) { //demonstrating ifs and checkButton control structure
				Meggy.setPixel((byte)4, (byte)5, Meggy.Color.BLUE);
				Meggy.delay(100);
				Meggy.setPixel((byte)4, (byte)5, Meggy.Color.DARK);
			}
			if(Meggy.checkButton(Meggy.Button.A)) {
				Meggy.setPixel((byte)4, (byte)6, Meggy.Color.RED);
				Meggy.delay(100);
				Meggy.setPixel((byte)4, (byte)6, Meggy.Color.DARK);
			}
		}
	}
}