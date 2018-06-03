package com.personal;

public  class KaviProfile implements IProfile {

	@Override
	public void myBasicInfo() {
		System.out.println(ProfileConstants.FIRST_NAME+" kavi");
		System.out.println(ProfileConstants.SECOND_NAME+"preethi");
		System.out.println("Age:20");
	}

	
	public void myHobbies() {
		System.out.println("playing");
		
	}
	

}
