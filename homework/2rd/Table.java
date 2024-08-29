public class Table {
    public static void main(String[] args) {
        double a1=5;
        double a2=10;
        double a3=18;
        double b1=5699.0;
        double b2=8499.0;
        double b3=7199.0;
        double A=a1+a2+a3;
        double B=b1*a1+b2*a2+b3*a3;
        float size1 = 13.3f;
        float size2 = 14.0f;
        float size3 = 14.0f;
        System.out.println("----------------商场库存名单----------------");
        System.out.println("品牌型号"+"\t"+"尺寸"+"\t"+"价格"+"\t"+"库存数"+"\n" + "MacBOOKair"+ "\t"+ size1 +"\t"+ b1 +"\t" + a1 + "\n" + "ThinkPadT490"+ "\t"+size2+"\t"+ b2+"\t" + a2 + "\n"+"MateBook 14"+ "\t"+ size3 + "\t"+ b3 +"\t "+a3);
        System.out.println("------------------------------------------");
        System.out.println("总库存数："+A);
        System.out.println("商品库存总金额："+B);
    }
}
