package com.fwtai.app;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 填写并打包
 * @作者 田应平
 * @版本 v1.0
 * @创建时间 2019/1/5 16:27
 * @QQ号码 444141300
 * @Email service@dwlai.com
 * @官网 http://www.fwtai.com
*/
public final class Config{

    //这个是要拷贝的文件列表:YFJZN-666 首次登录强制备份数据库文件
    final static String[] files666 = {
            "D:\\workspace\\IdeaPreject\\yfjz\\target\\yfjz\\index.html",
            "D:\\workspace\\IdeaPreject\\yfjz\\target\\yfjz\\WEB-INF\\page\\sys\\header.html",
            "D:\\workspace\\IdeaPreject\\yfjz\\target\\yfjz\\statics\\js\\public\\index.js",
            "D:\\workspace\\IdeaPreject\\yfjz\\target\\yfjz\\statics\\js\\query.page.common.js",
            "D:\\workspace\\IdeaPreject\\yfjz\\target\\yfjz\\WEB-INF\\classes\\io\\yfjz\\controller\\backup\\BackupController.class",
            "D:\\workspace\\IdeaPreject\\yfjz\\target\\yfjz\\WEB-INF\\classes\\io\\yfjz\\controller\\sys\\SysLoginController.class",
            "D:\\workspace\\IdeaPreject\\yfjz\\target\\yfjz\\WEB-INF\\classes\\io\\yfjz\\service\\backup\\FileService.class",
            "D:\\workspace\\IdeaPreject\\yfjz\\target\\yfjz\\WEB-INF\\classes\\io\\yfjz\\service\\backup\\impl\\FileServiceImpl.class",
            "D:\\workspace\\IdeaPreject\\yfjz\\target\\yfjz\\WEB-INF\\classes\\io\\yfjz\\dao\\backup\\BackupDao.class",
            "D:\\workspace\\IdeaPreject\\yfjz\\target\\yfjz\\WEB-INF\\classes\\io\\yfjz\\utils\\ToolClient.class",
            "D:\\workspace\\IdeaPreject\\yfjz\\target\\yfjz\\WEB-INF\\classes\\io\\yfjz\\utils\\ToolString.class",
            "D:\\workspace\\IdeaPreject\\yfjz\\target\\yfjz\\WEB-INF\\classes\\sqlMapper\\backup\\BackupDao.xml",
            "D:\\workspace\\IdeaPreject\\yfjz\\target\\yfjz\\WEB-INF\\classes\\shell\\mysql_backup.sh",
    };

    //这个是要拷贝的文件列表:YFJZN-667儿童数量和完整数数量差一个儿童，但是各个儿童完整率室百分之百
    final static String[] files667 = {
            "D:\\workspace\\IdeaPreject\\yfjz\\target\\yfjz\\WEB-INF\\page\\statistics\\childGather.html",
            "D:\\workspace\\IdeaPreject\\yfjz\\target\\yfjz\\statics\\js\\statistics\\childGather.js",
            "D:\\workspace\\IdeaPreject\\yfjz\\target\\yfjz\\WEB-INF\\classes\\io\\yfjz\\dao\\child\\TChildInfoDao.class",
            "D:\\workspace\\IdeaPreject\\yfjz\\target\\yfjz\\WEB-INF\\classes\\io\\yfjz\\service\\child\\impl\\TChildInfoServiceImpl.class",
            "D:\\workspace\\IdeaPreject\\yfjz\\target\\yfjz\\WEB-INF\\classes\\io\\yfjz\\service\\child\\TChildInfoService.class",
            "D:\\workspace\\IdeaPreject\\yfjz\\target\\yfjz\\WEB-INF\\classes\\io\\yfjz\\controller\\child\\TChildInfoController.class",
            "D:\\workspace\\IdeaPreject\\yfjz\\target\\yfjz\\WEB-INF\\classes\\io\\yfjz\\controller\\report\\ExcelController.class",
            "D:\\workspace\\IdeaPreject\\yfjz\\target\\yfjz\\WEB-INF\\classes\\io\\yfjz\\controller\\reportprint\\ReportsPrintController.class",
            "D:\\workspace\\IdeaPreject\\yfjz\\target\\yfjz\\WEB-INF\\classes\\sqlMapper\\child\\TChildInoculateDao.xml",
            "D:\\workspace\\IdeaPreject\\yfjz\\target\\yfjz\\WEB-INF\\classes\\sqlMapper\\child\\ChildInoculateDao.xml",
            "D:\\workspace\\IdeaPreject\\yfjz\\target\\yfjz\\WEB-INF\\classes\\sqlMapper\\child\\TChildInfoDao.xml",
    };

