package model;

public class weatherBean {

	private String cityStr;

	private String countryStr;

	private String cloudsStr;

	private String dateStr;

	private String tempStr;

	public weatherBean(String cityStr, String countryStr) {

		this.cityStr = cityStr;
		this.countryStr = countryStr;

	}

	public String getCityStr() {
		return cityStr;
	}

	public String getCountryStr() {
		return countryStr;
	}

	public String getCloudsStr() {
		return cloudsStr;
	}

	public String getDateStr() {
		return dateStr;
	}

	public String getTempStr() {
		return tempStr;
	}

	public void setCloudsStr(String cloudsStr) {
		this.cloudsStr = cloudsStr;
	}

	public void setDateStr(String dateStr) {
		this.dateStr = dateStr;
	}

	public void setTempStr(String tempStr) {
		this.tempStr = tempStr;
	}

}