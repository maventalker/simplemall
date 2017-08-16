
package com.simplemall.micro.serv.common.bean;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import com.simplemall.micro.serv.common.constant.SystemConstants;

/**
 * ClassName:RestAPIResulut <br/>
 * Function: REST API接口统一响应接口实体. <br/>
 * Date: 2017年8月16日 下午15:25:04 <br/>
 * 
 * @author guooo
 * @version
 * @since JDK 1.6
 * @see
 */
//@ApiModel(value = "REST API接口统一响应接口实体")
public class RestAPIResult<T> implements Serializable {

	/**
	 * serialVersionUID:
	 * 
	 * @since JDK 1.6
	 */
	private static final long serialVersionUID = 1L;

//	@ApiModelProperty(value = "respCode : 返回代码，1表示成功，其它的都有对应问题")
    private int respCode = 1;

//    @ApiModelProperty(value = "respMsg : 如果code!=1,错误信息")
    private String respMsg="成功！";

    @SuppressWarnings("unchecked")
//    @ApiModelProperty(value = "respCode为1时返回结果")
    private T respData = (T) new Object();

//    @ApiModelProperty(value = "附加信息")
    private Map<String, Object> respMap = new HashMap<String, Object>();
    
//    @ApiModelProperty(value = "接口返回数据的签名信息")
    private String signature;
    
//    @ApiModelProperty(value = "请求接口时的设备类型")
    private String deviceType;
    
//    @ApiModelProperty(value = "respData base64加密，用于客户端验证签名")
    private String dataCode;


    public int getRespCode() {
        return respCode;
    }

    public void setRespCode(int respCode) {
        this.respCode = respCode;
    }

    public String getRespMsg() {
        return respMsg;
    }

    public void setRespMsg(String respMsg) {
        this.respMsg = respMsg;
    }

    public T getRespData() {
        return respData;
    }

    public void setRespData(T respData) {
        this.respData = respData;
    }

    public Map<String, Object> getRespMap() {
        return respMap;
    }

    public String getSignature() {
		return signature;
	}

	public void setSignature(String signature) {
		this.signature = signature;
	}

	public String getDeviceType() {
		return deviceType;
	}

	public String getDataCode() {
        return dataCode;
    }

    public void setDataCode(String dataCode) {
        this.dataCode = dataCode;
    }

    public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
	}

	public void setRespMap(Map<String, Object> respMap) {
        this.respMap = respMap;
    }
	public RestAPIResult(String errorMsg){
		this.respMsg = errorMsg;
		this.respCode =SystemConstants.Code.error;
		this.respData = (T) new Object();
		this.respMap = new HashMap<String, Object>();
	}
	
	public RestAPIResult(){
		this.respData=(T) new Object();
		this.respMap=new HashMap<String, Object>();
	}
 
	public void success(T object){
		this.respCode = SystemConstants.Code.success;
		this.respMsg = SystemConstants.Code.SUCCESS;
		this.respData = object;
		this.respMap=new HashMap<String, Object>();
	}
	public void error(){
		this.respCode = SystemConstants.Code.error;
		this.respMsg = SystemConstants.Code.FAIL;
		this.respData=(T) new Object();
		this.respMap=new HashMap<String, Object>();
	}
	public void error(String message){
		this.respCode = SystemConstants.Code.error;
		this.respMsg = message;
		this.respData=(T) new Object();
		this.respMap=new HashMap<String, Object>();
	}
	
}
