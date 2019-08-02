package com.meyue.xiwen.exception;

/**
 * 类: ExceptionCode <br>
 * 描述: 异常定义 <br>
 * 作者: 李永刚 hzliyonggang@corp.netease.com <br>
 * 时间: 2017年7月26日 下午4:19:45
 */
public enum ExceptionCode {

    /**
     *
     */
    SUCCESS(200, ""),
    DEFAULT_ERROR(2000, "TMS服务异常"),
    PARAMETER_ILLEGAL(409, "参数不合法"),
    PARAMETER_ALLOCATE_IDNOT_EXIST(410, "参数不合法,默认分拨中心未选中"),
    ILLEGAL_ARGUMENT(400, "业务校验不合法"),
    SYS_ERROR(4000,"系统异常，请联系开发"),
    REQUEST_REPEAT(502,"请求过于频繁！"),
    DB_ERROR(810, "数据库异常"),
    PARAMETER_VALIDATE_NOT_PASS(501,"参数校验不通过"),
    DB_QUERY_FAIL(1100, "DB查询失败"),
    DB_SAVE_FAIL(1101, "DB创建失败"),
    DB_UPDATE_FAIL(1102, "DB更新失败"),
    DB_DEL_FAIL(1103, "DB删除失败"),
    DB_BATCH_SAVE_FAIL(1104, "DB创建失败"),
    DB_INSERT_FAIL(1105, "DB添加失败,请重试"),
    DB_OPT_FAIL(1106, "DB添加失败"),
    DB_QUERY_NO_RESULT(1200, "DB查询无结果"),
    DB_QUERY_TOO_MANY_RESULT(1201, "DB查询出多个结果"),
    TRANSPORTJOB_CREATE_FAIL(410,"客户要求到货日期不能早于当前日期"),
    PAGE_SELECT_PARAMETER_IS_NULL(1005, "每页查询的分页参数为空"),
    BUSINESSNO_ONLY_CHECK(411,"业务单号不能重复"),
    STORAGE_INFO_SET_REPEAT(802,"仓库信息设置重复："),
    CASECAR_TYPE_NOT_FIND(803,"笼车类型未知"),
    GET_TASK_NO_ERROR(1835,"获取运输任务号异常"),
    FILE_UPLOAD_PARSE_ERROR(1210, "上传文件解析异常"),
    OPERATOR_IS_NULL(1211, "操作人信息为空"),
    BATCH_NO_IS_NULL(1212, "快递车交接批次号为空"),
    BATCH_NO_IS_NOT_EXIST(1411, "交接批次号不存在"),
    BATCH_NO_IS_EXIST(1400, "批次号已经存在,无需重复提交"),
    HANDOVER_TIME_IS_NULL(1213, "快递车交接时间为空"),
    LINESCE_NO_IS_NULL(1214, "车牌号为空"),
    HANDOVER_STATUS_IS_NULL(1215, "快递交接清单数据正在导入中"),
    ID_IS_NULL(1216, "主键为空"),
    TRACKING_NO_IS_NULL(1217, "物流单号为空"),
    EXCEPTION_STATUS_IS_NULL(1218, "异常状态为空"),
    EXCEPTION_TYPE_IS_NULL(1219, "异常类型为空"),
    EXCEPTION_RECORD_IS_NULL(1220, "异常信息不存在"),
    SELECT_BILLNO_COMPANY_FAIL(1221, "获取包裹的对应的快递公司失败"),
    GET_BILL_NO_INFO_FAIL(1233, "获取运单信息失败,请联系后台管理人员"),
    NOT_GET_ADDRESS(1234, "获取不到发货地址"),
    NOT_GET_BILL_NO_WAREHOUSE_INFO(1235, "获取不到运单的仓库信息"),
    EXPRESS_DELIVERY_NEVER_REPEATE(1236, "同一个分拨中心下快递公司不能重复,分拨中心名称:"),
    EXPRESS_DELIVERY_EMAIL_ERROR(1236, "请编写合法的邮箱地址"),
    EXPRESS_DELIVERYE_SELECTONE(1237, "未选中下载,发送邮箱的其中一种方式"),
    EXPRESS_DELIVERYE_CHECKNOT(1238, "未勾选任务复选框,请勾选相应的交接单数据生成交接单"),
    EXPRESS_DELIVERYE_CONSISTANT(1239, "请选择一个分拨中心下一家快递公司生成交接单"),
    EXPRESS_DELIVERYE_EMAILISNOTSET(1240, "发送失败，请设置邮箱地址！"),

