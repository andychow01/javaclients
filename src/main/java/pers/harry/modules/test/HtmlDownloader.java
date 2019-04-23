package pers.harry.modules.test;

import java.io.IOException;
        import java.io.InputStream;
        import java.net.HttpURLConnection;
        import java.net.MalformedURLException;
        import java.net.URL;

public class HtmlDownloader {
    /**
     * 采用Java自带的HttpURLConnection,优点：方便，不用导入其他包
     * 缺点：在该方法中虽然对编码进行了转换，但是由于缓冲区大小的确定，如大小为1024字节，
     *  有可能会引起文字的切割不正确导致部分中文字乱码
     *
     * @param pageUrl
     * @param encoding
     * @return
     */
    public static String getHtml(String pageUrl, String encoding) {
        URL url = null;
        HttpURLConnection conn = null;
        InputStream in = null;
        StringBuffer sb = null;
        try {
            url = new URL(pageUrl);
            conn = (HttpURLConnection) url.openConnection();
            sb = new StringBuffer();
            if (conn.getResponseCode() == HttpURLConnection.HTTP_OK) {
                in = conn.getInputStream();
                byte[] buf = new byte[1024];
                int len = 0;
                while ((len = in.read(buf)) != -1)
                    sb.append(new String(buf, 0, len, encoding));
                in.close();
            } else System.err.println("network access error: " + conn.getResponseCode());
        } catch (MalformedURLException e) {
            System.err.println("url format wrong: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("IO error: " + e.getMessage());
        }
        return sb.toString();
    }

    // 各大搜索引擎巨头响应时间
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        String pageUrl = "https://www.baidu.com";
        //String pageUrl = "http://www.baidu.com/s?wd=养老金";     // 百度首页搜索
        //String pageUrl = "https://www.so.com/s?q=养老金";        // 360首页搜索
        //String pageUrl = "http://www.sogou.com/web?query=养老金";     // 搜狗首页搜索
        //String pageUrl = "http://www.baidu.com/s?rtt=1&bsst=1&cl=2&tn=news&rsv_dl=ns_pc&word=养老金";
                                                                             // 百度新闻搜索
        //String pageUrl = "https://news.so.com/ns?q=养老金&src=newhome";    // 360新闻搜索
        //String pageUrl = "https://news.sogou.com/news?query=养老金";       // 搜狗新闻搜索

        String encoding = "utf-8";
        String html = getHtml(pageUrl, encoding);
        System.out.println("Page len: " + html.length());
        System.out.println("Html: " + html);
        long endTime   = System.nanoTime();
        long totalTime = (endTime - startTime) / 1000000;
        System.out.println("totalTimeMillis: " + totalTime);
    }

}

