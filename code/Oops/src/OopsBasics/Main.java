package OopsBasics;

public class Main {
	public static void main(String[] args) {
		Circle circleObj = new Circle();
//		System.out.println("Private variables are not accessible outside class" + circleObj.color + circleObj.radius); C.E
		System.out.println(circleObj);
		System.out.println("Area: " + circleObj.getArea());
		System.out.println(circleObj.getCurcumference());
		
//		============================================================
		Rectangle recObj = new Rectangle();
		
		System.out.println(recObj);
		
//		============================================================
		Employee empObj = new Employee(1, "Palash", "Mahlotra", 100000);
		
		System.out.println(empObj);
		System.out.println(empObj.raiseSalary(20));
		
//		============================================================
		InvoiceItem invoiObj = new InvoiceItem("food_1", "Food", 10, 10000);
		
		System.out.println(invoiObj);
		System.out.println(invoiObj.getTotal());
		
//		============================================================
		Account acObj = new Account("a/c-1", "Dipesh", 10000000);
		Account acObj2 = new Account("a/c-2", "Sandeep", 100000000);
		
		System.out.println(acObj.transferTo(acObj2, 100000));
		System.out.println(acObj2.balance);
		
		System.out.println(acObj2.transferTo(acObj, 2000000000));
		System.out.println(acObj);
		
//		==============================================================
		Date date = new Date(1,12,1996);
		
		System.out.println(date);
		
//		============================================================
		Time time = new Time(1,12,11);
		
		System.out.println(time);
		
		System.out.println(time.nextSecond());
		System.out.println(time.previousSecond());
		
//		============================================================
		Author author = new Author("Dipesh", "dpatidar336@gmail.com", 'M');
		Author author5 = new Author("Lucky", "lucky@gmail.com", 'M');
		
		Author[] authors = new Author[2];
		authors[0] = author;
		authors[1] = author5;
		
		Book newBook = new Book("My cool life", authors , 10000);
		
		System.out.println(newBook);
		System.out.println(newBook.getAuthorNames());
		
//		Author author1 = new Author("Sandeep", "sandy336@gmail.com", 'M');
//		
//		Book newBook2 = new Book("My cool life 2", author1 , 10000);
//		
//		System.out.println(newBook2);
	
//		===============MyPoint====================================
		
		MyPoint point1 = new MyPoint(3,4);
		System.out.println(point1);
		System.out.println(point1.distance(5, 6)[0] + " " + point1.distance(5, 6)[1]);
		System.out.println(point1.distance()[0] + " " + point1.distance()[1]);
		
		MyPoint point2 = new MyPoint(8,6);
		System.out.println(point2.distance(point1)[0] + " " + point2.distance(point1)[1]);
		System.out.println(point2.distance()[0] + " " + point2.distance()[1]);
		
		MyPoint[] points = new MyPoint[10];
		
		for(int i = 0; i<points.length; i++) {
			points[i] = new MyPoint(i+1,i+1);
		}
		
		for(MyPoint point: points) {
			System.out.println(point.getX() + "," + point.getY());
		}
		
//		==================MyCircle======================
		MyPoint point = new MyPoint(3,2);
		
		MyCircle circle1 = new MyCircle(point,10);
		
		System.out.println(circle1);
		
		circle1.setCenterXY(10,20);
		System.out.println(circle1);
		
		circle1.setCenter(new MyPoint(30,50));
		System.out.println(circle1);
		
//		===============MyTriangle=====================
		
		MyPoint v1 = new MyPoint(10,30);
		MyPoint v2 = new MyPoint(20,50);
		MyPoint v3 = new MyPoint(30,60);
		
		MyTriangle tri = new MyTriangle(v1, v2, v3);
		
		System.out.println(tri);
		
//		==========customer test======================
		Customer cst  = new Customer(12, "Dipesh", 20);
		
		System.out.println(cst.getName());
		System.out.println(cst.getDiscount());
		System.out.println(cst.getId());
		
		System.out.println(cst);
		
//		==========invoice test=======================
		Customer anCst = new Customer(13, "Mahesh", 30);
		
		Invoice in =new Invoice(13, anCst, 100);
		
		System.out.println(in.getCustomerName() + " " +in.getAmountAfterDiscount() + "%");
		
//		==========cust account========================
		
		AccountForCustomer newCust = new AccountForCustomer(10, anCst, 100000);
		
		AccountForCustomer dipo = newCust.deposit(100);
		System.out.println(dipo.getBalance());
		
		System.out.println("Withdrawl");
		
		AccountForCustomer withd = newCust.withdraw(25000);
		System.out.println("Current Balance: " + withd.getBalance());
		
		AccountForCustomer withd1 = newCust.withdraw(100000);
		System.out.println("Current Balance: " + withd1.getBalance());
		
//		=========MyTime class=================================
		
		MyTime mytime = new MyTime(10, 15, 59);
		mytime.setTime(0,0, 0);
		
		System.out.println(mytime);
		System.out.println(mytime.nextMinute().getMinute());
		System.out.println(mytime.previousMinute().getMinute());
		
		System.out.println(mytime.nextHour().getHour());
		System.out.println(mytime.previousHour().getHour());
		
		System.out.println(mytime.nextSecond().getSecond());
		System.out.println(mytime.previousSecond().getSecond());
		
//		============MyDate====================
		MyDate mydate = new MyDate(2020, 10, 18);
		
	System.out.println(mydate.getDayOfWeek(2020, 10, 18));
//	==========Ball and Container=========================
	
	Ball ball = new Ball(50, 50, 5, 10, 30);
	Container box = new Container(0, 0, 100, 100);
	
	for (int step = 0; step < 100; ++step) {
		ball.move();
		box.collidesWith(ball);
		System.out.println(ball); // manual check the position of the ball
		}
//	=============soccer ball=================
	SoccerBall sBall = new SoccerBall(10,20,30);
	
	System.out.println(sBall);
	
//	==============Cylender==================
	
	Cylender c1 = new Cylender();
	
	System.out.println("Cylender: " + "Radius: " + c1.getRadius() + 
			" height: " + c1.getHeight() + 
			" base area: " + c1.getArea() + 
			" volume: " + c1.getVolume());
	
	Cylender c2 = new Cylender(10.0);
	System.out.println("Cylender: " + 
			"Radius: " + c2.getRadius() + 
			" height: " + c2.getHeight() + 
			" base area: " + c2.getArea() + 
			" volume: " + c2.getVolume());
	
	Cylender c3 = new Cylender(2.0, 10.0);
	System.out.println("Cylender: " + "Radius: " + c3.getRadius() + 
			" height: " + c3.getHeight() + 
			" base area: " + c3.getArea() + 
			" volume: " + c3.getVolume());
	System.out.println(c3);
	}
}
