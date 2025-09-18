package java8_practice.problems.dto;

public class Notes {
	
	private Integer id;
	@Override
	public String toString() {
		return "Notes [id=" + id + ", type=" + type + ", tagId=" + tagId + "]";
	}

	private String type;
	private Integer tagId;

	public Notes(Integer id, String type, Integer tagId) {
		this.id = id;
		this.type = type;
		this.tagId = tagId;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Integer getTagId() {
		return tagId;
	}

	public void setTagId(Integer tagId) {
		this.tagId = tagId;
	}
}
