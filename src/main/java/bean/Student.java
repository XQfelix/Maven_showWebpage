package bean;

import lombok.Data;
import util.Column;

@Data
public class Student {
	private Integer id;
	private String name;
	@Column(value="b_id")
	private Integer bId;
	private Integer gerden;
}
