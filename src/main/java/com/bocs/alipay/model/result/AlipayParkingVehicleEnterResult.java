package com.bocs.alipay.model.result;

import com.alipay.api.response.AlipayEcoMycarParkingEnterinfoSyncResponse;
import com.bocs.alipay.model.TradeStatus;

/**
 * 描述:<p>车辆入场信息同步。上传车辆驶入停车场信息到支付宝接口返回结果 </p>
 *
 * @Author: songqi
 * @Date: 2018/2/24 13:41
 */
public class AlipayParkingVehicleEnterResult implements Result{
    private TradeStatus tradeStatus;

    private AlipayEcoMycarParkingEnterinfoSyncResponse response;

    public AlipayParkingVehicleEnterResult(AlipayEcoMycarParkingEnterinfoSyncResponse response){
        this.response = response;
    }


    public TradeStatus getTradeStatus() {
        return tradeStatus;
    }

    public void setTradeStatus(TradeStatus tradeStatus) {
        this.tradeStatus = tradeStatus;
    }

    public AlipayEcoMycarParkingEnterinfoSyncResponse getResponse() {
        return response;
    }

    public void setResponse(AlipayEcoMycarParkingEnterinfoSyncResponse response) {
        this.response = response;
    }

    @Override
    public boolean isTradeSuccess() {
        return response != null &&
                TradeStatus.SUCCESS.equals(tradeStatus);
    }
}