    DESTINATION_CODE_IS_NULL(1311, "目的地编码为空"),
    IMPORT_EXCEL_IS_ERROR(1312, "导入EXCEL异常"),
    EXPORT_EXCEL_DATA_ILLEGAL(1313, "导入的EXCE数据不合法"),
    SORTING_CODE_DOES_NOT_EXIST(1314, "输入的分拣编码在系统中不存在"),
    DATA_IS_ILLEGAL_CHARACTER(1315, "输入数据包含不合法字符"),
    DESTINATION_CODE_IS_EXIST(1316, "编码已经存在"),
    IMPORT_EXCEL_WORKBOOK_ERROR(1317, "excel流关闭出错"),
    PHONE_PARAMETER_ILLEGAL(1318, "手机号不合法"),
    LICENSE_NO_PARAMETER_ILLEGAL(1319, "车牌号不合法"),
    THIS_CAR_NOT_DELETE(1320, "当前车辆已经绑定笼车，无法删除"),
    CENTER_NAME_IS_SAME(1321, "分拨中心名称已存在"),
    LICENSE_NO_IS_HAVE(1322, "车牌号已存在"),
    PDA_NO_IS_EIGHT(1323, "快手编号必须为8位数字"),
    CAR_IS_WORK_NOW_NO_STOP(1324, "车辆工作中，无法停用"),
    BILL_NO_IS_EXIST(1235, "运单号已经存在"),
    BILL_NO_IS_NOT_EXIST(1236, "运单号已经不存在"),
    EXCEPTION_REASON_IS_NULL(1236, "异常原因为空"),
    PICTURE_IMPORT_FAIL(1237, "图片导入异常"),
    IMPORT_OVER_SIZE(1238, "导入文件过大，请分次导入"),
    IMPORT_FALED(1239, "导入失败！ 请下载失败原因文件处理"),

    QUERYTIME_STYLE_ERROR(1401, "查询时间字符串格式不对"),

    EXPOTR_EXCEL_FAIL(1501, "导出excel失败"),
    EXPOTR_EXCEL_PARAM_NOT_PERMIT(1502, "异常发生或者关闭时间不能为空，且时间间隔天数不能大于"),
    EXPOTR_EXCEL_REQUEST_TOO_FAST(1503, "请求频率过高请稍后再试"),
    EXPORT_EXCEL_SIZE_TOO_BIG(1504, "导出的记录数量太大，请缩小时间范围，导出记录数量不能超过"),
    EXPORT_EXCEL_HAVE_NO_DATA(1505, "没有查询到要导出的数据，请重新选择条件"),
    UPLOAD_FILE_FORMAT_ERROR(1506, "上传文件格式不符,只允许上传pdf格式文件..."),

    CARRIER_VERIFY_FAIL(1601,"承运商审核失败"),
    KAOLA_VERIFY_FAIL(1602,"考拉审核失败"),
    EVENT_STATE_WRONG(1603,"事件状态有误"),
    SYSTEM_ERROR(1604,"系统异常"),
    EVENT_CREATE_REPEAT_ERROR(1605,"只有安全隐患/在途异常 类型的事件可以重复，其他类型不可重复发起"),
    EVENT_MUST_CREATE_AFTER_COMPLETE_FIVE_WEEKDAY(1606,"事件的发起只能是终点卸货完成起算5个工作日内发起，超过5个工作日则不可发起！"),
    PARAM_CAN_NOT_BE_NULL(1607,"必填项为空"),
    CAN_NOT_FIND_TARIFF(1608,"找不到该运单对应的费率本，请先配置！"),
    EVENT_NOTE_TOO_LONG(1609,"备注字数不能超过200字！"),
    TRANSPORT_WAYBILL_NO_IS_NOT_NULL(1845,"运输单号不能为空"),

