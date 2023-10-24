package pageUIs.blueCloak;

public class MapPageUI {
	public static final String DEVICE_SELECTBOX = "XPath=//input[@formcontrolname='deviceCtr']";
	public static final String DEVICE_OPTION = "XPath=//span[@class='mat-option-text']//*[text()='Windows Client']";
	public static final String TEMPLATE_SELECTBOX = "XPath=//input[@formcontrolname='templateCtr']";
	public static final String TEMPLATE_OPTION = "XPath=//span[@class='mat-option-text']//*[text()='Windows 10 21H2 x64']";
	public static final String ADD_NODE_BUTTON = "XPath=//button[@data-cy='btn-add-node']";
	public static final String MAP = "CSS=canvas.expand-collapse-canvas";
	public static final String MINIMIZE_BTN = "XPath=//mat-icon[text()='minimize']";
	public static final String VALIDATION_ERROR = "CSS=mat-error";
	public static final String FOLDER_TEXTFIELD = "XPath=//input[@formcontrolname='folderCtr']";
	public static final String NODE_NAME_TEXTFIELD = "XPath=//input[@formcontrolname='nameCtr']";
	public static final String ADD_NODE_FORM = "XPath=//form[@data-cy='nodeAddForm']";
	public static final String ADD_PORTGROUP_FORM = "XPath=//form[@data-cy='pgAddForm']";
	public static final String PUBLIC_PORTGROUP = "CSS=[matTooltip='Add Public']";
	public static final String PRIVATE_PORTGROUP = "CSS=[matTooltip='Add Private']";
	
	public static final String NODE_CONTEXT_MENU = "CSS=#node_interface";
	public static final String CONNECT_INTERFACE = "CSS=#connect_interface";
	public static final String ADD_INTERFACE_BUTTON = "XPath=//button[@data-cy='addInterfaceSource']";
	public static final String DIRECTION_TEXTFIELD = "XPath=//input[@formcontrolname='directionCtr']";
	public static final String DIRECTION_VALUE = "XPath=//div[@class='option-text' and text()='%s']";
	public static final String VLANMODE_TEXTFIELD = "XPath=//mat-select[@formcontrolname='vlanModeCtr']";
	public static final String VLANMODE_VALUE = "XPath=//span[@class='mat-option-text' and text()='%s']";


}