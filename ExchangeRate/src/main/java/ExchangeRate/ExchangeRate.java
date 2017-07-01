package ExchangeRate;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 功能：分析从今天开始过去30天时间里，中国人民银行公布的人民币汇率中间价，得到人民币对美元、欧元、港币的汇率，
 *       形成excel文件输出。汇率数据找相关的数据源，自己爬数据分析
 *作者：Yung
 * 时间：2016-12-27
 */
public class ExchangeRate
{
    public static void main( String[] args )
    {
        List<RateBean> rateData=ExtractData.getRateData(CatchlPage.getHtml("http://www.chinamoney.com.cn/fe-c/historyParity.do"));
        WriteDataToExcel.write(rateData,"C:\\Users\\yangyening\\Desktop\\RateData.xls");

    }
}