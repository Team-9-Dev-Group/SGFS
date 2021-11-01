public class Students {
	private String name;
	private String StudentId;
	private Boolean isUG;
	private String phone_no;
    private String Probation;
    
	public Students(String name, String StudentId, Boolean isUG, String phone_no, String probation) {
	
		this.name = name;
		this.StudentId = StudentId;
		this.isUG = isUG;
		this.phone_no = phone_no;
		this.Probation = Probation;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStudentId() {
		return StudentId;
	}

	public void setStudentId(String studentId) {
		StudentId = studentId;
	}

	public Boolean getIsUG() {
		return isUG;
	}

	public void setIsUG(Boolean isUG) {
		this.isUG = isUG;
	}

	public String getPhone_no() {
		return phone_no;
	}

	public void setPhone_no(String phone_no) {
		this.phone_no = phone_no;
	}
	public String getProbation() {
		return Probation;
	}

	public void setProbation(String probation) {
		this.Probation = probation;
	}
