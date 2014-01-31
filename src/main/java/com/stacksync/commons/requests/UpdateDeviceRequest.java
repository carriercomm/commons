package com.stacksync.commons.requests;

import java.io.Serializable;

import com.stacksync.commons.utils.ClassUtils;

public class UpdateDeviceRequest extends Request implements Serializable {

	private static final long serialVersionUID = 3763327030154389990L;
	
	private Long deviceId;
	private String deviceName;
	private String os;
	private String ip;
	private String appVersion;

	public UpdateDeviceRequest(String userId, Long deviceId, String deviceName, String os, String ip, String appVersion) {
		super(userId);
		
		this.deviceId = deviceId;
		this.deviceName = deviceName;
		this.os = os;
		this.ip = ip;
		this.appVersion = appVersion;
	}

	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getAppVersion() {
		return appVersion;
	}

	public void setAppVersion(String appVersion) {
		this.appVersion = appVersion;
	}

	public Long getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(Long deviceId) {
		this.deviceId = deviceId;
	}

	public String getDeviceName() {
		return deviceName;
	}

	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}

	@Override
	public String toString() {
		return ClassUtils.classToString(this);
	}

}