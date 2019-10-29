package Ebay_PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ebay_pf {
	WebDriver driver;
	
	public void ebayPageFactory(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver,this);
		// check change
		
	}
	@FindBy(how=How.XPATH,using="//input[@id='gh-ac']")
	private WebElement Search1;
	@FindBy(how=How.XPATH,using="//input[@id='gh-btn']")
	private WebElement ClickSearch1;
	@FindBy(how=How.XPATH,using="//*[@id=\"w6-w1_btn\"]/div/div")
	private WebElement Sort;
	@FindBy(how=How.XPATH,using="//*[@id=\"w6\"]/div[1]/div[2]/div/ul/li[4]/h2")
	private WebElement BuyItNow;
	@FindBy(how=How.XPATH,using="//*[@id=\"srp-river-results-query_answer1-w0-x-carousel-items\"]/ul/li[2]/div/a/div")
	private WebElement PriceRange;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"w_1539745022761_cbx\"]")
	private WebElement Gender;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"srp-river-results-listing1\"]/div/div[2]/a/h3")
	private WebElement SelectWatch1;
	@FindBy(how=How.XPATH,using="//a[@id='isCartBtn_btn']")
	private WebElement AddCart1;
	@FindBy(how=How.XPATH,using="//*[@id=\"ADDON_0\"]/div/div[2]/div/div[4]/div/button[2]")
	private WebElement AddPlan;
	public WebElement getAddPlan() {
		return AddPlan;
	}
	@FindBy(how=How.XPATH,using="//input[@id='gh-ac']")
	private WebElement SearchAgain;
	@FindBy(how=How.XPATH,using="//input[@id='gh-btn']")
	private WebElement ClickSearchAgain;
	@FindBy(how=How.XPATH,using="//*[@id=\"srp-river-results-listing2\"]/div/div[2]/a/h3")
	private WebElement SelectWatch2;
	@FindBy(how=How.XPATH,using="//a[@id='isCartBtn_btn']")
	private WebElement AddCartAgain;
	@FindBy(how=How.XPATH,using="//*[@id=\"ADDON_0\"]/div/div[2]/div/div[4]/div/button[1]")
	private WebElement WithoutPlan;
	@FindBy(how=How.XPATH,using="//*[@id=\"mainContent\"]/div/div[3]/div/div/div[2]/div[2]/div/div/div/div/div[2]/span[2]/button")
	private WebElement removeCart;
	@FindBy(how=How.XPATH,using="//*[@id=\"mainContent\"]/div/div[4]/div/div/button")
	private WebElement CheckOut;
	@FindBy(how=How.XPATH,using="//input[@id='userid']")
	private WebElement userName;
	@FindBy(how=How.XPATH,using="//input[@id='pass']")
	private WebElement password;
	@FindBy(how=How.XPATH,using="//button[@id='sgnBt']")
	private WebElement SignInButton;
	@FindBy(how=How.XPATH,using="//p[@id='errf']")
	private WebElement SigninError;
	@FindBy(how=How.XPATH,using="//*[@id=\"w7-w1\"]/div/div/ul/li[4]/a/span")
	private WebElement SortSelect;
	


public WebElement getSortSelect() {
		return SortSelect;
	}
public WebDriver getDriver() {
	return driver;
}
public WebElement getSearch1() {
	return Search1;
}
public WebElement getClickSearch1() {
	return ClickSearch1;
}
public WebElement getSort() {
	return Sort;
}
public WebElement getBuyItNow() {
	return BuyItNow;
}
public WebElement getPriceRange() {
	return PriceRange;
}
public WebElement getGender() {
	return Gender;
}
public WebElement getSelectWatch1() {
	return SelectWatch1;
}
public WebElement getAddCart1() {
	return AddCart1;
}
public WebElement getSearchAgain() {
	return SearchAgain;
}
public WebElement getClickSearchAgain() {
	return ClickSearchAgain;
}
public WebElement getSelectWatch2() {
	return SelectWatch2;
}
public WebElement getAddCartAgain() {
	return AddCartAgain;
}
public WebElement getWithoutPlan() {
	return WithoutPlan;
}
public WebElement getRemoveCart() {
	return removeCart;
}
public WebElement getCheckOut() {
	return CheckOut;
}
public WebElement getUserName() {
	return userName;
}
public WebElement getPassword() {
	return password;
}
public WebElement getSignInButton() {
	return SignInButton;
}
public WebElement getSigninError() {
	return SigninError;
}}
