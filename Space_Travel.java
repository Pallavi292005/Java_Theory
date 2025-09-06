package com.sample;

public class SpaceTravel {

	public static void main(String[] args) {

		//primitive data types

		double distance=12086;//in km

		float speed=50f;//in km/s

		byte crewmember = 3;

		boolean oxygenavailable= true;

		char rocketCode = 'w';

		double timetravel = distance/speed;

		System.out.println(distance);

		System.out.println("rocketCode:"+rocketCode);

		System.out.println("Crew Members:"+ crewmember);

		System.out.println("Oxygen available:" + oxygenavailable);

		System.out.println("Travel time:"+ timetravel+"hours");
}
}
