package tuning;

public class User {
	
	private Integer id;
	private String useName;
	private String mail;
	private String gender;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUseName() {
		return useName;
	}
	public void setUseName(String useName) {
		this.useName = useName;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public User(Integer id, String useName, String mail, String gender) {
		super();
		this.id = id;
		this.useName = useName;
		this.mail = mail;
		this.gender = gender;
	}
	
	
}
