## 写在前面

因为助力池那个每六小时进行检测并删除白嫖上车的，我怕被误删了不太放心，才有了这个项目！

首先这个代码写的是很垃圾，我自己都看不下去了，但为了节约时间（这项目写完都不到半个钟），没进行封装，也没用枚举、泛型、多态，而且全都在 `main` 方法里 🤣，但是最重要的一点，他能实现功能啊，所以就不管了，后续有时间优化一下或者重构吧！

## 使用

1. fork 项目
2. 在 `Settings -> Secrets -> New repository secret` 添加环境变量，环境变量说明见下方
3. 然后修改 code.txt，随便加点什么东西

## 环境变量说明

| 变量名         | 含义                                                         | 是否必须 |
| -------------- | ------------------------------------------------------------ | -------- |
| BEAN_CODE      | 种豆得豆互助码，多个请使用 `&` 分割<br>例如 xxxxxxxx&xxxxxxxx | 是       |
| FARM_CODE      | 东东农场互助码，多个请使用 `&` 分割<br/>例如 xxxxxxxx&xxxxxxxx | 是       |
| HEALTH_CODE    | 健康社区互助码，多个请使用 `&` 分割<br/>例如 xxxxxxxx&xxxxxxxx | 是       |
| JXFACTORY_CODE | 京喜工厂互助码，多个请使用 `&` 分割<br/>例如 xxxxxxxx&xxxxxxxx | 是       |
| PET_CODE       | 东东萌宠互助码，多个请使用 `&` 分割<br/>例如 xxxxxxxx&xxxxxxxx | 是       |
| SGMH_CODE      | 闪购盲盒互助码，多个请使用 `&` 分割<br/>例如 xxxxxxxx&xxxxxxxx | 是       |
| CFD_CODE       | 财富岛互助码，多个请使用 `&` 分割<br/>例如 xxxxxxxx&xxxxxxxx | 是       |
| DDFACTORY_CODE | 东东工厂互助码，多个请使用 `&` 分割<br/>例如 xxxxxxxx&xxxxxxxx | 是       |
| BOTTOKEN       | Telegram Bot 的 Token，在 [@BotFather](https://t.me/BotFather) 可找到，没有的自己 Google 创建一个就好啦<br> 例如 13526677282:AAHizJsDqaTKASD808Oi33L8XPARZ8kmZb8 | 是       |
| CHAT_ID        | 给 [@userinfobot](https://t.me/userinfobot) 随便发条消息就有了<br/> 例如 1334649619 | 是       |

# 通知结果
