package com.personal;

public class JayaProfile implements IProfile {

	@Override
	public void myBasicInfo() {
		System.out.println(ProfileConstants.FIRST_NAME+"jaya");
		System.out.println(ProfileConstants.SECOND_NAME+"bharathi");
		System.out.println("20");
		
	}

	@Override
	public void myHobbies() {
		System.out.println("playing");
		
	}

}
