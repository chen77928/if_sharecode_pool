package cn.imzjw.code;

import cn.imzjw.code.entity.JsonVo;
import cn.imzjw.code.util.HttpUtils;
import com.alibaba.fastjson.JSON;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

/**
 * @author https://blog.imzjw.cn
 * @date 2021/6/24 10:35
 */
public class Run {

    /**
     * 获取日志记录器对象
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(Run.class);

    public static void main(String[] args) {
        List<String> beanList = new ArrayList<>();
        List<String> farmList = new ArrayList<>();
        List<String> healthList = new ArrayList<>();
        List<String> jxFactoryList = new ArrayList<>();
        List<String> petList = new ArrayList<>();
        List<String> sgmhList = new ArrayList<>();
        List<String> cfdList = new ArrayList<>();
        List<String> ddFactoryList = new ArrayList<>();

        // =============================种豆得豆=============================
        for (String beans : args[0].split("&")) {
            // 存入种豆得豆容器中
            beanList.add(beans);
        }
        // 助力池中是否包含自己的助力码
        boolean isTrue = false;
        // json 数据
        String jsonData = null;
        jsonData = HttpUtils.sendGet("http://api.sharecode.ga/api/bean/1500");
        String msg = "";
        msg += "=============种豆得豆互助码=============\n";
        for (int i = 0; i < beanList.size(); i++) {
            isTrue = JSON.parseObject(jsonData, JsonVo.class).getData().contains(beanList.get(i));
            LOGGER.info("种豆得豆互助码【" + beanList.get(i) + "】 是否包含在助力池中：" + isTrue);
            msg += "【" + beanList.get(i) + "】";
        }
        msg += "\n是否包含在助力池中：" + isTrue + "\n";

        // =============================东东农场=============================

        for (String farms : args[1].split("&")) {
            farmList.add(farms);
        }
        jsonData = HttpUtils.sendGet("http://api.sharecode.ga/api/farm/1500");
        msg += "\n=============东东农场互助码=============\n";
        for (int i = 0; i < farmList.size(); i++) {
            isTrue = JSON.parseObject(jsonData, JsonVo.class).getData().contains(farmList.get(i));
            LOGGER.info("东东农场互助码【" + farmList.get(i) + "】 是否包含在助力池中：" + isTrue);
            msg += "【" + farmList.get(i) + "】";
        }
        msg += "\n是否包含在助力池中：" + isTrue + "\n";

        // =============================健康社区=============================

        for (String health : args[2].split("&")) {
            healthList.add(health);
        }
        jsonData = HttpUtils.sendGet("http://api.sharecode.ga/api/health/1500");
        msg += "\n=============健康社区互助码=============\n";
        for (int i = 0; i < healthList.size(); i++) {
            isTrue = JSON.parseObject(jsonData, JsonVo.class).getData().contains(healthList.get(i));
            LOGGER.info("健康社区互助码【" + healthList.get(i) + "】 是否包含在助力池中：" + isTrue);
            msg += "【" + healthList.get(i) + "】";
        }
        msg += "\n是否包含在助力池中：" + isTrue + "\n";

        // =============================京喜工厂=============================

        for (String jxfactory : args[3].split("&")) {
            jxFactoryList.add(jxfactory);
        }
        jsonData = HttpUtils.sendGet("http://api.sharecode.ga/api/jxfactory/1500");
        msg += "\n=============京喜工厂互助码=============\n";
        for (int i = 0; i < jxFactoryList.size(); i++) {
            isTrue = JSON.parseObject(jsonData, JsonVo.class).getData().contains(jxFactoryList.get(i));
            LOGGER.info("京喜工厂互助码【" + jxFactoryList.get(i) + "】 是否包含在助力池中：" + isTrue);
            msg += "【" + jxFactoryList.get(i) + "】";
        }
        msg += "\n是否包含在助力池中：" + isTrue + "\n";

        // =============================东东萌宠=============================

        for (String pet : args[4].split("&")) {
            petList.add(pet);
        }
        jsonData = HttpUtils.sendGet("http://api.sharecode.ga/api/pet/1500");
        msg += "\n=============东东萌宠互助码=============\n";
        for (int i = 0; i < petList.size(); i++) {
            isTrue = JSON.parseObject(jsonData, JsonVo.class).getData().contains(petList.get(i));
            LOGGER.info("东东萌宠互助码【" + petList.get(i) + "】 是否包含在助力池中：" + isTrue);
            msg += "【" + petList.get(i) + "】";
        }
        msg += "\n是否包含在助力池中：" + isTrue + "\n";

        // =============================闪购盲盒=============================

        for (String sgmh : args[5].split("&")) {
            sgmhList.add(sgmh);
        }
        jsonData = HttpUtils.sendGet("http://api.sharecode.ga/api/sgmh/1500");
        msg += "\n=============闪购盲盒互助码=============\n";
        for (int i = 0; i < sgmhList.size(); i++) {
            isTrue = JSON.parseObject(jsonData, JsonVo.class).getData().contains(sgmhList.get(i));
            LOGGER.info("闪购盲盒互助码【" + sgmhList.get(i) + "】 是否包含在助力池中：" + isTrue);
            msg += "【" + sgmhList.get(i) + "】";
        }
        msg += "\n是否包含在助力池中：" + isTrue + "\n";

        // =============================财富岛=============================

        for (String cfd : args[6].split("&")) {
            cfdList.add(cfd);
        }
        jsonData = HttpUtils.sendGet("http://api.sharecode.ga/api/jxcfd/1500");
        msg += "\n=============财富岛互助码=============\n";
        for (int i = 0; i < cfdList.size(); i++) {
            isTrue = JSON.parseObject(jsonData, JsonVo.class).getData().contains(cfdList.get(i));
            LOGGER.info("财富岛互助码【" + cfdList.get(i) + "】 是否包含在助力池中：" + isTrue);
            msg += "【" + cfdList.get(i) + "】";
        }
        msg += "\n是否包含在助力池中：" + isTrue + "\n";

        // =============================东东工厂=============================

        for (String ddFactory : args[7].split("&")) {
            ddFactoryList.add(ddFactory);
        }
        jsonData = HttpUtils.sendGet("http://api.sharecode.ga/api/ddfactory/1500");
        msg += "\n=============东东工厂互助码=============\n";
        for (int i = 0; i < ddFactoryList.size(); i++) {
            isTrue = JSON.parseObject(jsonData, JsonVo.class).getData().contains(ddFactoryList.get(i));
            LOGGER.info("东东工厂互助码【" + ddFactoryList.get(i) + "】 是否包含在助力池中：" + isTrue);
            msg += "【" + ddFactoryList.get(i) + "】";
        }
        msg += "\n是否包含在助力池中：" + isTrue;

        LOGGER.info("开始进行 Telegram 推送");
        try {
            msg = URLEncoder.encode(msg, "UTF-8");
            HttpUtils.sendGet("https://api.telegram.org/bot" + args[8] + "/sendMessage?" + "chat_id=" + args[9] + "&text=" + msg);
        } catch (UnsupportedEncodingException e) {
            LOGGER.error("tg 发送失败 -> " + e);
        }

    }
}
