package com.xindong.api.domain;

import java.io.Serializable;
import java.util.Date;
/**
 * 订单旅客
 * @author lichaoxiong
 *
 */
public class OrderPassenger implements Serializable{
	private static final long serialVersionUID = 1L;
    private Integer orderPassengerId;

    private Integer orderId;

    private Integer passengerIdentityType;//旅客认证类型(1身份证2护照3军官证4回乡证5台胞证6港澳通行证7台湾通行证8士兵证)

    private String passengerIdentityNumber;//旅客认证号码
    private String passengerName;//旅客姓名
    private String passengerMobile;//旅客手机

    private Integer yn;//2表示成人3表示儿童

    private Date created;

    private Date modified;

    
    public String getPassengerName() {
		return passengerName;
	}

	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}

	public Integer getOrderPassengerId() {
        return orderPassengerId;
    }

    public void setOrderPassengerId(Integer orderPassengerId) {
        this.orderPassengerId = orderPassengerId;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getPassengerIdentityType() {
        return passengerIdentityType;
    }

    public void setPassengerIdentityType(Integer passengerIdentityType) {
        this.passengerIdentityType = passengerIdentityType;
    }

    public String getPassengerIdentityNumber() {
        return passengerIdentityNumber;
    }

    public void setPassengerIdentityNumber(String passengerIdentityNumber) {
        this.passengerIdentityNumber = passengerIdentityNumber;
    }

    public String getPassengerMobile() {
        return passengerMobile;
    }

    public void setPassengerMobile(String passengerMobile) {
        this.passengerMobile = passengerMobile;
    }

    public Integer getYn() {
        return yn;
    }

    public void setYn(Integer yn) {
        this.yn = yn;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getModified() {
        return modified;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }
}