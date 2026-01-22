package springdemo.javabased;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Flight implements InitializingBean, DisposableBean{
	int flightId;
	String provider;
	String source;
	String destination;
	
	public Flight() {
		
	}
	
	public Flight(int flightId, String provider, String source, String destination) {
		super();
		this.flightId = flightId;
		this.provider = provider;
		this.source = source;
		this.destination = destination;
	}

	public int getFlightId() {
		return flightId;
	}

	public void setFlightId(int flightId) {
		this.flightId = flightId;
	}

	public String getProvider() {
		return provider;
	}

	public void setProvider(String provider) {
		this.provider = provider;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	@Override
	public String toString() {
		return "Flight [flightId=" + flightId + ", provider=" + provider + ", source=" + source + ", destination="
				+ destination + "]";
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Initialition of bean is done..!");
		
	}

	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Destroy Method..!");
		
	}
	
}
