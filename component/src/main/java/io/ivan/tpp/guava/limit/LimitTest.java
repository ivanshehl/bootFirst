package io.ivan.tpp.guava.limit;

import com.google.common.util.concurrent.RateLimiter;

public class LimitTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		helloword(10, 20);
	}

	private static void helloword(int size,int con){
		RateLimiter limiter = RateLimiter.create(size);
		try {
			Thread.currentThread().sleep(2000L);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(int i = 0; i < con; i++){
			System.out.println(limiter.acquire());
		}
	}
}