    EXPORT_AND_IMPORT_CLOSE(1701,"系统导入导出功能已降级，暂时无法使用，请等待恢复通知"),
    WAY_BILL_TYPE_NOT_EXIST(1801,"此运输单类型不存在"),
    QUERY_WAY_BILL_ROUTE_NO_SITE_DATE(1802,"查询不到运输单路线的站点数据"),
    SCHEDULEORDER_NOT_FIND(1803,"查询不到调度单号"),
    SCHEDULEORDER_WAYBILL_TYPE_NOT_MATCH(1803,"调度单与运输单的类型不匹配"),
    SCHEDULEORDER_ROUTE_SITE_NOT_MATCH(1804,"调度单与路线站点不匹配"),
    WAY_BILL_ADD_SUBMIT_FAILED(1805,"运输单新建提交失败:"),
    WAY_BILL_NOT_FIND(1806,"查询不到运输单信息"),
    TRUCKNO_CANNOT_BE_ALLOATED_AGAIN(1807,"此运单类型为仓间调拨，车牌已分配，不可再次分配，因为车牌已发至关务系统"),
    WAY_BILL_CANNOT_EDIT(1808,"此运输单状态不为待分配或待起点到达或待装车，不能编辑"),
    ENTRACKING_CAN_NOT_CONCENTTRATE_BAG(1809,"集包已经装车不能再编辑"),
    CONCENTTRATE_FAILURE(1810,"集包失败"),
    CONCEL_CONCENTTRATE_FAILURE(1811,"撤销集包失败"),
    DUPLICATE_CONCENTTRATE_BAG(1812,"重复集包"),
    WAY_BILL_STATE_IS_NOT_WAIT_ALLOCATED(1813,"运单状态不为待分配"),
    TRUCK_NO_NOT_EMPTY(1814,"车牌不为空,已分配"),
    DRIVER_NOT_EMPTY(1815,"驾驶员不为空,已分配"),
    BUSSINESS_CAN_NOT_REPEAT(1816,"业务单号不能重复"),
    GET_SCHEDULE_ORDER_NO_FAILED(1817,"获取调度单号失败"),
    STATE_NOT_ALLOWED_TO_UPLOAD_RECEIPT(1818,"当前运输单状态不允许上传回单"),
    STATE_NOT_ALLOWED_TO_DO_THIS_ACTION(1819,"当前运输单状态不允许执行此操作"),
    CONCENTRATE_BAG_LOGIS_COMPANY_DIFFERENT(1820,"包裹所属快递公司与集包站点承运商冲突"),
    TRANSPORT_WAY_BILL_STATE_WRONG(1821,"运输单状态不一致，请刷新重试"),
    DOWNLOAD_SITE_DIFFERENT(1822,"该单卸货点与运输单卸货点不一致"),
    OPERATE_AT_WRONG_AREA(1823,"未在指定区域操作"),
    CAN_NOT_FIND_CARRIER(1824,"找不到承运商信息"),
    CAN_NOT_REMOVE_UPLOAD_PACKAGE(1825,"运输单当前状态不允许撤销装车"),
    WAY_BILL_NOT_EMPTY(1826,"运输单号不能为空"),
    WAY_BILL_STATE_ILLEGAL_NOT_WAIT_LOAD(1827,"操作失败，运输单状态不为待装车"),
    SCHEDULEORDER_HAVE_NOT_WAYBILL(1828,"此调度单号还未绑定运输单"),
    SCHEDULEORDER_HAVE_NOT_ACTUAL_REACH_WAREHOUSE_TIME(1829,"此调度单还没有实际到仓时间"),
    GET_SCHEDULE_ORDER_NO_ERROR(1830,"获取调度单号异常"),
    GET_WAY_BILL_NO_ERROR(1830,"获取运输单号异常"),
    TMS_APP_PARAMETER_ERROR(1831,"参数错误或异常"),
    CAN_NOT_FIND_TARRIF(1832,"找不到该运输单绑定的费率本，请先绑定费率本"),
    CAN_NOT_FIND_BILL_NO(1833,"找不到消费者订单或消费者订单没有分配快递公司"),
    USER_HAS_NO_RIGHTS(1834,"用户无权限"),
    ALREADY_TOTRUCK(1835,"重复装车"),
    SCHEDULEORDER_STATE_NOT_WAIT_CARRY(1836,"调度单状态不为待承运"),
    WAY_BILL_CLEARANCE_COMPLETE(1837,"此运输单已清关完成，不允许撤销"),
    LOAD_BUSINESS_NOT_NULL(1838,"装车业务单号不能为空"),
    SCHEDULEORDER_NOT_BELONG_TO_WAYBILL(1839,"此装载单不属于此运输单"),
    SCHEDULEORDER_STATE_NOT_WAIT_LOAD(1840,"此装载单状态不为待装车"),
    WAY_BILL_HAVE_SCHEDULEORDER_NOT_LOAD(1850,"装车失败，此运输单还有未装车的装载单"),
    BILL_COMPLETED_OVER_FIVE_DAYS(1842,"终点卸货完成5个工作日以上，不可发起事件"),
    SCHEDULEORDER_MUST_LOAD_BY_WMS(1843,"此调度单须由wms装车"),
    BILL_STARTED_CANNOT_INSERT_EVENT(1846,"运输单的账单已经生成，不能发起事件"),
    CARRIER_TRUCK_NUMBER_NOT_MATCH(1847,"承运商、车型、车牌不匹配"),
    TRAYCOUNT_NOT_NULL_OR_ZERO(1848,"托盘数不能为空且要大于0"),
    VOLUME_NOT_NULL_OR_ZERO(1849,"体积不能为空且要大于0"),
    SCHEDULERNO_IS_NOT_NULL(1844,"调度单号不能为空"),
    SCHEDULEORDER_HAVE_NOT_PLAN_REACH_WAREHOUSE_TIME(1830,"此调度单还没有计划到仓时间"),
    PLATENUMBER_IS_NOT_NULL(1890,"车牌号不能为空"),
    GET_VEHICLE_INFOMATION_NOT_EXIST(1842,"获取车牌信息不存在"),
    WAYBILL_HAVING_NOT_TRUCKNO_OR_DRIVER(1846,"车牌或者驾驶还没有分配"),
    GET_DRIVER_INFOMATION_NOT_EXIST(1842,"获取驾驶员信息不存在"),

