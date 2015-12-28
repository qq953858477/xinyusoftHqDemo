package com.xinyusoft.xinyusofthqlib.bean;

/**
 * Created by zzy on 2015/12/24.
 */
public class JiancangBean {

    private String name;
    private String code;

    private String count;

    private String cangwei;

    public String getName() {
        return name;
    }

    public JiancangBean() {

    }

    public JiancangBean(String name) {
        this.name = name;
    }

    public JiancangBean(String name, String code, String count, String cangwei) {
        this.name = name;
        this.code = code;
        this.count = count;
        this.cangwei = cangwei;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public String getCangwei() {
        return cangwei;
    }

    public void setCangwei(String cangwei) {
        this.cangwei = cangwei;
    }
}
