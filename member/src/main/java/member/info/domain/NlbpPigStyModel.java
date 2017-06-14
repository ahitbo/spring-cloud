package member.info.domain;

public class NlbpPigStyModel extends BaseModel {

    /** 猪场 */
    private Long hogpenid;

    /** 生产线 */
    private Long productid;

    /** 编码 */
    private String number;

    /** 名称 */
    private String name;

    /** 助记码 */
    private String helpcode;
    
    /** remarks */
    private String remarks;

    /** 猪舍类型 */
    private String styType;

    /** 猪舍类型名称 */
    private String styTypeName;
    
    /**EBS编码 */
    private String ebscode;
    
    public Long getHogpenid() {
        return hogpenid;
    }

    public void setHogpenid(Long hogpenid) {
        this.hogpenid = hogpenid;
    }

    public Long getProductid() {
        return productid;
    }

    public void setProductid(Long productid) {
        this.productid = productid;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

	public String getHelpcode() {
		return helpcode;
	}

	public void setHelpcode(String helpcode) {
		this.helpcode = helpcode;
	}

	public String getStyType() {
		return styType;
	}

	public void setStyType(String styType) {
		this.styType = styType;
	}

	public String getStyTypeName() {
		return styTypeName;
	}

	public void setStyTypeName(String styTypeName) {
		this.styTypeName = styTypeName;
	}

	public String getEbscode() {
		return ebscode;
	}

	public void setEbscode(String ebscode) {
		this.ebscode = ebscode;
	}
}