    VERIFY_CAS_USERNAME_FAIL(402, "验证CAS登录失败,用户名或者密码无效"),
    VERIFY_CAS_PARAM_FAIL(402, "验证CAS登录失败,token为空或者失效"),
    VERIFY_CAS_FAIL(402, "验证CAS登录失败"),
    PAYROLLREQUISITIONNOREPETITION(409,"当前账单已经存在,不能重复添加相同账单"),

    INVOKE_CUSTOMS_NOT_AVAILABLE(405,"关务服务不可用"),
    VERIFY_CAS_NO_DATA_AUTH(410,"没有数据权限"),


    STARTTIME_BIGGER_THAN_ENDTIME(411,"开始时间不能大于结束时间"),
    STARTTIME_UNTIL_ENDTIME_OVER_THREE_MONTH(412,"时间间隔不能大于三个月"),
    TIME_REQUIRED(412,"时间查询范围必填"),
    NO_SUCH_DATA(413,"没有符合条件的数据"),
    
    SDC_BILL_NOT_EXIST(600,"操作失败！运单号在仓配通管理-运单查询列表不存在；"),
    SDC_BILL_HAVEN_CREATE(601,"操作失败！运单号状态是【已创建】不允许操作创建批次；"),
    SDC_BILL_HAVEN_NO_RIGHT(602,"操作失败！运单号发货仓：%s，您无该仓库的权限；"),
    RESPONSIBLE_QUERY_FALED(603,"负责人查询失败"),
    HANDOVER_AREA_NAME_DUPLICATED(604,"操作失败！同仓库下，交接区名称不能重复，请修改交接区名称。"),
    LOGIS_KIND_CAN_NOT_HAVE_MORE_USED_HANDOVER_AREA(605,"操作失败！该仓库下，物流公司类型：%s，已经在交接区：%s中，同仓库下一个物流公司类型不允许在多个交接区中，请修改交接区或物流公司类型。"),
    LEFT_NEVER_BIGGERTHAN_RIGHT(606,"左边必须小于等于右边"),
    SDC_LOGSICKIND_NOTEQUALS(607,"操作失败！运单号属于:%s,与批次所属:%s:物流公司不一致,不允许一起创建批次"),
    SDC_BATCHNO_NOT_EXIST(608,"操作失败！批次号在仓配通管理-批次管理列表不存在;"),
    SDC_BATCHNO_SOURCETYPE_ERROR(609,"操作失败！批次号来源系统是【泰坦】，不允许在【仓配通】操作继续添加；"),
    SDC_BATCHNO_BILLSTATUS_NOTCREATE(610,"操作失败！批次号状态是【已交接】，不允许继续添加；"),
    SDC_BATCHNO_INFO_NO_EXISTS(611,"操作失败！该批次号下不存在批次信息;"),
    SDC_BATCHNO_EXIST_HANDOVERAREA(612,"操作失败！批次号已经在交接区：%s 交接区中，不允许继续添加；"),
    SDC_BATCHNO_INPUT_NOTEXIST(613,"操作失败！批次号为空;不允许操作"),
    SDC_BILLNO_INPUT_NOTEXIST(614,"操作失败！请输入运单号"),
    SDC_BILLLIST_NOTEXIST(615,"操作失败！无运单流水批次信息！"),
    SDC_LOGSTICKIND_NOTEXIST(616,"操作失败！请勾选物流公司"),
    SDC_PARENT_INONEBATCH(617,"操作失败！子母件必须在一个批次中，运单号%s还未在该批次中"),
    SDC_PRAMHANDOVERNO_NOTEXIST(618,"操作失败！请输入交接区代码"),
    SDC_HANDOVERAREAINFO_NOTEXIST(619,"操作失败！交接区在仓配通管理-交接区管理列表不存在；"),
    SDC_HANDOVERAREA_USERDSTATUS(620,"操作失败！交接区状态是【停用】不允许操作摆入；"),
    SDC_BATCHNO_SEARCHFAILER(621,"操作失败！批次号查询失败"),
    SDC_BATCHNO_STATUS_ISHAVE(622,"操作失败！批次号当前状态为【已交接】，不允许操作移出；"),
    SDC_BATCHHAVE_HANDOVERAREA_EXIST(623,"操作失败！批次号已经在交接区：%s交接区中，不允许继续添加；"),
    SDC_BATCHHAVE_HANDOVERAREA_NOTEXIST(624,"操作失败！批次号未绑定交接区，无需操作移出；"),
    SDC_BATCHH_HANDOVERAREA_LOGISKIND_NOTEQUAL(625,"操作失败！批次号发货仓库属于：%s，您无该仓库的权限；"),
    SDC_BATCHH_STATUS_ISHANDOVER(626,"操作失败！批次号当前状态为【已交接】，不允许操作移出"),
    SDC_BATCHH_STATUS_ISNOTCREATE(627,"操作失败！批次号状态是【已交接】不允许操作交接；"),
    SDC_BATCHH_TYPE_ISNOTPILELINE(628,"操作失败！批次号不是流水线上,无法操作；"),
    SDC_NOT_HAVEHANDOVERINFO(629,"操作失败！无批次信息，请扫描批次号选择按那种方式交接"),
    SDC_NOT_INPUT_CARINFO(630,"操作失败！车牌号不为空"),
    SDC_HANDVOICESTATUS_ISHAVEOVER(631,"操作失败！交接单已完成交接，请勿重复操作"),
    SDC_BATCH_STATUS_NEVERCREATE(632,"操作失败！批次号状态不是【已创建】不允许操作交接；"),
    SDC_BATCHWULIU_AND_HANDOVERWULIU_NOT_EQUAL(633,"操作失败！批次号属于%s,物流公司，与交接单所属%s物流公司不一致，不允许一起交接"),
    SDC_BILL_HAVEN_NOTCREATE(634,"操作失败！运单号状态是【已交接】不允许操作交接"),
    SDC_BATCHNO_CREATFAILURE_NOAUTHORITY(635,"操作失败！批次发货仓库为%S，您无该仓库的权限；"),
    SDC_OPERATOR_FAILURE_NEVER_STORAGEINFO(636,"该用户无任何仓库信息"),
    SDC_OPERATOR_FAILURE_NEVER_LOGISTICINFO(637,"该用户无物流公司权限"),
    SDC_PARCEL_INONEBATCH(638,"操作失败！子母件必须在一个批次上，运单号 %s 还未在该批次中。"),
    SDC_STORAGE_NOT_EXIST(639,"操作失败！参数不合法需要带入仓库公司id信息"),
    SDC_NOT_INPUT_HANDOVERINVOVOICENO(640,"操作失败！交接号为空"),
    SDC_CARNO_ISHANDOVER(641,"操作失败！正在交接中的车牌，不允许新建交接单，请返回待交接批次页面，操作【继续交接】"),
    SDC_BATCH_ISNOT_BILLINFO(642,"操作失败！该批次号下无运单列表信息"),
    SDC_HANDOVER_IS(643,"操作失败！交接单已完成交接，请勿重复操作"),
    SDC_BILL_HAVEN_BINDING(643,"操作失败！运单号已创建，请勿重复绑定"),
    SDC_BILLNO_ISNOTIN_BATCH(644,"操作失败！运单号不属于该批次下的运单列表；"),
    SDC_BILLNO_ISNOTIN_LOGSTIC(645,"操作失败！该物流公司下无运单列表信息"),
    SDC_BILLNO_ISNOTIN_ORDERID(646,"操作失败！子母件必须在一个批次中，运单号%s还未在该批次中"),
    SDC_BILLSTATUS_ISNULL(646,"操作失败！运单状态为空;"),
    SDC_ORDER_INFO_NO_EXISTS(647,"操作失败！该运单号%s下的订单无运单列表信息;"),
    SDC_BATCH_INFO_EXISTSHANDOVER(648,"操作失败！该批次号已绑定%s交接单;请勿重复操作"),
    SDC_LOGSICKIND_NOTEQUALS_HANDOVER(649,"操作失败！批次号属于:%s不属于该交接区的物流公司类型，不允许操作摆入；"),
    SDC_HANDOVERED_TRUCKERROR(650,"操作失败！车牌号输入有误，批次均为保税仓；车牌须启用"),
    SDC_HANDOVER_NOTEXIST(651,"操作失败！交接单信息不存在"),
    SDC_HANDOVER_NOTEXIST_BATCH(651,"操作失败！交接单下无批次信息"),
    SDC_BATCH_LOGISKIND_QUAN(652,"操作失败！批次号物流公司类型为：%s您无该物流公司类型的权限；"),
    SDC_BATCH_HANDOVER_NOTEQUEAL(653,"操作失败！批次号属于%s物流公司，与交接单所属%s物流公司不一致，不允许一起交接；"),
    SDC_TRUCK_INPUTERROR(654,"操作失败！车牌号输入有误,批次为保税仓,请在车辆信息中维护"),
    SDC_TRUCK_BATCH_NOEQUAL(655,"操作失败！车牌号输入有误,与批次对应的物流公司类型不一致"),
    SDC_BATCHNO_STATUS_ISABORE(656,"操作失败！批次号当前状态为【已作废】，不允许操作移出；"),
    SDC_BATCHNO__ISHAND_EXISTS(657,"操作失败！批次号状态是【已交接】不允许移除批次;"),
    SDC_BATCHNO__ISHAND_EXISTSINFO(658,"操作失败！批次号已经在交接区：%s交接区中，不允许移除批次；"),
    SDC_BATCHNO__ISHAND_BINDHANDOVER(659,"操作失败！批次号在%s交接单已绑定请勿重复操作"),
    SDC_BATCHNO__ISHAND_PARCEL(660,"操作失败！批次号已交接,不允许再次包裹交接"),
    SDC_HANDOVERAREA__NOTEXISTS(660,"操作失败！交接区编号不在管理列表中"),
    SDC_BATCHINFO__HAVEABORT(661,"操作失败！批次信息已作废;不允许移除批次"),
    SDC_BILLNOT_INBATCH(662,"操作失败！运单状态为未创建，无需移除"),
    SDC_BILL_NOT_LOGSKINDID(663,"操作失败！运单号物流公司类型不存在"),
    WAREHOUSE_EMAIL_NOT_SET(1850,"未配置核放单接收邮箱，请配置后重新操作"),
    EXPORT_URLS_IS_NULL(1851,"导出数据为空"),
    THIS_VEHICLE_REGISTERED(1852,"操作失败！当前车辆已经维护过车辆信息，不允许重复添加！"),
    UPDATE_ASSEMBLY_LINE_FALES(1853,"更新运单的流水线批次失败！"),
    RECEIVER_WMS_BATCH_DETAIL_FALED(1854,"接受wms批次信息失败！"),
    VEHICLE_WEIGHT_SHOULD_BIGGER_THAN_ZERO(1855,"车辆自重需要大于0！"),
    STORAGE_IS_NECESSARY(1856,"发货仓库必选！"),

