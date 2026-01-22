package springdemo.annotationbased;

public class OrdersImpl implements Orders {

	@Override
	public void createOrder() {
		// TODO Auto-generated method stub
		System.out.println("CTS is created a order");

	}

	@Override
	public void deliver() {
		// TODO Auto-generated method stub
		System.out.println("CTS order is delivered");

	}

	@Override
	public void closeOrder() {
		// TODO Auto-generated method stub
		System.out.println("CTS order is closed");


	}

}