    //这个是要拷贝的文件列表:YFJZN-667儿童数量和完整数数量差一个儿童，但是各个儿童完整率室百分之百
    final static String[] files685 = {
            "D:\\workspace\\IdeaPreject\\yfjz\\target\\yfjz\\statics\\js\\statistics\\childGather.js",
            "D:\\workspace\\IdeaPreject\\yfjz\\target\\yfjz\\statics\\js\\query.page.common.js",
            "D:\\workspace\\IdeaPreject\\yfjz\\target\\yfjz\\WEB-INF\\classes\\sqlMapper\\child\\TChildInfoDao.xml",
    };

    final static String[] files637 = {
            "D:\\workspace\\IdeaPreject\\yfjz\\target\\yfjz\\WEB-INF\\page\\statistics\\inoculationRate.html",
            "D:\\workspace\\IdeaPreject\\yfjz\\target\\yfjz\\WEB-INF\\classes\\sqlMapper\\statistics\\InoStatisticsDao.xml",
            "D:\\workspace\\IdeaPreject\\yfjz\\target\\yfjz\\reports\\recordPrint.jrxml",
            "D:\\workspace\\IdeaPreject\\yfjz\\target\\yfjz\\statics\\js\\statistics\\childGather.js",
            "D:\\workspace\\IdeaPreject\\yfjz\\target\\yfjz\\statics\\js\\statistics\\inoculationRate.js",
            "D:\\workspace\\IdeaPreject\\yfjz\\target\\yfjz\\WEB-INF\\classes\\io\\yfjz\\controller\\reportprint\\ReportsPrintController.class",
            "D:\\workspace\\IdeaPreject\\yfjz\\target\\yfjz\\WEB-INF\\classes\\io\\yfjz\\managerservice\\statistics\\InoStatisticsSerivce.class",
            "D:\\workspace\\IdeaPreject\\yfjz\\target\\yfjz\\WEB-INF\\classes\\io\\yfjz\\managerservice\\statistics\\impl\\InoStatisticsSerivceImpl.class",
            "D:\\workspace\\IdeaPreject\\yfjz\\target\\yfjz\\WEB-INF\\classes\\io\\yfjz\\service\\report\\ReportsPrintService.class",
            "D:\\workspace\\IdeaPreject\\yfjz\\target\\yfjz\\WEB-INF\\classes\\io\\yfjz\\service\\report\\/impl\\ReportsPrintServiceImpl.class",
            "D:\\workspace\\IdeaPreject\\yfjz\\target\\yfjz\\WEB-INF\\classes\\io\\yfjz\\dao\\statistics\\InoStatisticsDao.class",
    };

