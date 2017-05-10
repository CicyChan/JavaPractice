package tutorial.object.oriented.inheritance;

import tutorial.object.oriented.Point;

public class RectanglePlus implements Relatable {
	public int width = 0;
	public int height = 0;
	public Point origin;

	public RectanglePlus() {
		super();

		this.origin = new Point(0, 0);
	}

	public RectanglePlus(Point origin) {
		super();
		this.origin = origin;
	}

	public RectanglePlus(int width, int height) {
		super();
		this.width = width;
		this.height = height;

		this.origin = new Point(width, height);
	}

	public void move(int x, int y) {
		this.origin.setX(x);
		this.origin.setY(y);
	}

	public int getArea() {
		return this.getWidth() * this.getHeight();
	}

	@Override
	public int isLargerThan(Relatable other) {
		RectanglePlus otherRect = (RectanglePlus) other;

		if (this.getArea() < otherRect.getArea()) {
			return -1;
		} else if (this.getArea() > otherRect.getArea()) {
			return 1;
		} else {
			return 0;
		}
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public Point getOrigin() {
		return origin;
	}

	public void setOrigin(Point origin) {
		this.origin = origin;
	}

}
