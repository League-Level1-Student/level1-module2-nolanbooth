package _99_extra;

public class PixelRunner {
	public static void main(String[] args) {
		PixelParty party = new PixelParty();
	int x1 = 0;
	int x2 = 0;
	int x3 = 0;
	int y1 = 0;
	int y2 = 0;
	int y3 = 0;	
	int xx11 = 0;
	int yy11 = 0;
	party.setColor(20, 30, 40);
		
		for (int i = 0; i < 10; i++) {
			
		
		party.drawRectangle(xx11, yy11, 10, 10);
	party.drawTriangle(x1, y1, x2, y2, x3, y3);
	x1 += 10;
	x2 += 10;
	x3 += 10;
	y1 += 10;
	y2 += 10;
	y3 += 10;
	xx11 += 10;
	yy11 += 10;
		}
	party.saveImage();
		party.displayImage();	
	}

}
