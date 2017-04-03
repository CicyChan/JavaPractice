package test.java.oo;

public class ObjectDemo {

	public static void main(String[] args) {
		Point originOne = new Point(23,94);
		
		Rectangle rectOne = new Rectangle(originOne, 100, 200);
		Rectangle rectTwo = new Rectangle(50, 100);
		
		System.out.println("Width of rectOne " + rectOne.getWidth());
        System.out.println("Height of rectOne " + rectOne.getHeight());
        System.out.println("Area of rectOne " + rectOne.getArea());
        
        //SET rectTwo's postioin
        
        rectTwo.setOrigin(originOne);
        
        System.out.println("X postion of RectTwo : " + rectTwo.getOrign().getX());
        System.out.println("Y postion of RectTwo : " + rectTwo.getOrign().getY());
        
        rectTwo.move(40, 72);
        
        System.out.println("X postion of RectTwo : " + rectTwo.getOrign().getX());
        System.out.println("Y postion of RectTwo : " + rectTwo.getOrign().getY());
        
	}

}