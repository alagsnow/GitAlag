package practice.jmeterresponse;

public class test {
    public static void main(String[] args) {
        String test = "{\"code\":\"SUCCESS\",\"data\":{\"extMap\":{},\"promotionBenefitGroupVos\":[{\"promotionSeq\":\"AurogonTestSPC4541106452558774316\",\"promotionType\":2,\"promotionUniqueKey\":\"PUK_1600999151057\",\"productInfos\":[{\"sellerId\":\"lvyx01\",\"skuSeq\":\"AurogonTestSKU4539778700782179352\",\"spuSeq\":\"AurogonTestSPU4539778700211754062\",\"storeId\":\"ella01\",\"logisticsType\":\"EMS\",\"class\":\"com.yy.aurogon.sales.aggregation.api.promotion.domain.ProductInfo\",\"skuNum\":1,\"productPrice\":1360,\"paymentType\":\"wechatPay\"},{\"sellerId\":\"lvyx01\",\"skuSeq\":\"AurogonTestSKU4539778691554710618\",\"spuSeq\":\"AurogonTestSPU4539778690279642191\",\"storeId\":\"ella01\",\"logisticsType\":\"EMS\",\"class\":\"com.yy.aurogon.sales.aggregation.api.promotion.domain.ProductInfo\",\"skuNum\":1,\"productPrice\":260,\"paymentType\":\"aliPay\"}],\"reducePrice\":190,\"benefitType\":2,\"name\":\"测试口令对接sl\",\"available\":true,\"message\":null,\"unavailableCode\":null,\"class\":\"com.yy.aurogon.sales.aggregation.api.promotion.domain.PromotionBenefitGroupVo\"},{\"promotionSeq\":\"AurogonTestSPC4541106452558774316\",\"promotionType\":2,\"promotionUniqueKey\":\"PUK28423648324737\",\"productInfos\":[{\"sellerId\":\"lvyx01\",\"skuSeq\":\"AurogonTestSKU4539778691554710618\",\"spuSeq\":\"AurogonTestSPU4539778690279642191\",\"storeId\":\"ella01\",\"logisticsType\":\"EMS\",\"class\":\"com.yy.aurogon.sales.aggregation.api.promotion.domain.ProductInfo\",\"skuNum\":1,\"productPrice\":1360,\"paymentType\":\"aliPay\"}],\"reducePrice\":160,\"benefitType\":2,\"name\":\"测试口令对接sl\",\"available\":true,\"message\":null,\"unavailableCode\":null,\"class\":\"com.yy.aurogon.sales.aggregation.api.promotion.domain.PromotionBenefitGroupVo\"}],\"success\":true,\"benefitSnapshotSeq\":\"AurogonTestSNP4541106540085516296\",\"class\":\"com.yy.aurogon.sales.aggregation.api.promotion.response.OrderPromotionBenefitBySnapshotResponse\",\"totalReducePrice\":350},\"message\":\"请求成功\",\"class\":\"com.yy.onepiece.commons.result.support.DefaultResult\"}";

//        ResponEntity responEntity = new Gson().fromJson(test, ResponEntity.class);
//        responEntity.data.promotionBenefitGroupVos.get(0).productInfos
        ResponEntity<TestEntity> testEntityResponEntity = SaleTestUtils.parseData(test, TestEntity.class);
        int productPrice = testEntityResponEntity.data.promotionBenefitGroupVos.get(0).productInfos.get(0).productPrice;

        String code  = testEntityResponEntity.code;
        System.out.println(productPrice);
        System.out.println(code);

    }


}
