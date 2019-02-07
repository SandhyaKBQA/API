package testscrpt;

import org.testng.Assert;
import org.testng.annotations.Test;

import BasePackage.BaseTest;
import BasePackage.MyLoginPo;

public class Logintc extends BaseTest{
	public MyLoginPo loginPo;
	public Logintc loginTc;
	public Logintc() {}

	@Test
	public void Verifyonedirectloginfunctionality() throws Exception{
		this.loginPo=new MyLoginPo(driver);
		//verify email id
		String Email="charlie.onedirect@gmail.com";
		Assert.assertEquals(loginPo.EnterUserEmailId(Email),true ,"Invalid email id");
		
		//verify password
		String Password="t";
		Assert.assertEquals(loginPo.EnterPassword(Password),true ,"Invalid password");
		
		//verify submit button clickable
				Assert.assertEquals(loginPo.Verifysubmitbuttonclickable(),true ,"Not able to click submit button");
		
		//verify Service cloud image clickable
				Assert.assertEquals(loginPo.VerifyServicecloudImage(),true ,"Not able to click on service cloud");
	}
		

	

}
