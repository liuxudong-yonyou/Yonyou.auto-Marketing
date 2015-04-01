package yonyou.marketing.api.user.entity;

public class SysMenuBtnDto {
    private Integer id;

    private Integer menuid;

    private String btnname;

    private String btntype;

    private String actionurls;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMenuid() {
        return menuid;
    }

    public void setMenuid(Integer menuid) {
        this.menuid = menuid;
    }

    public String getBtnname() {
        return btnname;
    }

    public void setBtnname(String btnname) {
        this.btnname = btnname == null ? null : btnname.trim();
    }

    public String getBtntype() {
        return btntype;
    }

    public void setBtntype(String btntype) {
        this.btntype = btntype == null ? null : btntype.trim();
    }

    public String getActionurls() {
        return actionurls;
    }

    public void setActionurls(String actionurls) {
        this.actionurls = actionurls == null ? null : actionurls.trim();
    }
}