    final static String[] files686 = {
            "D:\\workspace\\IdeaPreject\\yfjz\\target\\yfjz\\WEB-INF\\page\\statistics\\inoculateRecordList.html",
            "D:\\workspace\\IdeaPreject\\yfjz\\target\\yfjz\\statics\\js\\statistics\\inoculateRecordList.js",
            "D:\\workspace\\IdeaPreject\\yfjz\\target\\yfjz\\WEB-INF\\classes\\io\\yfjz\\controller\\child\\TChildInoculateController.class",
            "D:\\workspace\\IdeaPreject\\yfjz\\target\\yfjz\\WEB-INF\\classes\\io\\yfjz\\entity\\child\\TChildInoculateEntity.class",
            "D:\\workspace\\IdeaPreject\\yfjz\\target\\yfjz\\WEB-INF\\classes\\io\\yfjz\\service\\child\\TChildInoculateService.class",
            "D:\\workspace\\IdeaPreject\\yfjz\\target\\yfjz\\WEB-INF\\classes\\io\\yfjz\\service\\child\\impl\\TChildInoculateServiceImpl.class",
            "D:\\workspace\\IdeaPreject\\yfjz\\target\\yfjz\\WEB-INF\\classes\\io\\yfjz\\dao\\child\\TChildInoculateDao.class",
            "D:\\workspace\\IdeaPreject\\yfjz\\target\\yfjz\\WEB-INF\\classes\\sqlMapper\\child\\TChildInoculateDao.xml",
    };
//D:\workspace\out\yfjzplatform\\statics\js\calendar\calendar\
    final static String[] files = {
            "D:\\workspace\\yfjz_platform\\target\\yfjzplatform\\WEB-INF\\page\\inoculation\\inoculation_point.html",
            "D:\\workspace\\yfjz_platform\\target\\yfjzplatform\\statics\\js\\calendar\\bootstrap.css",
            "D:\\workspace\\yfjz_platform\\target\\yfjzplatform\\statics\\js\\calendar\\bootstrap-datepicker.css",
            "D:\\workspace\\yfjz_platform\\target\\yfjzplatform\\statics\\js\\calendar\\bootstrap-datepicker.js",
            "D:\\workspace\\yfjz_platform\\target\\yfjzplatform\\statics\\js\\calendar\\bootstrap-datepicker.zh-CN.min.js",
            "D:\\workspace\\yfjz_platform\\target\\yfjzplatform\\statics\\js\\calendar\\bootstrap-datepicker-lunar-plugin.js",
            "D:\\workspace\\yfjz_platform\\target\\yfjzplatform\\statics\\js\\calendar\\LunarCalendar.js",
            "D:\\workspace\\yfjz_platform\\target\\yfjzplatform\\statics\\js\\basesettings\\inoculationday_tabs.js",

            "D:\\workspace\\yfjz_platform\\target\\yfjzplatform\\WEB-INF\\classes\\sqlMapper\\basesetting\\TBaseDaySettingDao.xml",
            "D:\\workspace\\yfjz_platform\\target\\yfjzplatform\\WEB-INF\\classes\\io\\yfjz\\service\\basesetting\\TBaseDaySettingService.class",
            "D:\\workspace\\yfjz_platform\\target\\yfjzplatform\\WEB-INF\\classes\\io\\yfjz\\service\\basesetting\\impl\\TBaseDaySettingServiceImpl.class",
            "D:\\workspace\\yfjz_platform\\target\\yfjzplatform\\WEB-INF\\classes\\io\\yfjz\\service\\basesetting\\impl\\TBaseDaySettingServiceImpl$1.class",
            "D:\\workspace\\yfjz_platform\\target\\yfjzplatform\\WEB-INF\\classes\\io\\yfjz\\service\\basesetting\\impl\\TBaseDaySettingServiceImpl$2.class",
            "D:\\workspace\\yfjz_platform\\target\\yfjzplatform\\WEB-INF\\classes\\io\\yfjz\\service\\basesetting\\impl\\TBaseDaySettingServiceImpl$3.class",
            "D:\\workspace\\yfjz_platform\\target\\yfjzplatform\\WEB-INF\\classes\\io\\yfjz\\controller\\inocpointmgr\\TBaseDaySettingController.class",
            "D:\\workspace\\yfjz_platform\\target\\yfjzplatform\\WEB-INF\\classes\\io\\yfjz\\dao\\basesetting\\TBaseDaySettingDao.class",
    };

    final static String jira = "YFJZN-39";
    final static String version = "SVN686";

    //每次的更新说明  增量包发布说明内容，直接写入说明文件
    static String introduction = jira + "\t\n增加按农历具体日期安排接种" +
            "";
    //需要改为自己的保存路径 YFJZN-37	平台菜单与门诊菜单分离功能研发
    static String base = "D:\\workspace\\out\\";
    static String selfbase = base + "田应平【贵州数字化预防接种平台】";//贵州数字化预防接种系统

    static String updateFile = base + "更新说明.txt";
    static String basePath = base + "yfjzplatform\\";
    //预防接种的项目物理路径target所在的路径,需要改为自己的保存路径
    //static String targetPath = "D:\\\\workspace\\\\IdeaPreject\\\\yfjz\\\\target\\\\yfjz";
    static String targetPath = "D:\\\\workspace\\\\yfjz_platform\\\\target\\\\yfjzplatform";
    //拷贝到历史接种记录里
    static String zipBasePath = base + "tmp.zip";
    static String lastVersionPath = selfbase + "--" + jira + "--" + version + "--" + new SimpleDateFormat("yyyyMMddHHmmss").format(new Date()) + ".zip";

    public static void main(String[] args) throws Exception {
        PackageUtils.createDirtories();
    }
}