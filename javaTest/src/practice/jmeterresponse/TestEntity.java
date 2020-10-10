package practice.jmeterresponse;


import java.util.List;


public   class TestEntity {
    public String success;
    public String benefitSnapshotSeq;

    public int totalReducePrice;

//    public String extMap;

    public List<PromotionBenefitGroupVos> promotionBenefitGroupVos;

    public static class PromotionBenefitGroupVos {
        public String promotionSeq;
        public int promotionType;
        public String promotionUniqueKey;
        public int reducePrice;
        public int benefitType;
        public String name;
        public String available;
        public String message;
        public String unavailableCode;
        public List<ProductInfos> productInfos;

    }

    public static class ProductInfos {
        public String sellerId;
        public String skuSeq;
        public String spuSeq;
        public String storeId;
        public String logisticsType;
        public int skuNum;
        public int productPrice;
        public String paymentType;

    }

}

