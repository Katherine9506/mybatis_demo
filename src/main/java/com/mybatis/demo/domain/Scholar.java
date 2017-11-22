package com.mybatis.demo.domain;

/**
 * 学者信息表--必要字段
 */
public class Scholar {
    private Integer id;
    private String img;
    /* 学者姓名 */
    private String name;
    /* 英文名称 */
    private String enName;
    /* 研究方向 */
    private String researchField;
    /* 工作单位/机构 */
    private String workOrg;
    /* 教育经历 */
    private String education;
    /* 学位 */
    private String degree;
    /* 职称 */
    private String proTitle;
    /* 职务 */
    private String headship;
    /* 所属系统账户ID */
    private Integer userId;
    private Integer isCrawl;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }


    public String getHeadship() {
        return headship;
    }

    public void setHeadship(String headship) {
        this.headship = headship;
    }

    public String getEnName() {
        return enName;
    }

    public void setEnName(String enName) {
        this.enName = enName;
    }

    public String getResearchField() {
        return researchField;
    }

    public void setResearchField(String researchField) {
        this.researchField = researchField;
    }

    public String getWorkOrg() {
        return workOrg;
    }

    public void setWorkOrg(String workOrg) {
        this.workOrg = workOrg;
    }

    public String getProTitle() {
        return proTitle;
    }

    public void setProTitle(String proTitle) {
        this.proTitle = proTitle;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getIsCrawl() {
        return isCrawl;
    }

    public void setIsCrawl(Integer isCrawl) {
        this.isCrawl = isCrawl;
    }

    @Override
    public String toString() {
        return "Scholar{" +
                "id=" + id +
                ", img='" + img + '\'' +
                ", name='" + name + '\'' +
                ", enName='" + enName + '\'' +
                ", researchField='" + researchField + '\'' +
                ", workOrg='" + workOrg + '\'' +
                ", education='" + education + '\'' +
                ", degree='" + degree + '\'' +
                ", proTitle='" + proTitle + '\'' +
                ", headship='" + headship + '\'' +
                ", userId=" + userId +
                ", isCrawl=" + isCrawl +
                '}';
    }
}
