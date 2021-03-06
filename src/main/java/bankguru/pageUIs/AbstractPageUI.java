package bankguru.pageUIs;

public class AbstractPageUI {
	public static final String HOME_PAGE_LINK = "//a[text()='Manager']";
	public static final String NEW_CUSTOMER_LINK = "//a[text()='New Customer']";
	public static final String EDIT_CUSTOMER_LINK = "//a[text()='Edit Customer']";
	public static final String DELETE_CUSTOMER_LINK = "//a[text()='Delete Customer']";
	public static final String NEW_ACCOUNT_LINK = "//a[text()='New Account']";
	public static final String EDIT_ACCOUNT_LINK = "//a[text()='Edit Account']";
	public static final String DELETE_ACCOUNT_LINK = "//a[text()='Delete Account']";
	public static final String DEPOSIT_LINK = "//a[text()='Deposit']";
	public static final String WITHDRAWAL_LINK = "//a[text()='Withdrawal']";
	public static final String FUND_TRANSFER_LINK = "//a[text()='Fund Transfer']";
	public static final String CHANGE_PASSWORD_LINK = "//a[text()='Change Password']";
	public static final String BALANCE_ENQUIRY_LINK = "//a[text()='Balance Enquiry']";
	public static final String MINI_STATEMENT_LINK = "//a[text()='Mini Statement']";
	public static final String CUSTOMISED_STATEMENT_LINK = "//a[text()='Customised Statement']";
	public static final String LOG_OUT_LINK = "//a[text()='Log out']";

	public static final String DYNAMIC_PAGE_LINK = "//a[text()='%s']";
	public static final String DYNAMIC_TEXTBOX = "//input[@name='%s']";
	public static final String DYNAMIC_cHECKBOX = "//input[@name='%s']";
	public static final String DYNAMIC_TEXTAREA = "//textarea[@name='%s']";
	public static final String DYNAMIC_BUTTON = "//input[@name='%s']";
	public static final String DYNAMIC_LINK = "//a[@name='%s']";
	public static final String DYNAMIC_VERIFY_TEXT = "//td[contains(text(),'%s')]/following-sibling::td";
	public static final String DYNAMIC_PAGE_TITLE = "//p[@class='heading3' and text()='%s']";
	public static final String DYNAMIC_DROPDOWNLIST = "//select[@name='%s']";
}
