# duoduoke-spring-boot-starter
多多客api

支持多多客商品、订单等api

导入包并修改DefaultDuoduokeClient类，改成自己应用的clientId clientSecret

使用：对于springboot项目，只需要注入duoduokeGoodsTemplate就可以方便的使用
@Autowired
private DuoduokeGoodsTemplate duoduokeGoodsTemplate;
