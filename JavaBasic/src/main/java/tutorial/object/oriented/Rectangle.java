package tutorial.object.oriented;

public class Rectangle {
	public int width = 0;
	public int height = 0;

	public Point origin;

	public Rectangle(Point point, int width, int height) {
		super();
		this.width = width;
		this.height = height;
		this.origin = point;
	}

	public Rectangle() {
		super();

		this.origin = new Point(0, 0);
	}

	public Rectangle(int width, int height) {
		super();
		this.width = width;
		this.height = height;

		this.origin = new Point(this.width, this.height);
	}

	public Rectangle(Point origin) {
		super();
		this.origin = origin;
	}

	public void move(int x, int y) {
		this.origin.setX(x);
		this.origin.setY(y);
	}

	public int getArea() {
		return this.width * this.height;
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

	public Point getOrign() {
		return origin;
	}

	public void setOrigin(Point point) {
		this.origin = point;
	}

}
