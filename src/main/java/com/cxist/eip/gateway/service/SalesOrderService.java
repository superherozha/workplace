package com.cxist.eip.gateway.service;

import com.cxist.eip.gateway.entity.SalesOrder;

/**
 * @Auther Chaos
 * @Date 2022/7/8
 */
public interface SalesOrderService {
    int addSalesOrder(SalesOrder salesOrder);

    void updateSalesOrder(SalesOrder salesOrder);
}
