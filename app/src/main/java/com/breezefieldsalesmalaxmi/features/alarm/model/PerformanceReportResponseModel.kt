package com.breezefieldsalesmalaxmi.features.alarm.model

import com.breezefieldsalesmalaxmi.base.BaseResponse

/**
 * Created by Saikat on 21-02-2019.
 */
class PerformanceReportResponseModel : BaseResponse() {
    var performance_report_list: ArrayList<PerformanceReportDataModel>? = null
}