    ORDER_NOT_CURRENT_STORAGE(4010,"该订单不属于本揽运仓！"),
    ORDER_NOT_SUPORT_TRANS(4020,"此清关公司的国际物流模式为由自己负责国际运输，无法使用本揽运系统！"),
    ORDER_CANCEL_FILTER(4030,"该订单已取消或全额退款，请拦截！"),
    EXCEL_DOWNLOAD_FAIL(433,"excel下载失败"),
    BUSINESS_NO_IS_INVALID(419,"请输入有效的业务单号"),
    TRAY_NUM_IS_NOT_NULL(412,"保税调拨托盘数不能为0"),
    TRAY_NUM_NOT_EXCEED_WAIT_SCHULDE_NUM(413,"运输货量不能大于待调度货量"),
    VOLUME_NUM_NOT_EXCEED_WAIT_VOLUME_NUM(413,"运输体积不能大于待调度体积货量"),
    WEIGHT_NUM_NOT_EXCEED_WAIT_WEIGHT_NUM(413,"运输重量不能大于待调度重量货量"),
    VOLUME_NUM_IS_NOT_NULL(413,"普通运输体积数不能为0"),
    VEHICLEMODEL_INFO_IS_NOT_EXIST(414,"车型信息不存在"),
    SCHEDULE_ORDER_DATA_IS_NOT_EXIST(415,"调度单数据不存在"),
    TASK_NO_IS_NOT_NULL(420,"请至少选择一条运输任务"),
    ROUTE_FEE_INFO_IS_NOT_EXIST(421,"请在费率本中维护相关路线信息"),
    ROUTE_NOT_EXIST(423,"路线不存在"),
    BONDED_TRANSFERS_IS_NOT_SHARING(422,"保税与非保税业务类型不能拼车"),
    TASK_LOCK(428,"运输任务已经被调度台锁定,不能编辑"),
    USER_DOES_NOT_HAVE_DATA_RIGHTS(423,"用户没有数据权限"),
    SITE_INFO_IS_NOT_EXIST(424,"站点信息不存在"),
    REMARK_NOT_GREATER_THAN_ONE_HUNDRED(429,"备注最多100个汉字"),
    DIRECTION_ROUTE_FAIL(429,"调度台规划路线失败,请重试"),
    TASK_UN_LOCK_FAIL(430,"运输任务解锁失败请重试"),
    WAY_BILL_CANNOT_REPEAL(1900,"此运输单状态为保税调拨且需要报关，不能撤销"),
    WAY_BILL_CANNOT_EDIT_SCHEDUAL(1901,"此运输单状态为保税调拨不允许编辑运输任务"),
    BAG_ALREADY_TOTRUCK(1902,"集包重复装车"),
    BUSINESS_NO_NOT_LOAD(1903,"单号未装车"),
    SCHEDULE_TASK_HAVEN_DONE(1904,"调度台任务已处理"),
    TASK_HAVEN_DONE(1905,"运输任务%s刚被其他人操作改动过，请刷新调度台重新调度"),
    TIME_ISNULL(1904,"请选择查询时间段"),
    ES_MAX_SIZE_LIMITED_INSIDE_PAGE_THOUSAND(1905,"超过最大查询限制，最多可以查询前10000条数据（前1000页）"),
    ;


    public static ExceptionCode find(int code) {
        for (ExceptionCode ex : ExceptionCode.values()) {
            if (ex.intValue == code) {
                return ex;
            }
        }
        return DEFAULT_ERROR;
    }

    private int intValue;

    private String des;

    private ExceptionCode(int intValue, String des) {
        this.intValue = intValue;
        this.des = des;
    }

    public int intValue() {
        return this.intValue;
    }

    @Override
    public String toString() {
        return this.des;
    }

}