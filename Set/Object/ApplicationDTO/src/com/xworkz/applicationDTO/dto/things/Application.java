package com.xworkz.applicationDTO.dto.things;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

@SuppressWarnings("serial")
public class Application implements Serializable {
	private String name;
	private double version;
	private LocalDate createdDate;
	private double size;
	private String developedby;
	private Type type;
	private int price;
	private LocalDate firstVersionReleaseDate;
	private LocalDate currentVersionReleaseDate;
	private LocalDate nextVersionReleaseDate;
	private LocalDate trialDays;
	private LangUsed langUsed;
	private double minProcessorSpeed;
	private double ramspaceRequired;
	private boolean internetNeeded;
	private int ageLimit;
	private int noOfDownloads;
	private int rating;
	private OsTypeSupported osTypeSupported;
	@Override
	public String toString() {
		return "Application [name=" + name + ", version=" + version + ", createdDate=" + createdDate + ", size=" + size
				+ ", developedby=" + developedby + ", price=" + price + ", minProcessorSpeed=" + minProcessorSpeed
				+ ", ramspaceRequired=" + ramspaceRequired + ", internetNeeded=" + internetNeeded + ", ageLimit="
				+ ageLimit + ", noOfDownloads=" + noOfDownloads + ", rating=" + rating + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getVersion() {
		return version;
	}
	public void setVersion(double version) {
		this.version = version;
	}
	public LocalDate getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(LocalDate createdDate) {
		this.createdDate = createdDate;
	}
	public double getSize() {
		return size;
	}
	public void setSize(double size) {
		this.size = size;
	}
	public String getDevelopedby() {
		return developedby;
	}
	public void setDevelopedby(String developedby) {
		this.developedby = developedby;
	}
	public Type getType() {
		return type;
	}
	public void setType(Type type) {
		this.type = type;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public LocalDate getFirstVersionReleaseDate() {
		return firstVersionReleaseDate;
	}
	public void setFirstVersionReleaseDate(LocalDate firstVersionReleaseDate) {
		this.firstVersionReleaseDate = firstVersionReleaseDate;
	}
	public LocalDate getCurrentVersionReleaseDate() {
		return currentVersionReleaseDate;
	}
	public void setCurrentVersionReleaseDate(LocalDate currentVersionReleaseDate) {
		this.currentVersionReleaseDate = currentVersionReleaseDate;
	}
	public LocalDate getNextVersionReleaseDate() {
		return nextVersionReleaseDate;
	}
	public void setNextVersionReleaseDate(LocalDate nextVersionReleaseDate) {
		this.nextVersionReleaseDate = nextVersionReleaseDate;
	}
	public LocalDate getTrialDays() {
		return trialDays;
	}
	public void setTrialDays(LocalDate trialDays) {
		this.trialDays = trialDays;
	}
	public LangUsed getLangUsed() {
		return langUsed;
	}
	public void setLangUsed(LangUsed langUsed) {
		this.langUsed = langUsed;
	}
	public double getMinProcessorSpeed() {
		return minProcessorSpeed;
	}
	public void setMinProcessorSpeed(double minProcessorSpeed) {
		this.minProcessorSpeed = minProcessorSpeed;
	}
	public double getRamspaceRequired() {
		return ramspaceRequired;
	}
	public void setRamspaceRequired(double ramspaceRequired) {
		this.ramspaceRequired = ramspaceRequired;
	}
	public boolean isInternetNeeded() {
		return internetNeeded;
	}
	public void setInternetNeeded(boolean internetNeeded) {
		this.internetNeeded = internetNeeded;
	}
	public int getAgeLimit() {
		return ageLimit;
	}
	public void setAgeLimit(int ageLimit) {
		this.ageLimit = ageLimit;
	}
	public int getNoOfDownloads() {
		return noOfDownloads;
	}
	public void setNoOfDownloads(int noOfDownloads) {
		this.noOfDownloads = noOfDownloads;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public OsTypeSupported getOsTypeSupported() {
		return osTypeSupported;
	}
	public void setOsTypeSupported(OsTypeSupported osTypeSupported) {
		this.osTypeSupported = osTypeSupported;
	}
	@Override
	public int hashCode() {
		return Objects.hash(ageLimit, createdDate, developedby, internetNeeded, minProcessorSpeed, name, noOfDownloads,
				price, ramspaceRequired, rating, size, version);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Application other = (Application) obj;
		return ageLimit == other.ageLimit && createdDate == other.createdDate
				&& Objects.equals(developedby, other.developedby) && internetNeeded == other.internetNeeded
				&& Double.doubleToLongBits(minProcessorSpeed) == Double.doubleToLongBits(other.minProcessorSpeed)
				&& Objects.equals(name, other.name) && noOfDownloads == other.noOfDownloads && price == other.price
				&& Double.doubleToLongBits(ramspaceRequired) == Double.doubleToLongBits(other.ramspaceRequired)
				&& rating == other.rating && Double.doubleToLongBits(size) == Double.doubleToLongBits(other.size)
				&& Double.doubleToLongBits(version) == Double.doubleToLongBits(other.version);
	}
}
	

	