package application;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class Info {
	private SimpleStringProperty infoName;
	private SimpleIntegerProperty infoKorean;
	private SimpleIntegerProperty infoEnglish;
	private SimpleIntegerProperty infoMath;
	
	public Info(String infoName, int infoKorean, int infoEnglish, int infoMath)
	{
		this.infoName=new SimpleStringProperty(infoName);
		this.infoKorean=new SimpleIntegerProperty(infoKorean);
		this.infoEnglish=new SimpleIntegerProperty(infoEnglish);
		this.infoMath=new SimpleIntegerProperty(infoMath);
	}

	public String getInfoName() {
		return infoName.get();
	}

	public void setInfoName(String infoName) {
		this.infoName = new SimpleStringProperty(infoName);
	}

	public int getInfoKorean() {
		return infoKorean.get();
	}

	public void setInfoKorean(int infoKorean) {
		this.infoKorean = new SimpleIntegerProperty(infoKorean);
	}

	public int getInfoEnglish() {
		return infoEnglish.get();
	}

	public void setInfoEnglish(int infoEnglish) {
		this.infoEnglish = new SimpleIntegerProperty(infoEnglish);
	}

	public int getInfoMath() {
		return infoMath.get();
	}

	public void setInfoMath(int infoMath) {
		this.infoMath = new SimpleIntegerProperty(infoMath);
	}
}
