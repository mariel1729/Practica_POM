package navegacion_Paginas;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import clases_Comunes.Clase_Base;

public class CompraLogOff 
{
	public CompraLogOff(WebDriver driver) 
	{
		PageFactory.initElements(driver, this); // inicializamos los pageobject / elementos con page factorey
	}
	
	//Identificamos los elementos con los que vamos a trabajar

	//ADDCAR
		@FindBy(id="add-to-cart-sauce-labs-backpack")
		private WebElement addCar;
		//OPTION
		@FindBy(id="react-burger-menu-btn")
		private WebElement OptionC;
		//LogOFF
		@FindBy(id="logout_sidebar_link")
		private WebElement logOFF;
		
	
	//Creamos el metodo de Login
	
	public void adicionaCar () 
	{
		Clase_Base.click(addCar);
		Clase_Base.click(OptionC);
		Clase_Base.click(logOFF);
		
	}
	
	
}
